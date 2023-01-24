package ai.sensorycloud.api.v1.assistant;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Serivce to comunicate with an assistant
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0-SNAPSHOT)",
    comments = "Source: v1/assistant/assistant.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AssistantServiceGrpc {

  private AssistantServiceGrpc() {}

  public static final String SERVICE_NAME = "sensory.api.v1.assistant.AssistantService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.assistant.AssistantMessageRequest,
      ai.sensorycloud.api.v1.assistant.AssistantMessageResponse> getProcessMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProcessMessage",
      requestType = ai.sensorycloud.api.v1.assistant.AssistantMessageRequest.class,
      responseType = ai.sensorycloud.api.v1.assistant.AssistantMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.assistant.AssistantMessageRequest,
      ai.sensorycloud.api.v1.assistant.AssistantMessageResponse> getProcessMessageMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.assistant.AssistantMessageRequest, ai.sensorycloud.api.v1.assistant.AssistantMessageResponse> getProcessMessageMethod;
    if ((getProcessMessageMethod = AssistantServiceGrpc.getProcessMessageMethod) == null) {
      synchronized (AssistantServiceGrpc.class) {
        if ((getProcessMessageMethod = AssistantServiceGrpc.getProcessMessageMethod) == null) {
          AssistantServiceGrpc.getProcessMessageMethod = getProcessMessageMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.assistant.AssistantMessageRequest, ai.sensorycloud.api.v1.assistant.AssistantMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProcessMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.assistant.AssistantMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.assistant.AssistantMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AssistantServiceMethodDescriptorSupplier("ProcessMessage"))
              .build();
        }
      }
    }
    return getProcessMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AssistantServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceStub>() {
        @java.lang.Override
        public AssistantServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceStub(channel, callOptions);
        }
      };
    return AssistantServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AssistantServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceBlockingStub>() {
        @java.lang.Override
        public AssistantServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceBlockingStub(channel, callOptions);
        }
      };
    return AssistantServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AssistantServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AssistantServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AssistantServiceFutureStub>() {
        @java.lang.Override
        public AssistantServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AssistantServiceFutureStub(channel, callOptions);
        }
      };
    return AssistantServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Serivce to comunicate with an assistant
   * </pre>
   */
  public static abstract class AssistantServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends and process messages from a virtual assistant
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.AssistantMessageRequest> processMessage(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.AssistantMessageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getProcessMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessMessageMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                ai.sensorycloud.api.v1.assistant.AssistantMessageRequest,
                ai.sensorycloud.api.v1.assistant.AssistantMessageResponse>(
                  this, METHODID_PROCESS_MESSAGE)))
          .build();
    }
  }

  /**
   * <pre>
   * Serivce to comunicate with an assistant
   * </pre>
   */
  public static final class AssistantServiceStub extends io.grpc.stub.AbstractAsyncStub<AssistantServiceStub> {
    private AssistantServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends and process messages from a virtual assistant
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.AssistantMessageRequest> processMessage(
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.AssistantMessageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getProcessMessageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Serivce to comunicate with an assistant
   * </pre>
   */
  public static final class AssistantServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AssistantServiceBlockingStub> {
    private AssistantServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Serivce to comunicate with an assistant
   * </pre>
   */
  public static final class AssistantServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AssistantServiceFutureStub> {
    private AssistantServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AssistantServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AssistantServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_PROCESS_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AssistantServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AssistantServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_PROCESS_MESSAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.processMessage(
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.assistant.AssistantMessageResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AssistantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AssistantServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.sensorycloud.api.v1.assistant.SensoryApiV1AssistantProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AssistantService");
    }
  }

  private static final class AssistantServiceFileDescriptorSupplier
      extends AssistantServiceBaseDescriptorSupplier {
    AssistantServiceFileDescriptorSupplier() {}
  }

  private static final class AssistantServiceMethodDescriptorSupplier
      extends AssistantServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AssistantServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AssistantServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AssistantServiceFileDescriptorSupplier())
              .addMethod(getProcessMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
