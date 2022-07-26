package ai.sensorycloud.service;

import ai.sensorycloud.api.common.ModelType;
import ai.sensorycloud.api.common.TechnologyType;
import ai.sensorycloud.api.v1.audio.*;
import ai.sensorycloud.config.Config;
import ai.sensorycloud.config.SDKInitConfig;
import ai.sensorycloud.tokenManager.TokenManager;
import com.google.protobuf.ByteString;
import io.grpc.*;
import io.grpc.inprocess.InProcessChannelBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import io.grpc.stub.MetadataUtils;
import io.grpc.stub.StreamObserver;
import io.grpc.testing.GrpcCleanupRule;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Rule;

import java.nio.charset.StandardCharsets;

import static org.awaitility.Awaitility.*;
import static org.mockito.AdditionalAnswers.delegatesTo;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;

public class AudioServiceTest extends TestCase {

    final Metadata.Key<String> authKey = Metadata.Key.of("authorization", Metadata.ASCII_STRING_MARSHALLER);
    final String authValue = "Bearer Some-OAuth-Token";

    final public SDKInitConfig mockConfig = new SDKInitConfig(
            "host",
            false,
            "tenantID",
            SDKInitConfig.EnrollmentType.NONE,
            "doesntmatter",
            "deviceID",
            "deviceName"
    );

    final GetModelsRequest expectedModelsRequest = GetModelsRequest.getDefaultInstance();

    final AudioModel mockModel = AudioModel.newBuilder()
            .setName("Some Audio Model")
            .setModelType(ModelType.SOUND_EVENT_ENROLLABLE)
            .setIsEnrollable(true)
            .setTechnology(TechnologyType.TSSV)
            .setIsLivenessSupported(false)
            .setFixedPhrase("Hello")
            .build();

    final GetModelsResponse expectedModelsResponse = GetModelsResponse.newBuilder()
            .addModels(mockModel)
            .build();

    final AudioConfig mockAudioConfig = AudioConfig.newBuilder()
            .setEncoding(AudioConfig.AudioEncoding.LINEAR16)
            .setSampleRateHertz(16000)
            .setAudioChannelCount(1)
            .setLanguageCode("lanCode")
            .build();

    final CreateEnrollmentRequest expectedEnrollmentRequest = CreateEnrollmentRequest.newBuilder()
            .setConfig( CreateEnrollmentConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setModelName("Audio Model")
                    .setUserId("Some User")
                    .setDeviceId(mockConfig.deviceID)
                    .setDescription("Enrollment Description")
                    .setIsLivenessEnabled(true)
                    .setEnrollmentDuration(10)
            ).build();

    final CreateEnrollmentResponse expectedEnrollmentResponse = CreateEnrollmentResponse.newBuilder()
            .setModelName("Some Model")
            .setEnrollmentId("EnrollmentID")
            .setAudioEnergy(50)
            .setPercentComplete(50)
            .setModelPrompt("Prompt")
            .build();

    final AuthenticateRequest expectedAuthenticateRequest = AuthenticateRequest.newBuilder()
            .setConfig( AuthenticateConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setIsLivenessEnabled(true)
                    .setEnrollmentId("Enrollment ID")
            ).build();

    final AuthenticateResponse expectedAuthenticateResponse = AuthenticateResponse.newBuilder()
            .setAudioEnergy(100)
            .setPercentSegmentComplete(2)
            .setUserId("Some User")
            .setEnrollmentId("ID")
            .setSuccess(true)
            .setModelPrompt("Prompt")
            .build();

    final ValidateEventRequest expectedValidationRequest = ValidateEventRequest.newBuilder()
            .setConfig(ValidateEventConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setModelName("Audio Model")
                    .setUserId("User ID")
                    .setSensitivity(ThresholdSensitivity.HIGHEST)
            ).build();

    final ValidateEventResponse expectedValidationResponse = ValidateEventResponse.newBuilder()
            .setResultId("Result")
            .setAudioEnergy(100)
            .setSuccess(true)
            .setScore(50)
            .build();

    final CreateEnrolledEventRequest expectedEnrollEventRequest = CreateEnrolledEventRequest.newBuilder()
            .setConfig(CreateEnrollmentEventConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setModelName("AudioEventModel")
                    .setUserId("Some user")
                    .setDescription("Description")
            ).build();

