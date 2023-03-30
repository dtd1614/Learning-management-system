package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Reservation.proto")
public final class DeleteServiceGrpc {

  private DeleteServiceGrpc() {}

  public static final String SERVICE_NAME = "DeleteService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStudent",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = DeleteServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (DeleteServiceGrpc.class) {
        if ((getDeleteStudentMethod = DeleteServiceGrpc.getDeleteStudentMethod) == null) {
          DeleteServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DeleteService", "DeleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new DeleteServiceMethodDescriptorSupplier("DeleteStudent"))
                  .build();
          }
        }
     }
     return getDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getDeleteCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCourse",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getDeleteCourseMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getDeleteCourseMethod;
    if ((getDeleteCourseMethod = DeleteServiceGrpc.getDeleteCourseMethod) == null) {
      synchronized (DeleteServiceGrpc.class) {
        if ((getDeleteCourseMethod = DeleteServiceGrpc.getDeleteCourseMethod) == null) {
          DeleteServiceGrpc.getDeleteCourseMethod = getDeleteCourseMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "DeleteService", "DeleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new DeleteServiceMethodDescriptorSupplier("DeleteCourse"))
                  .build();
          }
        }
     }
     return getDeleteCourseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeleteServiceStub newStub(io.grpc.Channel channel) {
    return new DeleteServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeleteServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeleteServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeleteServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeleteServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DeleteServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deleteStudent(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteCourse(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCourseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeleteStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_DELETE_STUDENT)))
          .addMethod(
            getDeleteCourseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_DELETE_COURSE)))
          .build();
    }
  }

  /**
   */
  public static final class DeleteServiceStub extends io.grpc.stub.AbstractStub<DeleteServiceStub> {
    private DeleteServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeleteServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeleteServiceStub(channel, callOptions);
    }

    /**
     */
    public void deleteStudent(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCourse(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeleteServiceBlockingStub extends io.grpc.stub.AbstractStub<DeleteServiceBlockingStub> {
    private DeleteServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeleteServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeleteServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage deleteStudent(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage deleteCourse(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCourseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeleteServiceFutureStub extends io.grpc.stub.AbstractStub<DeleteServiceFutureStub> {
    private DeleteServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeleteServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeleteServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeleteServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> deleteStudent(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> deleteCourse(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_STUDENT = 0;
  private static final int METHODID_DELETE_COURSE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeleteServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeleteServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
          break;
        case METHODID_DELETE_COURSE:
          serviceImpl.deleteCourse((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
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

  private static abstract class DeleteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeleteServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DeleteService");
    }
  }

  private static final class DeleteServiceFileDescriptorSupplier
      extends DeleteServiceBaseDescriptorSupplier {
    DeleteServiceFileDescriptorSupplier() {}
  }

  private static final class DeleteServiceMethodDescriptorSupplier
      extends DeleteServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeleteServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeleteServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeleteServiceFileDescriptorSupplier())
              .addMethod(getDeleteStudentMethod())
              .addMethod(getDeleteCourseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
