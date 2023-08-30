package ai.sensorycloud.api.v1.management;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service to manage Enrollments in the database
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: v1/management/enrollment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnrollmentServiceGrpc {

  private EnrollmentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "sensory.api.v1.management.EnrollmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getGetEnrollmentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnrollments",
      requestType = ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.class,
      responseType = ai.sensorycloud.api.v1.management.GetEnrollmentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getGetEnrollmentsMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getGetEnrollmentsMethod;
    if ((getGetEnrollmentsMethod = EnrollmentServiceGrpc.getGetEnrollmentsMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getGetEnrollmentsMethod = EnrollmentServiceGrpc.getGetEnrollmentsMethod) == null) {
          EnrollmentServiceGrpc.getGetEnrollmentsMethod = getGetEnrollmentsMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnrollments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("GetEnrollments"))
              .build();
        }
      }
    }
    return getGetEnrollmentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getGetEnrollmentGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEnrollmentGroups",
      requestType = ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.class,
      responseType = ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getGetEnrollmentGroupsMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getGetEnrollmentGroupsMethod;
    if ((getGetEnrollmentGroupsMethod = EnrollmentServiceGrpc.getGetEnrollmentGroupsMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getGetEnrollmentGroupsMethod = EnrollmentServiceGrpc.getGetEnrollmentGroupsMethod) == null) {
          EnrollmentServiceGrpc.getGetEnrollmentGroupsMethod = getGetEnrollmentGroupsMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.GetEnrollmentsRequest, ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEnrollmentGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("GetEnrollmentGroups"))
              .build();
        }
      }
    }
    return getGetEnrollmentGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getCreateEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getCreateEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getCreateEnrollmentGroupMethod;
    if ((getCreateEnrollmentGroupMethod = EnrollmentServiceGrpc.getCreateEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getCreateEnrollmentGroupMethod = EnrollmentServiceGrpc.getCreateEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getCreateEnrollmentGroupMethod = getCreateEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("CreateEnrollmentGroup"))
              .build();
        }
      }
    }
    return getCreateEnrollmentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getAppendEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getAppendEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getAppendEnrollmentGroupMethod;
    if ((getAppendEnrollmentGroupMethod = EnrollmentServiceGrpc.getAppendEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getAppendEnrollmentGroupMethod = EnrollmentServiceGrpc.getAppendEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getAppendEnrollmentGroupMethod = getAppendEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("AppendEnrollmentGroup"))
              .build();
        }
      }
    }
    return getAppendEnrollmentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest,
      ai.sensorycloud.api.v1.management.EnrollmentResponse> getDeleteEnrollmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnrollment",
      requestType = ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest,
      ai.sensorycloud.api.v1.management.EnrollmentResponse> getDeleteEnrollmentMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest, ai.sensorycloud.api.v1.management.EnrollmentResponse> getDeleteEnrollmentMethod;
    if ((getDeleteEnrollmentMethod = EnrollmentServiceGrpc.getDeleteEnrollmentMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getDeleteEnrollmentMethod = EnrollmentServiceGrpc.getDeleteEnrollmentMethod) == null) {
          EnrollmentServiceGrpc.getDeleteEnrollmentMethod = getDeleteEnrollmentMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest, ai.sensorycloud.api.v1.management.EnrollmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnrollment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("DeleteEnrollment"))
              .build();
        }
      }
    }
    return getDeleteEnrollmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getDeleteEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getDeleteEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getDeleteEnrollmentGroupMethod;
    if ((getDeleteEnrollmentGroupMethod = EnrollmentServiceGrpc.getDeleteEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getDeleteEnrollmentGroupMethod = EnrollmentServiceGrpc.getDeleteEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getDeleteEnrollmentGroupMethod = getDeleteEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("DeleteEnrollmentGroup"))
              .build();
        }
      }
    }
    return getDeleteEnrollmentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest,
      ai.sensorycloud.api.v1.management.EnrollmentResponse> getUpdateEnrollmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnrollment",
      requestType = ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest,
      ai.sensorycloud.api.v1.management.EnrollmentResponse> getUpdateEnrollmentMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest, ai.sensorycloud.api.v1.management.EnrollmentResponse> getUpdateEnrollmentMethod;
    if ((getUpdateEnrollmentMethod = EnrollmentServiceGrpc.getUpdateEnrollmentMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getUpdateEnrollmentMethod = EnrollmentServiceGrpc.getUpdateEnrollmentMethod) == null) {
          EnrollmentServiceGrpc.getUpdateEnrollmentMethod = getUpdateEnrollmentMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest, ai.sensorycloud.api.v1.management.EnrollmentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnrollment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("UpdateEnrollment"))
              .build();
        }
      }
    }
    return getUpdateEnrollmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getUpdateEnrollmentGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEnrollmentGroup",
      requestType = ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getUpdateEnrollmentGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getUpdateEnrollmentGroupMethod;
    if ((getUpdateEnrollmentGroupMethod = EnrollmentServiceGrpc.getUpdateEnrollmentGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getUpdateEnrollmentGroupMethod = EnrollmentServiceGrpc.getUpdateEnrollmentGroupMethod) == null) {
          EnrollmentServiceGrpc.getUpdateEnrollmentGroupMethod = getUpdateEnrollmentGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEnrollmentGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("UpdateEnrollmentGroup"))
              .build();
        }
      }
    }
    return getUpdateEnrollmentGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getRemoveEnrollmentsFromGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveEnrollmentsFromGroup",
      requestType = ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.class,
      responseType = ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest,
      ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getRemoveEnrollmentsFromGroupMethod() {
    io.grpc.MethodDescriptor<ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> getRemoveEnrollmentsFromGroupMethod;
    if ((getRemoveEnrollmentsFromGroupMethod = EnrollmentServiceGrpc.getRemoveEnrollmentsFromGroupMethod) == null) {
      synchronized (EnrollmentServiceGrpc.class) {
        if ((getRemoveEnrollmentsFromGroupMethod = EnrollmentServiceGrpc.getRemoveEnrollmentsFromGroupMethod) == null) {
          EnrollmentServiceGrpc.getRemoveEnrollmentsFromGroupMethod = getRemoveEnrollmentsFromGroupMethod =
              io.grpc.MethodDescriptor.<ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest, ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RemoveEnrollmentsFromGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ai.sensorycloud.api.v1.management.EnrollmentGroupResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrollmentServiceMethodDescriptorSupplier("RemoveEnrollmentsFromGroup"))
              .build();
        }
      }
    }
    return getRemoveEnrollmentsFromGroupMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnrollmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceStub>() {
        @java.lang.Override
        public EnrollmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrollmentServiceStub(channel, callOptions);
        }
      };
    return EnrollmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnrollmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceBlockingStub>() {
        @java.lang.Override
        public EnrollmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrollmentServiceBlockingStub(channel, callOptions);
        }
      };
    return EnrollmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnrollmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrollmentServiceFutureStub>() {
        @java.lang.Override
        public EnrollmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrollmentServiceFutureStub(channel, callOptions);
        }
      };
    return EnrollmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void getEnrollments(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnrollmentsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void getEnrollmentGroups(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEnrollmentGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void createEnrollmentGroup(ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEnrollmentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void appendEnrollmentGroup(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendEnrollmentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    default void deleteEnrollment(ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnrollmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void deleteEnrollmentGroup(ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEnrollmentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the name of an enrollment
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void updateEnrollment(ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnrollmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the name of an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void updateEnrollmentGroup(ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEnrollmentGroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes a list of enrollments from an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    default void removeEnrollmentsFromGroup(ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveEnrollmentsFromGroupMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EnrollmentService.
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static abstract class EnrollmentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EnrollmentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EnrollmentService.
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static final class EnrollmentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EnrollmentServiceStub> {
    private EnrollmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrollmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrollmentServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getEnrollments(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnrollmentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void getEnrollmentGroups(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEnrollmentGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void createEnrollmentGroup(ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void appendEnrollmentGroup(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public void deleteEnrollment(ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnrollmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void deleteEnrollmentGroup(ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the name of an enrollment
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void updateEnrollment(ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnrollmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the name of an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void updateEnrollmentGroup(ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEnrollmentGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes a list of enrollments from an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public void removeEnrollmentsFromGroup(ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest request,
        io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveEnrollmentsFromGroupMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EnrollmentService.
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static final class EnrollmentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EnrollmentServiceBlockingStub> {
    private EnrollmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrollmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrollmentServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.GetEnrollmentsResponse getEnrollments(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnrollmentsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse getEnrollmentGroups(ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEnrollmentGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse createEnrollmentGroup(ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEnrollmentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse appendEnrollmentGroup(ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendEnrollmentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentResponse deleteEnrollment(ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnrollmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse deleteEnrollmentGroup(ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEnrollmentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the name of an enrollment
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentResponse updateEnrollment(ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnrollmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the name of an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse updateEnrollmentGroup(ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEnrollmentGroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes a list of enrollments from an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public ai.sensorycloud.api.v1.management.EnrollmentGroupResponse removeEnrollmentsFromGroup(ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveEnrollmentsFromGroupMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EnrollmentService.
   * <pre>
   * Service to manage Enrollments in the database
   * </pre>
   */
  public static final class EnrollmentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EnrollmentServiceFutureStub> {
    private EnrollmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrollmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrollmentServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get enrollments from the database that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse> getEnrollments(
        ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnrollmentsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all enrollment groups that match the specified criteria
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse> getEnrollmentGroups(
        ai.sensorycloud.api.v1.management.GetEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEnrollmentGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new enrollment group without any associated enrollments
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> createEnrollmentGroup(
        ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEnrollmentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Appends an enrollment to an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> appendEnrollmentGroup(
        ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendEnrollmentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an enrollment from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * A user may not delete their last enrollment, as this would lead to a situation where a user could
     * lock themselves out of the system forever.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentResponse> deleteEnrollment(
        ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnrollmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes an enrollment group from the database
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> deleteEnrollmentGroup(
        ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEnrollmentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the name of an enrollment
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentResponse> updateEnrollment(
        ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnrollmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the name of an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> updateEnrollmentGroup(
        ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEnrollmentGroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes a list of enrollments from an enrollment group
     * Authorization metadata is required {"authorization": "Bearer &lt;TOKEN&gt;"}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse> removeEnrollmentsFromGroup(
        ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveEnrollmentsFromGroupMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ENROLLMENTS = 0;
  private static final int METHODID_GET_ENROLLMENT_GROUPS = 1;
  private static final int METHODID_CREATE_ENROLLMENT_GROUP = 2;
  private static final int METHODID_APPEND_ENROLLMENT_GROUP = 3;
  private static final int METHODID_DELETE_ENROLLMENT = 4;
  private static final int METHODID_DELETE_ENROLLMENT_GROUP = 5;
  private static final int METHODID_UPDATE_ENROLLMENT = 6;
  private static final int METHODID_UPDATE_ENROLLMENT_GROUP = 7;
  private static final int METHODID_REMOVE_ENROLLMENTS_FROM_GROUP = 8;

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
        case METHODID_GET_ENROLLMENTS:
          serviceImpl.getEnrollments((ai.sensorycloud.api.v1.management.GetEnrollmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentsResponse>) responseObserver);
          break;
        case METHODID_GET_ENROLLMENT_GROUPS:
          serviceImpl.getEnrollmentGroups((ai.sensorycloud.api.v1.management.GetEnrollmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>) responseObserver);
          break;
        case METHODID_CREATE_ENROLLMENT_GROUP:
          serviceImpl.createEnrollmentGroup((ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        case METHODID_APPEND_ENROLLMENT_GROUP:
          serviceImpl.appendEnrollmentGroup((ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENROLLMENT:
          serviceImpl.deleteEnrollment((ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse>) responseObserver);
          break;
        case METHODID_DELETE_ENROLLMENT_GROUP:
          serviceImpl.deleteEnrollmentGroup((ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENROLLMENT:
          serviceImpl.updateEnrollment((ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ENROLLMENT_GROUP:
          serviceImpl.updateEnrollmentGroup((ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        case METHODID_REMOVE_ENROLLMENTS_FROM_GROUP:
          serviceImpl.removeEnrollmentsFromGroup((ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest) request,
              (io.grpc.stub.StreamObserver<ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEnrollmentsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
              ai.sensorycloud.api.v1.management.GetEnrollmentsResponse>(
                service, METHODID_GET_ENROLLMENTS)))
        .addMethod(
          getGetEnrollmentGroupsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.GetEnrollmentsRequest,
              ai.sensorycloud.api.v1.management.GetEnrollmentGroupsResponse>(
                service, METHODID_GET_ENROLLMENT_GROUPS)))
        .addMethod(
          getCreateEnrollmentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.CreateEnrollmentGroupRequest,
              ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                service, METHODID_CREATE_ENROLLMENT_GROUP)))
        .addMethod(
          getAppendEnrollmentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.AppendEnrollmentGroupRequest,
              ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                service, METHODID_APPEND_ENROLLMENT_GROUP)))
        .addMethod(
          getDeleteEnrollmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.DeleteEnrollmentRequest,
              ai.sensorycloud.api.v1.management.EnrollmentResponse>(
                service, METHODID_DELETE_ENROLLMENT)))
        .addMethod(
          getDeleteEnrollmentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.DeleteEnrollmentGroupRequest,
              ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                service, METHODID_DELETE_ENROLLMENT_GROUP)))
        .addMethod(
          getUpdateEnrollmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.UpdateEnrollmentRequest,
              ai.sensorycloud.api.v1.management.EnrollmentResponse>(
                service, METHODID_UPDATE_ENROLLMENT)))
        .addMethod(
          getUpdateEnrollmentGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.UpdateEnrollmentGroupRequest,
              ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                service, METHODID_UPDATE_ENROLLMENT_GROUP)))
        .addMethod(
          getRemoveEnrollmentsFromGroupMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              ai.sensorycloud.api.v1.management.RemoveEnrollmentsRequest,
              ai.sensorycloud.api.v1.management.EnrollmentGroupResponse>(
                service, METHODID_REMOVE_ENROLLMENTS_FROM_GROUP)))
        .build();
  }

  private static abstract class EnrollmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnrollmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ai.sensorycloud.api.v1.management.SensoryApiV1ManagementEnrollmentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnrollmentService");
    }
  }

  private static final class EnrollmentServiceFileDescriptorSupplier
      extends EnrollmentServiceBaseDescriptorSupplier {
    EnrollmentServiceFileDescriptorSupplier() {}
  }

  private static final class EnrollmentServiceMethodDescriptorSupplier
      extends EnrollmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    EnrollmentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (EnrollmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnrollmentServiceFileDescriptorSupplier())
              .addMethod(getGetEnrollmentsMethod())
              .addMethod(getGetEnrollmentGroupsMethod())
              .addMethod(getCreateEnrollmentGroupMethod())
              .addMethod(getAppendEnrollmentGroupMethod())
              .addMethod(getDeleteEnrollmentMethod())
              .addMethod(getDeleteEnrollmentGroupMethod())
              .addMethod(getUpdateEnrollmentMethod())
              .addMethod(getUpdateEnrollmentGroupMethod())
              .addMethod(getRemoveEnrollmentsFromGroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