    final CreateEnrollmentResponse expectedEnrollEventResponse = expectedEnrollmentResponse;

    final ValidateEnrolledEventRequest expectedValidateEnrolledEventRequest = ValidateEnrolledEventRequest.newBuilder()
            .setConfig(ValidateEnrolledEventConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setSensitivity(ThresholdSensitivity.HIGHEST)
                    .setEnrollmentGroupId("GroupID")
            ).build();

    final ValidateEnrolledEventResponse expectedValidateEnrolledEventResponse = ValidateEnrolledEventResponse.newBuilder()
            .setAudioEnergy(10)
            .setEnrollmentId("Some Enrollment ID")
            .setUserId("User")
            .setSuccess(true)
            .setModelPrompt("prompt")
            .build();

    final TranscribeRequest expectedTranscriptionRequest = TranscribeRequest.newBuilder()
            .setConfig(TranscribeConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setModelName("Transcription Model")
                    .setUserId("Some User")
            ).build();

    final TranscribeResponse expectedTranscriptionResponse = TranscribeResponse.newBuilder()
            .setAudioEnergy(25)
            .setIsPartialResult(true)
            .setTranscript("Some Transcription")
            .build();

    final SynthesizeSpeechRequest expectedSynthesizeSpeechRequest = SynthesizeSpeechRequest.newBuilder()
            .setConfig(VoiceSynthesisConfig.newBuilder()
                    .setAudio(mockAudioConfig)
                    .setVoice("Some Voice")
            )
            .setPhrase("Some Phrase")
            .build();

    final SynthesizeSpeechResponse expectedSynthesizeSpeechResponse = SynthesizeSpeechResponse.newBuilder()
            .setConfig(mockAudioConfig)
            .setAudioContent(ByteString.copyFrom("Some Byte String", StandardCharsets.UTF_8))
            .build();

