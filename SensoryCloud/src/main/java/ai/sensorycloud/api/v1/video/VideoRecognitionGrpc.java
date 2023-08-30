package ai.sensorycloud.api.v1.video;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Handles all video recognition endpoints
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: v1/video/video.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class VideoRecognitionGrpc {

  private VideoRecognitionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sensory.api.v1.video.VideoRecognition";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest,
      ai.sensorycloud.api.v1.video.LivenessRecognitionResponse> getValidateLivenessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateLiveness",
      requestType = ai.sensorycloud.api.v1.video.ValidateRecognitionRequest.class,
      responseType = ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest,
      ai.sensorycloud.api.v1.video.LivenessRecognitionResponse> getValidateLivenessMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest, ai.sensorycloud.api.v1.video.LivenessRecognitionResponse> getValidateLivenessMethod;
    if ((getValidateLivenessMethod = VideoRecognitionGrpc.getValidateLivenessMethod) == null) {
      synchronized (VideoRecognitionGrpc.class) {
        if ((getValidateLivenessMethod = VideoRecognitionGrpc.getValidateLivenessMethod) == null) {
          VideoRecognitionGrpc.getValidateLivenessMethod = getValidateLivenessMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest, ai.sensorycloud.api.v1.video.LivenessRecognitionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateLiveness"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.video.ValidateRecognitionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.video.LivenessRecognitionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new VideoRecognitionMethodDescriptorSupplier("ValidateLiveness"))
              .build();
        }
      }
    }
    return getValidateLivenessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VideoRecognitionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoRecognitionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoRecognitionStub>() {
        @java.lang.Override
        public VideoRecognitionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoRecognitionStub(channel, callOptions);
        }
      };
    return VideoRecognitionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VideoRecognitionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoRecognitionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoRecognitionBlockingStub>() {
        @java.lang.Override
        public VideoRecognitionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoRecognitionBlockingStub(channel, callOptions);
        }
      };
    return VideoRecognitionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VideoRecognitionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<VideoRecognitionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<VideoRecognitionFutureStub>() {
        @java.lang.Override
        public VideoRecognitionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new VideoRecognitionFutureStub(channel, callOptions);
        }
      };
    return VideoRecognitionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Handles all video recognition endpoints
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Validates the liveness of a single image or stream of images.
     * Streams a ValidateRecognitionResponse as the images are processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest> validateLiveness(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.LivenessRecognitionResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getValidateLivenessMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service VideoRecognition.
   * <pre>
   * Handles all video recognition endpoints
   * </pre>
   */
  public static abstract class VideoRecognitionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return VideoRecognitionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service VideoRecognition.
   * <pre>
   * Handles all video recognition endpoints
   * </pre>
   */
  public static final class VideoRecognitionStub
      extends io.grpc.stub.AbstractAsyncStub<VideoRecognitionStub> {
    private VideoRecognitionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoRecognitionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoRecognitionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Validates the liveness of a single image or stream of images.
     * Streams a ValidateRecognitionResponse as the images are processed.
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.ValidateRecognitionRequest> validateLiveness(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.LivenessRecognitionResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getValidateLivenessMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service VideoRecognition.
   * <pre>
   * Handles all video recognition endpoints
   * </pre>
   */
  public static final class VideoRecognitionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<VideoRecognitionBlockingStub> {
    private VideoRecognitionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoRecognitionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoRecognitionBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service VideoRecognition.
   * <pre>
   * Handles all video recognition endpoints
   * </pre>
   */
  public static final class VideoRecognitionFutureStub
      extends io.grpc.stub.AbstractFutureStub<VideoRecognitionFutureStub> {
    private VideoRecognitionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VideoRecognitionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new VideoRecognitionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_VALIDATE_LIVENESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_LIVENESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.validateLiveness(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.video.LivenessRecognitionResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getValidateLivenessMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.video.ValidateRecognitionRequest,
              ai.sensorycloud.api.v1.video.LivenessRecognitionResponse>(
                service, METHODID_VALIDATE_LIVENESS)))
        .build();
  }

  private static abstract class VideoRecognitionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VideoRecognitionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.sensorycloud.api.v1.video.SensoryApiV1VideoProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VideoRecognition");
    }
  }

  private static final class VideoRecognitionFileDescriptorSupplier
      extends VideoRecognitionBaseDescriptorSupplier {
    VideoRecognitionFileDescriptorSupplier() {}
  }

  private static final class VideoRecognitionMethodDescriptorSupplier
      extends VideoRecognitionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    VideoRecognitionMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (VideoRecognitionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VideoRecognitionFileDescriptorSupplier())
              .addMethod(getValidateLivenessMethod())
              .build();
        }
      }
    }
    return result;
  }
}
