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
public final class AddServiceGrpc {

  private AddServiceGrpc() {}

  public static final String SERVICE_NAME = "AddService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getAddStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStudent",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getAddStudentMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getAddStudentMethod;
    if ((getAddStudentMethod = AddServiceGrpc.getAddStudentMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getAddStudentMethod = AddServiceGrpc.getAddStudentMethod) == null) {
          AddServiceGrpc.getAddStudentMethod = getAddStudentMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AddService", "AddStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("AddStudent"))
                  .build();
          }
        }
     }
     return getAddStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCourse",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getAddCourseMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getAddCourseMethod;
    if ((getAddCourseMethod = AddServiceGrpc.getAddCourseMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getAddCourseMethod = AddServiceGrpc.getAddCourseMethod) == null) {
          AddServiceGrpc.getAddCourseMethod = getAddCourseMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AddService", "AddCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("AddCourse"))
                  .build();
          }
        }
     }
     return getAddCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getMakeReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeReservation",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getMakeReservationMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getMakeReservationMethod;
    if ((getMakeReservationMethod = AddServiceGrpc.getMakeReservationMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getMakeReservationMethod = AddServiceGrpc.getMakeReservationMethod) == null) {
          AddServiceGrpc.getMakeReservationMethod = getMakeReservationMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AddService", "MakeReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("MakeReservation"))
                  .build();
          }
        }
     }
     return getMakeReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getAddAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAccount",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getAddAccountMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getAddAccountMethod;
    if ((getAddAccountMethod = AddServiceGrpc.getAddAccountMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getAddAccountMethod = AddServiceGrpc.getAddAccountMethod) == null) {
          AddServiceGrpc.getAddAccountMethod = getAddAccountMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AddService", "AddAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("AddAccount"))
                  .build();
          }
        }
     }
     return getAddAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.Null> getAddLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddLog",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.Null.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.Null> getAddLogMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.Null> getAddLogMethod;
    if ((getAddLogMethod = AddServiceGrpc.getAddLogMethod) == null) {
      synchronized (AddServiceGrpc.class) {
        if ((getAddLogMethod = AddServiceGrpc.getAddLogMethod) == null) {
          AddServiceGrpc.getAddLogMethod = getAddLogMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.Null>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "AddService", "AddLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.Null.getDefaultInstance()))
                  .setSchemaDescriptor(new AddServiceMethodDescriptorSupplier("AddLog"))
                  .build();
          }
        }
     }
     return getAddLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AddServiceStub newStub(io.grpc.Channel channel) {
    return new AddServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AddServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AddServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AddServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AddServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AddServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addStudent(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStudentMethod(), responseObserver);
    }

    /**
     */
    public void addCourse(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCourseMethod(), responseObserver);
    }

    /**
     */
    public void makeReservation(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeReservationMethod(), responseObserver);
    }

    /**
     */
    public void addAccount(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAccountMethod(), responseObserver);
    }

    /**
     */
    public void addLog(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.Null> responseObserver) {
      asyncUnimplementedUnaryCall(getAddLogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_ADD_STUDENT)))
          .addMethod(
            getAddCourseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_ADD_COURSE)))
          .addMethod(
            getMakeReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_MAKE_RESERVATION)))
          .addMethod(
            getAddAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_ADD_ACCOUNT)))
          .addMethod(
            getAddLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.Null>(
                  this, METHODID_ADD_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class AddServiceStub extends io.grpc.stub.AbstractStub<AddServiceStub> {
    private AddServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddServiceStub(channel, callOptions);
    }

    /**
     */
    public void addStudent(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCourse(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeReservation(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAccount(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addLog(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.Null> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AddServiceBlockingStub extends io.grpc.stub.AbstractStub<AddServiceBlockingStub> {
    private AddServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage addStudent(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getAddStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage addCourse(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getAddCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage makeReservation(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getMakeReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage addAccount(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getAddAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.Null addLog(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getAddLogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AddServiceFutureStub extends io.grpc.stub.AbstractStub<AddServiceFutureStub> {
    private AddServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AddServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AddServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AddServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> addStudent(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> addCourse(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> makeReservation(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> addAccount(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.Null> addLog(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getAddLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_STUDENT = 0;
  private static final int METHODID_ADD_COURSE = 1;
  private static final int METHODID_MAKE_RESERVATION = 2;
  private static final int METHODID_ADD_ACCOUNT = 3;
  private static final int METHODID_ADD_LOG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AddServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AddServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_STUDENT:
          serviceImpl.addStudent((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
          break;
        case METHODID_ADD_COURSE:
          serviceImpl.addCourse((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
          break;
        case METHODID_MAKE_RESERVATION:
          serviceImpl.makeReservation((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
          break;
        case METHODID_ADD_ACCOUNT:
          serviceImpl.addAccount((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
          break;
        case METHODID_ADD_LOG:
          serviceImpl.addLog((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.Null>) responseObserver);
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

  private static abstract class AddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AddServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AddService");
    }
  }

  private static final class AddServiceFileDescriptorSupplier
      extends AddServiceBaseDescriptorSupplier {
    AddServiceFileDescriptorSupplier() {}
  }

  private static final class AddServiceMethodDescriptorSupplier
      extends AddServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AddServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AddServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AddServiceFileDescriptorSupplier())
              .addMethod(getAddStudentMethod())
              .addMethod(getAddCourseMethod())
              .addMethod(getMakeReservationMethod())
              .addMethod(getAddAccountMethod())
              .addMethod(getAddLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