    private final ServerInterceptor mockServerInterceptor = mock(ServerInterceptor.class, delegatesTo(
            new ServerInterceptor() {
                @Override
                public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
                    String oauthToken = headers.get(authKey);
                    assertNotNull("OAuth token should be present", oauthToken);
                    assertEquals("Oauth token should match", authValue, oauthToken);
                    return next.startCall(call, headers);
                }
            }
    ));

    private final AudioModelsGrpc.AudioModelsImplBase modelsImpl =
            mock(AudioModelsGrpc.AudioModelsImplBase.class, delegatesTo(
                    new AudioModelsGrpc.AudioModelsImplBase() {
                        @Override
                        public void getModels(GetModelsRequest request, StreamObserver<GetModelsResponse> responseObserver) {
                            assertEquals("Request should match", expectedModelsRequest, request);
                            responseObserver.onNext(expectedModelsResponse);
                            responseObserver.onCompleted();
                        }
                    }
            ));

    private final AudioBiometricsGrpc.AudioBiometricsImplBase biometricsImpl =
            mock(AudioBiometricsGrpc.AudioBiometricsImplBase.class, delegatesTo(
                    new AudioBiometricsGrpc.AudioBiometricsImplBase() {
                        @Override
                        public StreamObserver<CreateEnrollmentRequest> createEnrollment(StreamObserver<CreateEnrollmentResponse> responseObserver) {
                            responseObserver.onNext(expectedEnrollmentResponse);
                            return new StreamObserver<CreateEnrollmentRequest>() {
                                @Override
                                public void onNext(CreateEnrollmentRequest value) {
                                    assertEquals("Initial config should be sent", expectedEnrollmentRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() {
                                    System.out.println("complete");
                                }
                            };
                        }

                        @Override
                        public StreamObserver<AuthenticateRequest> authenticate(StreamObserver<AuthenticateResponse> responseObserver) {
                            responseObserver.onNext(expectedAuthenticateResponse);
                            return new StreamObserver<AuthenticateRequest>() {
                                @Override
                                public void onNext(AuthenticateRequest value) {
                                    assertEquals("Initial config should be sent", expectedAuthenticateRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }
                    }
            ));

    private final AudioEventsGrpc.AudioEventsImplBase eventsImpl =
            mock(AudioEventsGrpc.AudioEventsImplBase.class, delegatesTo(
                    new AudioEventsGrpc.AudioEventsImplBase() {
                        @Override
                        public StreamObserver<ValidateEventRequest> validateEvent(StreamObserver<ValidateEventResponse> responseObserver) {
                            responseObserver.onNext(expectedValidationResponse);
                            return new StreamObserver<ValidateEventRequest>() {
                                @Override
                                public void onNext(ValidateEventRequest value) {
                                    assertEquals("Initial config should be sent", expectedValidationRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }

                        @Override
                        public StreamObserver<CreateEnrolledEventRequest> createEnrolledEvent(StreamObserver<CreateEnrollmentResponse> responseObserver) {
                            responseObserver.onNext(expectedEnrollEventResponse);
                            return new StreamObserver<CreateEnrolledEventRequest>() {
                                @Override
                                public void onNext(CreateEnrolledEventRequest value) {
                                    assertEquals("Initial config should be sent", expectedEnrollEventRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }

                        @Override
                        public StreamObserver<ValidateEnrolledEventRequest> validateEnrolledEvent(StreamObserver<ValidateEnrolledEventResponse> responseObserver) {
                            responseObserver.onNext(expectedValidateEnrolledEventResponse);
                            return new StreamObserver<ValidateEnrolledEventRequest>() {
                                @Override
                                public void onNext(ValidateEnrolledEventRequest value) {
                                    assertEquals("Initial config should be sent", expectedValidateEnrolledEventRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }
                    }
            ));

    private final AudioTranscriptionsGrpc.AudioTranscriptionsImplBase transcriptionsImpl =
            mock(AudioTranscriptionsGrpc.AudioTranscriptionsImplBase.class, delegatesTo(
                    new AudioTranscriptionsGrpc.AudioTranscriptionsImplBase() {
                        @Override
                        public StreamObserver<TranscribeRequest> transcribe(StreamObserver<TranscribeResponse> responseObserver) {
                            responseObserver.onNext(expectedTranscriptionResponse);
                            return new StreamObserver<TranscribeRequest>() {
                                @Override
                                public void onNext(TranscribeRequest value) {
                                    assertEquals("Initial config should be sent", expectedTranscriptionRequest, value);
                                    requestReceived = true;
                                }

                                @Override
                                public void onError(Throwable t) {
                                    fail("Call should not fail: " + t.getMessage());
                                }

                                @Override
                                public void onCompleted() { }
                            };
                        }
                    }
            ));

    private final AudioSynthesisGrpc.AudioSynthesisImplBase synthesisImpl =
            mock(AudioSynthesisGrpc.AudioSynthesisImplBase.class, delegatesTo(
                    new AudioSynthesisGrpc.AudioSynthesisImplBase() {
                        @Override
                        public void synthesizeSpeech(SynthesizeSpeechRequest request, StreamObserver<SynthesizeSpeechResponse> responseObserver) {
                            assertEquals("Request should match", expectedSynthesizeSpeechRequest, request);
                            responseObserver.onNext(expectedSynthesizeSpeechResponse);
                            responseObserver.onCompleted();
                        }
                    }
            ));

    @Rule
    public final GrpcCleanupRule grpcCleanup = new GrpcCleanupRule();

    public AudioService service;
    public TokenManager mockTokenManager;
    public boolean requestReceived = false;
    public boolean responseReceived = false;

    @Before
    public void setUp() throws Exception {
        requestReceived = false;
        responseReceived = false;

        MockConfig conf = new MockConfig();
        conf.setConfig(mockConfig);
        Config.defaultLanguageCode = "lanCode";

        String serverName = InProcessServerBuilder.generateName();
        grpcCleanup.register(InProcessServerBuilder.forName(serverName).directExecutor()
                .addService(ServerInterceptors.intercept(modelsImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(biometricsImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(eventsImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(transcriptionsImpl, mockServerInterceptor))
                .addService(ServerInterceptors.intercept(synthesisImpl, mockServerInterceptor))
                .build().start());
        ManagedChannel channel = grpcCleanup.register(InProcessChannelBuilder.forName(serverName)
                .directExecutor().build());

        mockTokenManager = mock(TokenManager.class);
        Metadata mockHeader = new Metadata();
        mockHeader.put(authKey, authValue);
        ClientInterceptor mockAuth = MetadataUtils.newAttachHeadersInterceptor(mockHeader);
        when(mockTokenManager.getAuthorizationMetadata()).thenReturn(mockAuth);

        service = new AudioService(mockTokenManager, channel);
    }

    public void testGetModels() {
        service.getModels(new AudioService.GetModelsListener() {
            @Override
            public void onSuccess(GetModelsResponse response) {
                assertEquals("Response should match", expectedModelsResponse, response);
                responseReceived = true;
            }

            @Override
            public void onFailure(Throwable t) { fail("Call should not fail: " + t.getMessage()); }
        });

        await().until(() -> responseReceived);
    }

    public void testCreateEnrollment() {
        service.createEnrollment(
                expectedEnrollmentRequest.getConfig().getModelName(),
                expectedEnrollmentRequest.getConfig().getUserId(),
                "",
                expectedEnrollmentRequest.getConfig().getDescription(),
                expectedEnrollmentRequest.getConfig().getIsLivenessEnabled(),
                0,
                expectedEnrollmentRequest.getConfig().getEnrollmentDuration(),
                false,
                new StreamObserver<CreateEnrollmentResponse>() {
                    @Override
                    public void onNext(CreateEnrollmentResponse value) {
                        assertEquals("Response should match", expectedEnrollmentResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
        System.out.println("done");
    }

    public void testAuthenticate() {
        service.authenticate(
                AudioService.EnrollmentType.ENROLLMENT_ID,
                expectedAuthenticateRequest.getConfig().getEnrollmentId(),
                "",
                expectedAuthenticateRequest.getConfig().getIsLivenessEnabled(),
                null,
                new StreamObserver<AuthenticateResponse>() {
                    @Override
                    public void onNext(AuthenticateResponse value) {
                        assertEquals("Response should match", expectedAuthenticateResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testValidateTrigger() {
        service.validateTrigger(
                expectedValidationRequest.getConfig().getModelName(),
                expectedValidationRequest.getConfig().getUserId(),
                "",
                expectedValidationRequest.getConfig().getSensitivity(),
                new StreamObserver<ValidateEventResponse>() {
                    @Override
                    public void onNext(ValidateEventResponse value) {
                        assertEquals("Response should match", expectedValidationResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testEnrollEvent() {
        service.createEnrolledEvent(
                expectedEnrollEventRequest.getConfig().getModelName(),
                expectedEnrollEventRequest.getConfig().getUserId(),
                "",
                expectedEnrollEventRequest.getConfig().getDescription(),
                new StreamObserver<CreateEnrollmentResponse>() {
                    @Override
                    public void onNext(CreateEnrollmentResponse value) {
                        assertEquals("Response should match", expectedEnrollEventResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testValidateEnrolledEvent() {
        service.validateEnrolledEvent(
                AudioService.EnrollmentType.ENROLLMENT_GROUP_ID,
                expectedValidateEnrolledEventRequest.getConfig().getEnrollmentGroupId(),
                "",
                expectedValidateEnrolledEventRequest.getConfig().getSensitivity(),
                new byte[0],
                new StreamObserver<ValidateEnrolledEventResponse>() {
                    @Override
                    public void onNext(ValidateEnrolledEventResponse value) {
                        assertEquals("Response should match", expectedValidateEnrolledEventResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testTranscribeAudio() {
        service.transcribeAudio(
                expectedTranscriptionRequest.getConfig().getModelName(),
                expectedTranscriptionRequest.getConfig().getUserId(),
                "",
                new StreamObserver<TranscribeResponse>() {
                    @Override
                    public void onNext(TranscribeResponse value) {
                        assertEquals("Response should match", expectedTranscriptionResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> requestReceived && responseReceived);
    }

    public void testSynthesizeSpeech() {
        service.synthesizeSpeech(
                expectedSynthesizeSpeechRequest.getPhrase(),
                expectedSynthesizeSpeechRequest.getConfig().getVoice(),
                "",
                new StreamObserver<SynthesizeSpeechResponse>() {
                    @Override
                    public void onNext(SynthesizeSpeechResponse value) {
                        assertEquals("Response should match", expectedSynthesizeSpeechResponse, value);
                        responseReceived = true;
                    }

                    @Override
                    public void onError(Throwable t) { fail("Call should not fail: " + t.getMessage()); }

                    @Override
                    public void onCompleted() { }
                });

        await().until(() -> responseReceived);
    }
}
