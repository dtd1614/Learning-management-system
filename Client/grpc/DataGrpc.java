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

import exception.NullDataException;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Data.proto")
public final class DataGrpc {

  private DataGrpc() {}

  public static final String SERVICE_NAME = "Data";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.EmptyRequest,
      grpc.DataOuterClass.GetAllStudentResponse> getGetAllStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllStudent",
      requestType = grpc.DataOuterClass.EmptyRequest.class,
      responseType = grpc.DataOuterClass.GetAllStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.EmptyRequest,
      grpc.DataOuterClass.GetAllStudentResponse> getGetAllStudentMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.EmptyRequest, grpc.DataOuterClass.GetAllStudentResponse> getGetAllStudentMethod;
    if ((getGetAllStudentMethod = DataGrpc.getGetAllStudentMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getGetAllStudentMethod = DataGrpc.getGetAllStudentMethod) == null) {
          DataGrpc.getGetAllStudentMethod = getGetAllStudentMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.EmptyRequest, grpc.DataOuterClass.GetAllStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "GetAllStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.GetAllStudentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("GetAllStudent"))
                  .build();
          }
        }
     }
     return getGetAllStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.EmptyRequest,
      grpc.DataOuterClass.GetAllCourseResponse> getGetAllCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCourse",
      requestType = grpc.DataOuterClass.EmptyRequest.class,
      responseType = grpc.DataOuterClass.GetAllCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.EmptyRequest,
      grpc.DataOuterClass.GetAllCourseResponse> getGetAllCourseMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.EmptyRequest, grpc.DataOuterClass.GetAllCourseResponse> getGetAllCourseMethod;
    if ((getGetAllCourseMethod = DataGrpc.getGetAllCourseMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getGetAllCourseMethod = DataGrpc.getGetAllCourseMethod) == null) {
          DataGrpc.getGetAllCourseMethod = getGetAllCourseMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.EmptyRequest, grpc.DataOuterClass.GetAllCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "GetAllCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.GetAllCourseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("GetAllCourse"))
                  .build();
          }
        }
     }
     return getGetAllCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getAddStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddStudent",
      requestType = grpc.DataOuterClass.StringRequest.class,
      responseType = grpc.DataOuterClass.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getAddStudentMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse> getAddStudentMethod;
    if ((getAddStudentMethod = DataGrpc.getAddStudentMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getAddStudentMethod = DataGrpc.getAddStudentMethod) == null) {
          DataGrpc.getAddStudentMethod = getAddStudentMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "AddStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("AddStudent"))
                  .build();
          }
        }
     }
     return getAddStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStudent",
      requestType = grpc.DataOuterClass.StringRequest.class,
      responseType = grpc.DataOuterClass.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = DataGrpc.getDeleteStudentMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getDeleteStudentMethod = DataGrpc.getDeleteStudentMethod) == null) {
          DataGrpc.getDeleteStudentMethod = getDeleteStudentMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "DeleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("DeleteStudent"))
                  .build();
          }
        }
     }
     return getDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddCourse",
      requestType = grpc.DataOuterClass.StringRequest.class,
      responseType = grpc.DataOuterClass.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getAddCourseMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse> getAddCourseMethod;
    if ((getAddCourseMethod = DataGrpc.getAddCourseMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getAddCourseMethod = DataGrpc.getAddCourseMethod) == null) {
          DataGrpc.getAddCourseMethod = getAddCourseMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "AddCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("AddCourse"))
                  .build();
          }
        }
     }
     return getAddCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getDeleteCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCourse",
      requestType = grpc.DataOuterClass.StringRequest.class,
      responseType = grpc.DataOuterClass.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getDeleteCourseMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse> getDeleteCourseMethod;
    if ((getDeleteCourseMethod = DataGrpc.getDeleteCourseMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getDeleteCourseMethod = DataGrpc.getDeleteCourseMethod) == null) {
          DataGrpc.getDeleteCourseMethod = getDeleteCourseMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "DeleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("DeleteCourse"))
                  .build();
          }
        }
     }
     return getDeleteCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getMakeReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MakeReservation",
      requestType = grpc.DataOuterClass.StringRequest.class,
      responseType = grpc.DataOuterClass.BooleanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest,
      grpc.DataOuterClass.BooleanResponse> getMakeReservationMethod() {
    io.grpc.MethodDescriptor<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse> getMakeReservationMethod;
    if ((getMakeReservationMethod = DataGrpc.getMakeReservationMethod) == null) {
      synchronized (DataGrpc.class) {
        if ((getMakeReservationMethod = DataGrpc.getMakeReservationMethod) == null) {
          DataGrpc.getMakeReservationMethod = getMakeReservationMethod = 
              io.grpc.MethodDescriptor.<grpc.DataOuterClass.StringRequest, grpc.DataOuterClass.BooleanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Data", "MakeReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.DataOuterClass.BooleanResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new DataMethodDescriptorSupplier("MakeReservation"))
                  .build();
          }
        }
     }
     return getMakeReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataStub newStub(io.grpc.Channel channel) {
    return new DataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DataFutureStub(channel);
  }

  /**
   */
  public static abstract class DataImplBase implements io.grpc.BindableService {

    /**
     * @throws NullDataException 
     */
    public void getAllStudent(grpc.DataOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.GetAllStudentResponse> responseObserver) throws NullDataException {
      asyncUnimplementedUnaryCall(getGetAllStudentMethod(), responseObserver);
    }

    /**
     * @throws NullDataException 
     */
    public void getAllCourse(grpc.DataOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.GetAllCourseResponse> responseObserver) throws NullDataException {
      asyncUnimplementedUnaryCall(getGetAllCourseMethod(), responseObserver);
    }

    /**
     */
    public void addStudent(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteStudent(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    public void addCourse(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCourseMethod(), responseObserver);
    }

    /**
     */
    public void deleteCourse(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCourseMethod(), responseObserver);
    }

    /**
     */
    public void makeReservation(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getMakeReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.EmptyRequest,
                grpc.DataOuterClass.GetAllStudentResponse>(
                  this, METHODID_GET_ALL_STUDENT)))
          .addMethod(
            getGetAllCourseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.EmptyRequest,
                grpc.DataOuterClass.GetAllCourseResponse>(
                  this, METHODID_GET_ALL_COURSE)))
          .addMethod(
            getAddStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.StringRequest,
                grpc.DataOuterClass.BooleanResponse>(
                  this, METHODID_ADD_STUDENT)))
          .addMethod(
            getDeleteStudentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.StringRequest,
                grpc.DataOuterClass.BooleanResponse>(
                  this, METHODID_DELETE_STUDENT)))
          .addMethod(
            getAddCourseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.StringRequest,
                grpc.DataOuterClass.BooleanResponse>(
                  this, METHODID_ADD_COURSE)))
          .addMethod(
            getDeleteCourseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.StringRequest,
                grpc.DataOuterClass.BooleanResponse>(
                  this, METHODID_DELETE_COURSE)))
          .addMethod(
            getMakeReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.DataOuterClass.StringRequest,
                grpc.DataOuterClass.BooleanResponse>(
                  this, METHODID_MAKE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class DataStub extends io.grpc.stub.AbstractStub<DataStub> {
    private DataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataStub(channel, callOptions);
    }

    /**
     */
    public void getAllStudent(grpc.DataOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.GetAllStudentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCourse(grpc.DataOuterClass.EmptyRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.GetAllCourseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStudent(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCourse(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCourse(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void makeReservation(grpc.DataOuterClass.StringRequest request,
        io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMakeReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataBlockingStub extends io.grpc.stub.AbstractStub<DataBlockingStub> {
    private DataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.DataOuterClass.GetAllStudentResponse getAllStudent(grpc.DataOuterClass.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.DataOuterClass.GetAllCourseResponse getAllCourse(grpc.DataOuterClass.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.DataOuterClass.BooleanResponse addStudent(grpc.DataOuterClass.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.DataOuterClass.BooleanResponse deleteStudent(grpc.DataOuterClass.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.DataOuterClass.BooleanResponse addCourse(grpc.DataOuterClass.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.DataOuterClass.BooleanResponse deleteCourse(grpc.DataOuterClass.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.DataOuterClass.BooleanResponse makeReservation(grpc.DataOuterClass.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getMakeReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataFutureStub extends io.grpc.stub.AbstractStub<DataFutureStub> {
    private DataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DataFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.GetAllStudentResponse> getAllStudent(
        grpc.DataOuterClass.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.GetAllCourseResponse> getAllCourse(
        grpc.DataOuterClass.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.BooleanResponse> addStudent(
        grpc.DataOuterClass.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.BooleanResponse> deleteStudent(
        grpc.DataOuterClass.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.BooleanResponse> addCourse(
        grpc.DataOuterClass.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.BooleanResponse> deleteCourse(
        grpc.DataOuterClass.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.DataOuterClass.BooleanResponse> makeReservation(
        grpc.DataOuterClass.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMakeReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_STUDENT = 0;
  private static final int METHODID_GET_ALL_COURSE = 1;
  private static final int METHODID_ADD_STUDENT = 2;
  private static final int METHODID_DELETE_STUDENT = 3;
  private static final int METHODID_ADD_COURSE = 4;
  private static final int METHODID_DELETE_COURSE = 5;
  private static final int METHODID_MAKE_RESERVATION = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
        try {
	      switch (methodId) {
	        case METHODID_GET_ALL_STUDENT:
				serviceImpl.getAllStudent((grpc.DataOuterClass.EmptyRequest) request,
				      (io.grpc.stub.StreamObserver<grpc.DataOuterClass.GetAllStudentResponse>) responseObserver);
	          break;
	        case METHODID_GET_ALL_COURSE:
	          serviceImpl.getAllCourse((grpc.DataOuterClass.EmptyRequest) request,
	              (io.grpc.stub.StreamObserver<grpc.DataOuterClass.GetAllCourseResponse>) responseObserver);
	          break;
	        case METHODID_ADD_STUDENT:
	          serviceImpl.addStudent((grpc.DataOuterClass.StringRequest) request,
	              (io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse>) responseObserver);
	          break;
	        case METHODID_DELETE_STUDENT:
	          serviceImpl.deleteStudent((grpc.DataOuterClass.StringRequest) request,
	              (io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse>) responseObserver);
	          break;
	        case METHODID_ADD_COURSE:
	          serviceImpl.addCourse((grpc.DataOuterClass.StringRequest) request,
	              (io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse>) responseObserver);
	          break;
	        case METHODID_DELETE_COURSE:
	          serviceImpl.deleteCourse((grpc.DataOuterClass.StringRequest) request,
	              (io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse>) responseObserver);
	          break;
	        case METHODID_MAKE_RESERVATION:
	          serviceImpl.makeReservation((grpc.DataOuterClass.StringRequest) request,
	              (io.grpc.stub.StreamObserver<grpc.DataOuterClass.BooleanResponse>) responseObserver);
	          break;
	        default:
	          throw new AssertionError();
	      }
		} catch (NullDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

  private static abstract class DataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.DataOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Data");
    }
  }

  private static final class DataFileDescriptorSupplier
      extends DataBaseDescriptorSupplier {
    DataFileDescriptorSupplier() {}
  }

  private static final class DataMethodDescriptorSupplier
      extends DataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataFileDescriptorSupplier())
              .addMethod(getGetAllStudentMethod())
              .addMethod(getGetAllCourseMethod())
              .addMethod(getAddStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .addMethod(getAddCourseMethod())
              .addMethod(getDeleteCourseMethod())
              .addMethod(getMakeReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
