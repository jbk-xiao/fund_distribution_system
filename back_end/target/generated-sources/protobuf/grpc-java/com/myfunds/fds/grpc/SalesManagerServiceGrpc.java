package com.myfunds.fds.grpc;

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
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: SalesManagerService.proto")
public final class SalesManagerServiceGrpc {

  private SalesManagerServiceGrpc() {}

  public static final String SERVICE_NAME = "com.myfunds.fds.grpc.SalesManagerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest,
      com.myfunds.fds.grpc.MidInformationResponse> getGetBaseInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBaseInformation",
      requestType = com.myfunds.fds.grpc.MidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.MidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest,
      com.myfunds.fds.grpc.MidInformationResponse> getGetBaseInformationMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest, com.myfunds.fds.grpc.MidInformationResponse> getGetBaseInformationMethod;
    if ((getGetBaseInformationMethod = SalesManagerServiceGrpc.getGetBaseInformationMethod) == null) {
      synchronized (SalesManagerServiceGrpc.class) {
        if ((getGetBaseInformationMethod = SalesManagerServiceGrpc.getGetBaseInformationMethod) == null) {
          SalesManagerServiceGrpc.getGetBaseInformationMethod = getGetBaseInformationMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.MidInformationRequest, com.myfunds.fds.grpc.MidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBaseInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.MidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.MidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesManagerServiceMethodDescriptorSupplier("getBaseInformation"))
              .build();
        }
      }
    }
    return getGetBaseInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest,
      com.myfunds.fds.grpc.MidInformationResponse> getGetChannelListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChannelList",
      requestType = com.myfunds.fds.grpc.MidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.MidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest,
      com.myfunds.fds.grpc.MidInformationResponse> getGetChannelListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest, com.myfunds.fds.grpc.MidInformationResponse> getGetChannelListMethod;
    if ((getGetChannelListMethod = SalesManagerServiceGrpc.getGetChannelListMethod) == null) {
      synchronized (SalesManagerServiceGrpc.class) {
        if ((getGetChannelListMethod = SalesManagerServiceGrpc.getGetChannelListMethod) == null) {
          SalesManagerServiceGrpc.getGetChannelListMethod = getGetChannelListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.MidInformationRequest, com.myfunds.fds.grpc.MidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getChannelList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.MidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.MidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesManagerServiceMethodDescriptorSupplier("getChannelList"))
              .build();
        }
      }
    }
    return getGetChannelListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest,
      com.myfunds.fds.grpc.MidInformationResponse> getGetManagerVisitLogListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getManagerVisitLogList",
      requestType = com.myfunds.fds.grpc.MidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.MidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest,
      com.myfunds.fds.grpc.MidInformationResponse> getGetManagerVisitLogListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.MidInformationRequest, com.myfunds.fds.grpc.MidInformationResponse> getGetManagerVisitLogListMethod;
    if ((getGetManagerVisitLogListMethod = SalesManagerServiceGrpc.getGetManagerVisitLogListMethod) == null) {
      synchronized (SalesManagerServiceGrpc.class) {
        if ((getGetManagerVisitLogListMethod = SalesManagerServiceGrpc.getGetManagerVisitLogListMethod) == null) {
          SalesManagerServiceGrpc.getGetManagerVisitLogListMethod = getGetManagerVisitLogListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.MidInformationRequest, com.myfunds.fds.grpc.MidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getManagerVisitLogList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.MidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.MidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesManagerServiceMethodDescriptorSupplier("getManagerVisitLogList"))
              .build();
        }
      }
    }
    return getGetManagerVisitLogListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.CidInformationRequest,
      com.myfunds.fds.grpc.CidInformationResponse> getGetChannelVisitLogListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChannelVisitLogList",
      requestType = com.myfunds.fds.grpc.CidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.CidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.CidInformationRequest,
      com.myfunds.fds.grpc.CidInformationResponse> getGetChannelVisitLogListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.CidInformationRequest, com.myfunds.fds.grpc.CidInformationResponse> getGetChannelVisitLogListMethod;
    if ((getGetChannelVisitLogListMethod = SalesManagerServiceGrpc.getGetChannelVisitLogListMethod) == null) {
      synchronized (SalesManagerServiceGrpc.class) {
        if ((getGetChannelVisitLogListMethod = SalesManagerServiceGrpc.getGetChannelVisitLogListMethod) == null) {
          SalesManagerServiceGrpc.getGetChannelVisitLogListMethod = getGetChannelVisitLogListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.CidInformationRequest, com.myfunds.fds.grpc.CidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getChannelVisitLogList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.CidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.CidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesManagerServiceMethodDescriptorSupplier("getChannelVisitLogList"))
              .build();
        }
      }
    }
    return getGetChannelVisitLogListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.PostVisitLogRequest,
      com.myfunds.fds.grpc.PostVisitLogResponse> getPostVisitLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "postVisitLog",
      requestType = com.myfunds.fds.grpc.PostVisitLogRequest.class,
      responseType = com.myfunds.fds.grpc.PostVisitLogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.PostVisitLogRequest,
      com.myfunds.fds.grpc.PostVisitLogResponse> getPostVisitLogMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.PostVisitLogRequest, com.myfunds.fds.grpc.PostVisitLogResponse> getPostVisitLogMethod;
    if ((getPostVisitLogMethod = SalesManagerServiceGrpc.getPostVisitLogMethod) == null) {
      synchronized (SalesManagerServiceGrpc.class) {
        if ((getPostVisitLogMethod = SalesManagerServiceGrpc.getPostVisitLogMethod) == null) {
          SalesManagerServiceGrpc.getPostVisitLogMethod = getPostVisitLogMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.PostVisitLogRequest, com.myfunds.fds.grpc.PostVisitLogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "postVisitLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.PostVisitLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.PostVisitLogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesManagerServiceMethodDescriptorSupplier("postVisitLog"))
              .build();
        }
      }
    }
    return getPostVisitLogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalesManagerServiceStub newStub(io.grpc.Channel channel) {
    return new SalesManagerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalesManagerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SalesManagerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalesManagerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SalesManagerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SalesManagerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBaseInformation(com.myfunds.fds.grpc.MidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBaseInformationMethod(), responseObserver);
    }

    /**
     */
    public void getChannelList(com.myfunds.fds.grpc.MidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChannelListMethod(), responseObserver);
    }

    /**
     */
    public void getManagerVisitLogList(com.myfunds.fds.grpc.MidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetManagerVisitLogListMethod(), responseObserver);
    }

    /**
     */
    public void getChannelVisitLogList(com.myfunds.fds.grpc.CidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.CidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChannelVisitLogListMethod(), responseObserver);
    }

    /**
     */
    public void postVisitLog(com.myfunds.fds.grpc.PostVisitLogRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.PostVisitLogResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPostVisitLogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBaseInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.MidInformationRequest,
                com.myfunds.fds.grpc.MidInformationResponse>(
                  this, METHODID_GET_BASE_INFORMATION)))
          .addMethod(
            getGetChannelListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.MidInformationRequest,
                com.myfunds.fds.grpc.MidInformationResponse>(
                  this, METHODID_GET_CHANNEL_LIST)))
          .addMethod(
            getGetManagerVisitLogListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.MidInformationRequest,
                com.myfunds.fds.grpc.MidInformationResponse>(
                  this, METHODID_GET_MANAGER_VISIT_LOG_LIST)))
          .addMethod(
            getGetChannelVisitLogListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.CidInformationRequest,
                com.myfunds.fds.grpc.CidInformationResponse>(
                  this, METHODID_GET_CHANNEL_VISIT_LOG_LIST)))
          .addMethod(
            getPostVisitLogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.PostVisitLogRequest,
                com.myfunds.fds.grpc.PostVisitLogResponse>(
                  this, METHODID_POST_VISIT_LOG)))
          .build();
    }
  }

  /**
   */
  public static final class SalesManagerServiceStub extends io.grpc.stub.AbstractStub<SalesManagerServiceStub> {
    private SalesManagerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalesManagerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesManagerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalesManagerServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBaseInformation(com.myfunds.fds.grpc.MidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBaseInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChannelList(com.myfunds.fds.grpc.MidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChannelListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getManagerVisitLogList(com.myfunds.fds.grpc.MidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetManagerVisitLogListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChannelVisitLogList(com.myfunds.fds.grpc.CidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.CidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChannelVisitLogListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postVisitLog(com.myfunds.fds.grpc.PostVisitLogRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.PostVisitLogResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPostVisitLogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SalesManagerServiceBlockingStub extends io.grpc.stub.AbstractStub<SalesManagerServiceBlockingStub> {
    private SalesManagerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalesManagerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesManagerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalesManagerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.myfunds.fds.grpc.MidInformationResponse getBaseInformation(com.myfunds.fds.grpc.MidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBaseInformationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.MidInformationResponse getChannelList(com.myfunds.fds.grpc.MidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChannelListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.MidInformationResponse getManagerVisitLogList(com.myfunds.fds.grpc.MidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetManagerVisitLogListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.CidInformationResponse getChannelVisitLogList(com.myfunds.fds.grpc.CidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChannelVisitLogListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.PostVisitLogResponse postVisitLog(com.myfunds.fds.grpc.PostVisitLogRequest request) {
      return blockingUnaryCall(
          getChannel(), getPostVisitLogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SalesManagerServiceFutureStub extends io.grpc.stub.AbstractStub<SalesManagerServiceFutureStub> {
    private SalesManagerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalesManagerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesManagerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalesManagerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.MidInformationResponse> getBaseInformation(
        com.myfunds.fds.grpc.MidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBaseInformationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.MidInformationResponse> getChannelList(
        com.myfunds.fds.grpc.MidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChannelListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.MidInformationResponse> getManagerVisitLogList(
        com.myfunds.fds.grpc.MidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetManagerVisitLogListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.CidInformationResponse> getChannelVisitLogList(
        com.myfunds.fds.grpc.CidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChannelVisitLogListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.PostVisitLogResponse> postVisitLog(
        com.myfunds.fds.grpc.PostVisitLogRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPostVisitLogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BASE_INFORMATION = 0;
  private static final int METHODID_GET_CHANNEL_LIST = 1;
  private static final int METHODID_GET_MANAGER_VISIT_LOG_LIST = 2;
  private static final int METHODID_GET_CHANNEL_VISIT_LOG_LIST = 3;
  private static final int METHODID_POST_VISIT_LOG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SalesManagerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SalesManagerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BASE_INFORMATION:
          serviceImpl.getBaseInformation((com.myfunds.fds.grpc.MidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_CHANNEL_LIST:
          serviceImpl.getChannelList((com.myfunds.fds.grpc.MidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_MANAGER_VISIT_LOG_LIST:
          serviceImpl.getManagerVisitLogList((com.myfunds.fds.grpc.MidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.MidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_CHANNEL_VISIT_LOG_LIST:
          serviceImpl.getChannelVisitLogList((com.myfunds.fds.grpc.CidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.CidInformationResponse>) responseObserver);
          break;
        case METHODID_POST_VISIT_LOG:
          serviceImpl.postVisitLog((com.myfunds.fds.grpc.PostVisitLogRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.PostVisitLogResponse>) responseObserver);
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

  private static abstract class SalesManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalesManagerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.myfunds.fds.grpc.SalesManagerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalesManagerService");
    }
  }

  private static final class SalesManagerServiceFileDescriptorSupplier
      extends SalesManagerServiceBaseDescriptorSupplier {
    SalesManagerServiceFileDescriptorSupplier() {}
  }

  private static final class SalesManagerServiceMethodDescriptorSupplier
      extends SalesManagerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SalesManagerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SalesManagerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalesManagerServiceFileDescriptorSupplier())
              .addMethod(getGetBaseInformationMethod())
              .addMethod(getGetChannelListMethod())
              .addMethod(getGetManagerVisitLogListMethod())
              .addMethod(getGetChannelVisitLogListMethod())
              .addMethod(getPostVisitLogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
