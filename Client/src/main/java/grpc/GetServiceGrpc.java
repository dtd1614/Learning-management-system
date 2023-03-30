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
public final class GetServiceGrpc {

  private GetServiceGrpc() {}

  public static final String SERVICE_NAME = "GetService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.UserId,
      grpc.Reservation.StudentList> getGetAllStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStudent",
      requestType = grpc.Reservation.UserId.class,
      responseType = grpc.Reservation.StudentList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.UserId,
      grpc.Reservation.StudentList> getGetAllStudentMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.UserId, grpc.Reservation.StudentList> getGetAllStudentMethod;
    if ((getGetAllStudentMethod = GetServiceGrpc.getGetAllStudentMethod) == null) {
      synchronized (GetServiceGrpc.class) {
        if ((getGetAllStudentMethod = GetServiceGrpc.getGetAllStudentMethod) == null) {
          GetServiceGrpc.getGetAllStudentMethod = getGetAllStudentMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.UserId, grpc.Reservation.StudentList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GetService", "GetAllStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.StudentList.getDefaultInstance()))
                  .setSchemaDescriptor(new GetServiceMethodDescriptorSupplier("GetAllStudent"))
                  .build();
          }
        }
     }
     return getGetAllStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.UserId,
      grpc.Reservation.CourseList> getGetAllCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCourse",
      requestType = grpc.Reservation.UserId.class,
      responseType = grpc.Reservation.CourseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.UserId,
      grpc.Reservation.CourseList> getGetAllCourseMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.UserId, grpc.Reservation.CourseList> getGetAllCourseMethod;
    if ((getGetAllCourseMethod = GetServiceGrpc.getGetAllCourseMethod) == null) {
      synchronized (GetServiceGrpc.class) {
        if ((getGetAllCourseMethod = GetServiceGrpc.getGetAllCourseMethod) == null) {
          GetServiceGrpc.getGetAllCourseMethod = getGetAllCourseMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.UserId, grpc.Reservation.CourseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GetService", "GetAllCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.CourseList.getDefaultInstance()))
                  .setSchemaDescriptor(new GetServiceMethodDescriptorSupplier("GetAllCourse"))
                  .build();
          }
        }
     }
     return getGetAllCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.UserId,
      grpc.Reservation.AccountList> getGetAllAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllAccount",
      requestType = grpc.Reservation.UserId.class,
      responseType = grpc.Reservation.AccountList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.UserId,
      grpc.Reservation.AccountList> getGetAllAccountMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.UserId, grpc.Reservation.AccountList> getGetAllAccountMethod;
    if ((getGetAllAccountMethod = GetServiceGrpc.getGetAllAccountMethod) == null) {
      synchronized (GetServiceGrpc.class) {
        if ((getGetAllAccountMethod = GetServiceGrpc.getGetAllAccountMethod) == null) {
          GetServiceGrpc.getGetAllAccountMethod = getGetAllAccountMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.UserId, grpc.Reservation.AccountList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "GetService", "GetAllAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.UserId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.AccountList.getDefaultInstance()))
                  .setSchemaDescriptor(new GetServiceMethodDescriptorSupplier("GetAllAccount"))
                  .build();
          }
        }
     }
     return getGetAllAccountMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetServiceStub newStub(io.grpc.Channel channel) {
    return new GetServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GetServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GetServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GetServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllStudent(grpc.Reservation.UserId request,
        io.grpc.stub.StreamObserver<grpc.Reservation.StudentList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllStudentMethod(), responseObserver);
    }

    /**
     */
    public void getAllCourse(grpc.Reservation.UserId request,
        io.grpc.stub.StreamObserver<grpc.Reservation.CourseList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCourseMethod(), responseObserver);
    }

    /**
     */
    public void getAllAccount(grpc.Reservation.UserId request,
        io.grpc.stub.StreamObserver<grpc.Reservation.AccountList> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllAccountMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.UserId,
                grpc.Reservation.StudentList>(
                  this, METHODID_GET_ALL_STUDENT)))
          .addMethod(
            getGetAllCourseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.UserId,
                grpc.Reservation.CourseList>(
                  this, METHODID_GET_ALL_COURSE)))
          .addMethod(
            getGetAllAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.UserId,
                grpc.Reservation.AccountList>(
                  this, METHODID_GET_ALL_ACCOUNT)))
          .build();
    }
  }

  /**
   */
  public static final class GetServiceStub extends io.grpc.stub.AbstractStub<GetServiceStub> {
    private GetServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllStudent(grpc.Reservation.UserId request,
        io.grpc.stub.StreamObserver<grpc.Reservation.StudentList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCourse(grpc.Reservation.UserId request,
        io.grpc.stub.StreamObserver<grpc.Reservation.CourseList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllAccount(grpc.Reservation.UserId request,
        io.grpc.stub.StreamObserver<grpc.Reservation.AccountList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllAccountMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GetServiceBlockingStub extends io.grpc.stub.AbstractStub<GetServiceBlockingStub> {
    private GetServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Reservation.StudentList getAllStudent(grpc.Reservation.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.CourseList getAllCourse(grpc.Reservation.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.AccountList getAllAccount(grpc.Reservation.UserId request) {
      return blockingUnaryCall(
          getChannel(), getGetAllAccountMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GetServiceFutureStub extends io.grpc.stub.AbstractStub<GetServiceFutureStub> {
    private GetServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GetServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GetServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.StudentList> getAllStudent(
        grpc.Reservation.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.CourseList> getAllCourse(
        grpc.Reservation.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.AccountList> getAllAccount(
        grpc.Reservation.UserId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllAccountMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_STUDENT = 0;
  private static final int METHODID_GET_ALL_COURSE = 1;
  private static final int METHODID_GET_ALL_ACCOUNT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_STUDENT:
          serviceImpl.getAllStudent((grpc.Reservation.UserId) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.StudentList>) responseObserver);
          break;
        case METHODID_GET_ALL_COURSE:
          serviceImpl.getAllCourse((grpc.Reservation.UserId) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.CourseList>) responseObserver);
          break;
        case METHODID_GET_ALL_ACCOUNT:
          serviceImpl.getAllAccount((grpc.Reservation.UserId) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.AccountList>) responseObserver);
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

  private static abstract class GetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetService");
    }
  }

  private static final class GetServiceFileDescriptorSupplier
      extends GetServiceBaseDescriptorSupplier {
    GetServiceFileDescriptorSupplier() {}
  }

  private static final class GetServiceMethodDescriptorSupplier
      extends GetServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetServiceFileDescriptorSupplier())
              .addMethod(getGetAllStudentMethod())
              .addMethod(getGetAllCourseMethod())
              .addMethod(getGetAllAccountMethod())
              .build();
        }
      }
    }
    return result;
  }
}
