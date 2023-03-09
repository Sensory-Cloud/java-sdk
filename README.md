[![](https://jitpack.io/v/Sensory-Cloud/java-sdk.svg)](https://jitpack.io/#Sensory-Cloud/java-sdk)

# Sensory Cloud Java SDK

This repository contains the source code for the Sensory Cloud Java SDK.

## General Information

Before getting started, you must spin up a Sensory Cloud inference server or have Sensory spin one up for you. You must also have the following pieces of information:

- Your inference server URL
- Your Sensory Tenant ID (UUID)
- Your Sensory Cloud API token

## Integration

The Java SDK is available via [JitPack.io](https://jitpack.io/#Sensory-Cloud/java-sdk). Jitpack can be easily integrated by first adding their repository to the root `build.gradle` file:

```Java
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Now that the repository has been added, just add the dependency to `build.gradle`

```Java
dependencies {
    implementation "io.grpc:grpc-protobuf:1.47.0"
    implementation "io.grpc:grpc-stub:1.47.0"
    implementation 'com.github.Sensory-Cloud:java-sdk:v1.0.0'
}
```

# Examples

## Secure Credential Store

`SecureCredentialStore` is an interface for saving and retrieving OAuth credentials (clientID and clientSecret). You will have to provide your own implementation of `SecureCredentialStore`.
It is expected that the values stored in the `SecureCredentialStore` are persisted between application reboots.

A basic example for using `SecureCredentialStore` (pseudocode) involves some kind of database storing and retrieving records.

```Java
public class SecureCredentialStoreImpl implements SecureCredentialStore
{
    private DatabaseConnection db;
    public SecureCredentialStoreImpl(DatabaseConnection db) {
        this.db = db;
    }
    
    @Override
    public void setCredentials(String clientId, String secret) throws Exception {
        this.db.setClientId(clientId);
        this.db.setClientSecret(secret);
    }
    
    @Override
    public Optional<String> getClientId() throws Exception {
        this.db.getClientId();
    }

    @Override
    public Optional<String> getClientSecret() throws Exception {
        this.db.getClientSecret();
    }
    
    @Override
    public void saveData(String id, byte[] data) throws Exception {
        this.db.saveData(id, data);
    }
    
    @Override
    public Optional<byte[]> loadData(String id) throws Exception {
        this.db.loadData(id);
    }
    
    @Override
    public void deleteData(String id) throws Exception {
        this.db.delete(id);
    }
}
```

## SDK Initialization

The SDK must be explicitly initialized every time the application is booted. This initialization sets up internal configurations and will also enroll the device into the Sensory Cloud server if the device has not been previously enrolled. SDK initialization is completed by calling `Initializer.initialize(...)`. There are two versions of this function. One that takes in an explicit configuration object, and one that takes in a file input stream to a config file. The following configurations are set during initialization:
- fullyQualifiedDomainName: This is the fqdn of the Sensory Cloud server to communicate with
- tenantID: The unique identifier (UUID) for your Sensory Cloud tenant
- enrollmentType: The amount of security required for device enrollment. This should be one of `none`, `sharedSecret` or `jwt`. If the device has already been enrolled during a previous app session, this field is ignored
- credential: The credential required for device enrollment, the value depends on the enrollment type:
    - `none` enrollmentType: credential should be an empty string
    - `sharedSecret` enrollmentType: credential should be the shared secret (password)
    - `jwt` enrollmentType: credential should be a hex string of the enrollment private key

  If the device has already been enrolled during a previous app session, this field is ignored
- deviceID: A unique device identifier (UUID)
- deviceName: The friendly name of the device

The Java SDK accepts config files in the `ini` format. Example config files can be found under `SensoryCloud/src/test/resources/`. The below example shows how to initialize the SDK from a config file

 ```Java
class InitializationExample {
    public static void main(String[] args) {
        // It is up to you to implement the SecureCredentialStore
        CustomerImplementedSecureCredentialStore credentialStore = new CustomerImplementedSecureCredentialStore();
        OAuthService oAuthService = new OAuthService(credentialStore);

        InputStream fileStream = this.getClass().getClassLoader().getResourceAsStream("SensoryCloudConfig.ini");
        Initializer.initialize(
            oauthService,
            null, // JWT signer class, only used when enrollmentType is `jwt`
            fileStream,
            "", // Optional override for deviceID, useful when sharing config files across multiple servers
            "", // Optional override for deviceName, useful when sharing config files across multiple servers
            new OAuthService.EnrollDeviceListener() {
                @Override
                public void onSuccess(DeviceResponse response) {
                    // SDK has been successfully initialized and the device has been enrolled
                    // `response` may be null if the device has previously been enrolled
                }

                @Override
                public void onFailure(Throwable t) {
                    // Handle error during SDK initialization
                }
            }
        );
    }
}
 ```

## Creating a Token Manager

The `TokenManager` class handles refreshing OAuth tokens as they expire. This will be passed into other services that require authorization to access.

```Java
class TokenManagerExample {
    public static void main(String[] args) {
        // It is up to you to implement the SecureCredentialStore
        CustomerImplementedSecureCredentialStore credentialStore = new CustomerImplementedSecureCredentialStore();

        OAuthService oAuthService = new OAuthService(credentialStore);
        TokenManager tokenManager = new TokenManager(oAuthService);

        String OAuthToken = tokenManager.getAccessToken();
    }
}
```

## Checking Server Health

It's important to check the health of you Sensory Inference server. You can do so via the following:

```Java
class ServerHealthExample {
    public static void main(String[] args) {
        // First ensure the SDK has been initialized

        HealthService healthService = new HealthService();
        healthService.getHealth(new HealthService.GetHealthListener() {
            @Override
            public void onSuccess(ServerHealthResponse response) {
                // Process health response
            }

            @Override
            public void onFailure(Throwable t) {
                // Server error occurred
            }
        });
    }
}
```

## Audio Methods

### Creating an Audio Service

`AudioService` provides methods to stream audio to Sensory Cloud. It is recommended to only have 1 instance of `AudioService` 

```Java
class AudioServiceExample {
    public static void main(String[] args) {
        AudioService audioService = new AudioService(tokenManager);
    }
}
```

### Obtaining Audio Models

Certain audio models are available to your application depending on the models that are configured in your instance to Sensory Cloud. In order to determine which audio models are accessible to you, you can execute the following:

```Java
class AudioModelsExample {
    public static void main(String[] args) {
        AudioService audioService = getAudioService();

        audioService.getModels(new AudioService.GetModelsListener() {
            @Override
            public void onSuccess(GetModelsResponse response) {
                response.getModelsList();
            }

            @Override
            public void onFailure(Throwable t) {
                // Handle server error
            }
        });
    }
}
```

Audio models contain the following properties:

- Name - the unique name tied to this model. Used when calling any other audio function.
- IsEnrollable - indicates if the model can be enrolled into. Models that are enrollable can be used in the CreateEnrollment function.
- ModelType - indicates the class of model and its general function.
- FixedPhrase - for speech-based models only. Indicates if a specific phrase must be said.
- SampleRate - indicates the audio sample rate required by this model. Generally, the number will be 16000.
- IsLivenessSupported - indicates if this model supports liveness for enrollment and authentication. Liveness provides an added layer of security by requiring a users to speak random digits.

### Enrolling with Audio

In order to enroll with audio, you must first ensure you have an enrollable model enabled for your Sensory Cloud instance. This can be obtained via the `getModels` request. Enrolling with audio uses a bi-directional streaming pattern to allow immediate feedback to the user during enrollment. It is important to save the `enrollmentID` in order to perform authentication against it in the future.

```Java
class AudioEnrollmentExample {
    public static void main(String[] args) {
        // Get basic enrollment information
        String modelName = "wakeword-16kHz-open_sesame.ubm";
        String userID = "72f286b8-173f-436a-8869-6f7887789ee9";
        String enrollmentDescription = "My Enrollment";
        boolean isLivenessEnabled = false;

        // boolean to control audio streaming
        AtomicBoolean isRecording = new AtomicBoolean(false);

        // Open the grpc stream
        StreamObserver<CreateEnrollmentRequest> requestObserver = audioService.createEnrollment(
                modelName,
                userID,
                "",
                enrollmentDescription,
                isLivenessEnabled,
                0, 0,
                new StreamObserver<CreateEnrollmentResponse>() {
                    @Override
                    public void onNext(CreateEnrollmentResponse value) {
                        // The response contains information about the enrollment status.
                        // * audioEnergy
                        // * percentComplete
                        // For enrollments with liveness, there are two additional fields that are populated.
                        // * modelPrompt - indicates what the user should say in order to proceed with the enrollment.
                        // * sectionPercentComplete - indicates the percentage of the current ModelPrompt that has been spoken.
                        // EnrollmentId will be populated once the enrollment is complete
                        if( value.getEnrollmentId() != "" ) {
                            // Enrollment is complete
                            isRecording.set(false);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle Server error
                    }

                    @Override
                    public void onCompleted() {
                        // Handle the grpc stream closing
                        isRecording.set(false);
                    }
                }
        );

        // Start Audio Processing
        // Here, you are required to populate the audio variable with data.
        // Data length per request should be kept below 80Kb        
        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                isRecording.set(true);
                while(isRecording.get()) {
                    try {
                        ByteString audio = customerImplementedAudioGetter();
                        // (Make sure you use the proper type for the grpc stream you're using)
                        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                                .setAudioContent(audio)
                                .build();
                        requestObserver.onNext(request);
                    } catch (Exception e) {
                        // Handle errors (usually `InterruptedException` on the audioQueue.take call)
                    }
                }
                // Close the grpc stream once you finish recording;
                requestObserver.onCompleted();
            }
        });
        mThread.start();
    }
}
```

### Authenticating with Audio

Authenticating with audio is similar to enrollment, except now you pass in an enrollmentID instead of the model name.

```Java
class AudioAuthenticationExample {
    public static void main(String[] args) {
        // Get basic enrollment information
        String enrollmentID = "436ee716-346e-4066-8c28-7b5ef192831f";
        boolean isLivenessEnabled = false;

        // Open the grpc stream
        StreamObserver<AuthenticateRequest> requestObserver = audioService.authenticate(
                AudioService.EnrollmentType.ENROLLMENT_ID,
                enrollmentID,
                "",
                isLivenessEnabled,
                new StreamObserver<AuthenticateResponse>() {
                    @Override
                    public void onNext(AuthenticateResponse value) {
                        // the response contains information about the authentication audio such as:
                        // * audioEnergy
                        // For authentications with liveness, there are two additional fields that are populated.
                        // * modelPrompt - indicates what the user should say in order to proceed with the authentication.
                        // * sectionPercentComplete - indicates the percentage of the current ModelPrompt that has been spoken.
                        if ( value.getSuccess() ) {
                            // Successful authentication!
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle server error
                    }

                    @Override
                    public void onCompleted() {
                        // Handle grpc stream close
                    }
                }
        );

// Start Audio Processing
// See audio enrollment example for details
    }
}
```

### Audio Events

Audio events are used to recognize specific words, phrases, or sounds.

```Java
class AudioEventsExample {
    public static void main(String[] args) {
        String userId = "72f286b8-173f-436a-8869-6f7887789ee9";
        String modelName = "wakeword-16kHz-open_sesame.ubm";

        // Open the grpc stream
        StreamObserver<ValidateEventRequest> requestObserver = audioService.validateTrigger(
                modelName,
                userId,
                "",
                // Determines how sensitive the model should be to false accepts
                ThresholdSensitivity.MEDIUM,
                new StreamObserver<ValidateEventResponse>() {
                    @Override
                    public void onNext(ValidateEventResponse value) {
                        // the response will contain the following if the event was recognized
                        // * resultId - indicating the name of the event that was recognized
                        // * score - Sensory's confidence in the result
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle server error
                    }

                    @Override
                    public void onCompleted() {
                        // Handle grpc stream close
                    }
                }
        );

        // Start Audio Processing
        // See audio enrollment example for details
        
        // The SDK implementer can decide when they want to close the audio stream by calling
        requestObserver.onCompleted();
    }
}
```

### Transcription

Transcription is used to convert audio into text.

```Java
class AudioTranscriptionExample {
    public static void main(String[] args) {
        String userId = "72f286b8-173f-436a-8869-6f7887789ee9";
        String modelName = "speech_recognition_en";
        int audioChunkSize = 1024; // 1kb Audio Chunk Size
        AtomicBoolean isTranscribing = new AtomicBoolean(true);
        TranscriptAggregator aggregator = new TranscriptAggregator();

        SecureCredentialStorageExample credentialStore = new SecureCredentialStorageExample();

        OAuthService oAuthService = new OAuthService(credentialStore);
        TokenManager tokenManager = new TokenManager(oAuthService);
        AudioService audioService = new AudioService(tokenManager);

        // Load data from file. Data MUST be in linear16 PCM format. 16KHz.
        String filePath = "/Users/bryanmcgrane/Downloads/20211230T174226.165Z.raw";

        // Check server health
        HealthService healthService = new HealthService();
        healthService.getHealth(new HealthService.GetHealthListener() {
            @Override
            public void onSuccess(ServerHealthResponse serverHealthResponse) {
                System.out.println(serverHealthResponse);
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });

        // Open the grpc stream
        StreamObserver<TranscribeRequest> requestObserver = audioService.transcribeAudio(
                modelName,
                userId,
                "",
                new StreamObserver<TranscribeResponse>() {
                    @Override
                    public void onNext(TranscribeResponse value) {
                        // Response contains information about the audio such as:
                        // * audioEnergy

                        // The transcript aggregator will collect all the server responses and save a full transcript
                        aggregator.processResponse(value.getWordList());
                        String transcript = aggregator.getTranscript();
                        if (value.getPostProcessingAction().getAction().equals(AudioPostProcessingAction.FINAL)) {
                            System.out.println("Final Result: " + transcript);
                            isTranscribing.set(false);
                        } else {
                            System.out.println("Partial Result: " + transcript);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle server error
                        t.printStackTrace();
                        isTranscribing.set(false);
                    }

                    @Override
                    public void onCompleted() {
                        // Handle grpc stream close
                        isTranscribing.set(false);
                    }
                }
        );

        // Start Audio Recording
        // See audio enrollment example for details
        Thread mThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try (RandomAccessFile file = new RandomAccessFile(filePath, "r")) {
                    // Buffer size is 1024
                    ByteBuffer buffer = ByteBuffer.allocate(audioChunkSize);
                    FileChannel inChannel = file.getChannel();
                    while (inChannel.read(buffer) > 0) {
                        buffer.flip();
                        TranscribeRequest request = TranscribeRequest.newBuilder()
                                .setAudioContent(ByteString.copyFrom(buffer))
                                .build();
                        requestObserver.onNext(request);

                        buffer.clear(); // do something with the data and clear/compact it.
                    }
                }
                catch (Exception e) {
                    // Handle errors (usually `InterruptedException` on the audioQueue.take call)
                    e.printStackTrace();
                    requestObserver.onCompleted();
                }

                TranscribeRequest request = TranscribeRequest.newBuilder()
                        .setPostProcessingAction(
                                AudioRequestPostProcessingAction.newBuilder()
                                        .setAction(AudioPostProcessingAction.FINAL)
                                        .build()
                        )
                        .setAudioContent(ByteString.EMPTY)
                        .build();
                requestObserver.onNext(request);
            }
        });
        mThread.start();
        while (isTranscribing.get()) {}
        requestObserver.onCompleted();
    }
}
```

## Video Methods

### Creating a Video Service

`VideoService` provides methods to stream images to Sensory Cloud. It is recommended to only have 1 instance of `VideoService` 

```Java
class VideoServiceExample {
    public static void main(String[] args) {
        VideoService videoService = new VideoService(tokenManager);
    }
}
```

### Obtaining Video Models

Certain video models are available to your application depending on the models that are configured for your instance of Sensory Cloud. In order to determine which video models are accessible to you, you can execute the following:

```Java
class VideoModelsExample {
    public static void main(String[] args) {
        VideoService videoService = getVideoService();

        videoService.getModels(new VideoService.GetModelsListener() {
            @Override
            public void onSuccess(GetModelsResponse response) {
                response.getModelsList();
            }

            @Override
            public void onFailure(Throwable t) {
                // Handle server error
            }
        });
    }
}
```

Video models contain the following properties:

- Name - the unique name tied to this model. Used when calling any other video function.
- IsEnrollable - indicates if the model can be enrolled into. Models that are enrollable can be used in the CreateEnrollment function.
- ModelType - indicates the class of model and its general function.
- FixedObject - for recognition-based models only. Indicates if this model is built to recognize a specific object.
- IsLivenessSupported - indicates if this model supports liveness for enrollment and authentication. Liveness provides an added layer of security.

### Enrolling with Video

In order to enroll with video, you must first ensure you have an enrollable model enabled for your Sensory Cloud instance. This can be obtained via the `getModels` request. Enrolling with video uses a call and response streaming pattern to allow immediate feedback to the user during enrollment. It is important to save the enrollmentID in order to perform authentication against it in the future.

```Java
class VideoEnrollmentExample {
    public static void main(String[] args) {
        // Get basic enrollment information
        String modelName = "face_biometric_hektor";
        String userID = "72f286b8-173f-436a-8869-6f7887789ee9";
        String enrollmentDescription = "My Enrollment";
        boolean isLivenessEnabled = true;
        RecognitionThreshold threshold = RecognitionThreshold.MEDIUM;
        int liveFramesRequired = 1;

        StreamObserver<CreateEnrollmentRequest> requestObserver = null;

        // Open the grpc stream
        requestObserver = videoService.createEnrollment(
                modelName,
                userID,
                enrollmentDescription,
                isLivenessEnabled,
                threshold,
                liveFramesRequired,
                new StreamObserver<CreateEnrollmentResponse>() {
                    @Override
                    public void onNext(CreateEnrollmentResponse value) {
                        // The response contains information about the enrollment status.
                        // * percentComplete

                        // enrollmentID will be populated once the enrollment is complete
                        String enrollmentID = value.getEnrollmentId();

                        // If the enrollment is not complete, send the next video frame
                        if (enrollmentID.isEmpty()) {
                            ByteString image = customerImplementedImageGetter();
                            // (Make sure you use the proper type for the grpc stream you're using)
                            CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                                    .setImageContent(ByteString.copyFrom(image))
                                    .build();
                            requestObserver.onNext(request);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle server error
                    }

                    @Override
                    public void onCompleted() {
                        // Handle grpc stream being closed
                    }
                }

        );

        // Send first image
        ByteString image = customerImplementedImageGetter();
        // (Make sure you use the proper type for the grpc stream you're using)
        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                .setImageContent(ByteString.copyFrom(image))
                .build();
        requestObserver.onNext(request);
    }
}
```

### Authenticating with Video

Authenticating with video is similar to enrollment, except now you pass in an enrollmentID instead of the model name.

```Java
class VideoAuthenticationExample {
    public static void main(String[] args) {
        // Get basic authentication information
        String enrollmentID = "fcc8a800-252e-442c-af30-41846f248238";
        boolean isLivenessEnabled = true;
        RecognitionThreshold threshold = RecognitionThreshold.MEDIUM;

        StreamObserver<AuthenticateRequest> requestObserver = null;
        
        // Open the grpc stream
        requestObserver = videoService.authenticate(
                AudioService.EnrollmentType.ENROLLMENT_ID,
                enrollmentID,
                isLivenessEnabled,
                threshold,
                new StreamObserver<AuthenticateResponse>() {
                    @Override
                    public void onNext(AuthenticateResponse value) {
                        if (value.getSuccess()) {
                            // Authentication was successful - break out
                        } else {
                            // Send the next video frame
                            ByteString image = customerImplementedImageGetter();
                            // (Make sure you use the proper type for the grpc stream you're using)
                            CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                                    .setImageContent(ByteString.copyFrom(image))
                                    .build();
                            requestObserver.onNext(request);
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle server error
                    }

                    @Override
                    public void onCompleted() {
                        // Handle grpc stream being closed
                    }
                }
        );

        // Send an initial image
        ByteString image = customerImplementedImageGetter();
        // (Make sure you use the proper type for the grpc stream you're using)
        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                .setImageContent(ByteString.copyFrom(image))
                .build();
        requestObserver.onNext(request);
    }
}
```

### Video Liveness

Video Liveness allows one to send images to Sensory Cloud in order to determine if the subject is a live individual rather than a spoof, such as a paper mask or picture.

```Java
class VideoLivenessExample {
    public static void main(String[] args) {
        // Get basic liveness information
        String userId = "bea536c2-45d7-47b3-94e2-4962e1bb8a2f";
        String modelName = "face_recognition_mathilde";
        RecognitionThreshold threshold = RecognitionThreshold.MEDIUM;

        StreamObserver<ValidateRecognitionRequest> requestObserver = null;
        
        // Open the grpc stream
        requestObserver = videoService.validateLiveness(
                modelName,
                userId,
                threshold,
                new StreamObserver<LivenessRecognitionResponse>() {
                    @Override
                    public void onNext(LivenessRecognitionResponse value) {
                        if (value.getIsAlive()) {
                            // Previous frame was determined to be alive
                        }

                        // Send the next video frame
                        ByteString image = customerImplementedImageGetter();
                        // (Make sure you use the proper type for the grpc stream you're using)
                        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                                .setImageContent(ByteString.copyFrom(image))
                                .build();
                        requestObserver.onNext(request);
                    }

                    @Override
                    public void onError(Throwable t) {
                        // Handle server error
                    }

                    @Override
                    public void onCompleted() {
                        // Handle grpc stream being closed
                    }
                }
        );

        // Send an initial image
        ByteString image = customerImplementedImageGetter();
        // (Make sure you use the proper type for the grpc stream you're using)
        CreateEnrollmentRequest request = CreateEnrollmentRequest.newBuilder()
                .setImageContent(ByteString.copyFrom(image))
                .build();
        requestObserver.onNext(request);
    }
}
```

## Creating a Management Service

The `ManagementService` is used to manage typical CRUD operations with Sensory Cloud, such as deleting enrollments or creating enrollment groups. For more information on the specific functions of the `ManagementService`, please refer to the ManagementService file located in the services folder.

```Java
class ManagementServiceExample {
    public static void main(String[] args) {
        ManagementService managementService = new ManagementService(tokenManager);
    }
}
```

## For Sensory Developers

Ensure you have gradle installed and you are compiling with JDK8

```bash
brew install gradle
```

You will also need to build grpc-java from scratch and ensure it is in your $PATH

https://github.com/grpc/grpc-java/tree/master/compiler
