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
public final class LoginServiceGrpc {

  private LoginServiceGrpc() {}

  public static final String SERVICE_NAME = "LoginService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getLoginMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getLoginMethod;
    if ((getLoginMethod = LoginServiceGrpc.getLoginMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getLoginMethod = LoginServiceGrpc.getLoginMethod) == null) {
          LoginServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LoginService", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getSignUpMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SignUp",
      requestType = grpc.Reservation.DataInfo.class,
      responseType = grpc.Reservation.ExceptionMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Reservation.DataInfo,
      grpc.Reservation.ExceptionMessage> getSignUpMethod() {
    io.grpc.MethodDescriptor<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage> getSignUpMethod;
    if ((getSignUpMethod = LoginServiceGrpc.getSignUpMethod) == null) {
      synchronized (LoginServiceGrpc.class) {
        if ((getSignUpMethod = LoginServiceGrpc.getSignUpMethod) == null) {
          LoginServiceGrpc.getSignUpMethod = getSignUpMethod = 
              io.grpc.MethodDescriptor.<grpc.Reservation.DataInfo, grpc.Reservation.ExceptionMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "LoginService", "SignUp"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.DataInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Reservation.ExceptionMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new LoginServiceMethodDescriptorSupplier("SignUp"))
                  .build();
          }
        }
     }
     return getSignUpMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LoginServiceStub newStub(io.grpc.Channel channel) {
    return new LoginServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LoginServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LoginServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LoginServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LoginServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class LoginServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void signUp(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSignUpMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getSignUpMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.Reservation.DataInfo,
                grpc.Reservation.ExceptionMessage>(
                  this, METHODID_SIGN_UP)))
          .build();
    }
  }

  /**
   */
  public static final class LoginServiceStub extends io.grpc.stub.AbstractStub<LoginServiceStub> {
    private LoginServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginServiceStub(channel, callOptions);
    }

    /**
     */
    public void login(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void signUp(grpc.Reservation.DataInfo request,
        io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LoginServiceBlockingStub extends io.grpc.stub.AbstractStub<LoginServiceBlockingStub> {
    private LoginServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage login(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.Reservation.ExceptionMessage signUp(grpc.Reservation.DataInfo request) {
      return blockingUnaryCall(
          getChannel(), getSignUpMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LoginServiceFutureStub extends io.grpc.stub.AbstractStub<LoginServiceFutureStub> {
    private LoginServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LoginServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LoginServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LoginServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> login(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.Reservation.ExceptionMessage> signUp(
        grpc.Reservation.DataInfo request) {
      return futureUnaryCall(
          getChannel().newCall(getSignUpMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_SIGN_UP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LoginServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LoginServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((grpc.Reservation.DataInfo) request,
              (io.grpc.stub.StreamObserver<grpc.Reservation.ExceptionMessage>) responseObserver);
          break;
        case METHODID_SIGN_UP:
          serviceImpl.signUp((grpc.Reservation.DataInfo) request,
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

  private static abstract class LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LoginServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Reservation.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LoginService");
    }
  }

  private static final class LoginServiceFileDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier {
    LoginServiceFileDescriptorSupplier() {}
  }

  private static final class LoginServiceMethodDescriptorSupplier
      extends LoginServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LoginServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (LoginServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LoginServiceFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getSignUpMethod())
              .build();
        }
      }
    }
    return result;
  }
}
