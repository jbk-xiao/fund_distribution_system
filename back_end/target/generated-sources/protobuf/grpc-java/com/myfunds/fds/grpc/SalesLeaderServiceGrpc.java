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
    comments = "Source: SalesLeaderService.proto")
public final class SalesLeaderServiceGrpc {

  private SalesLeaderServiceGrpc() {}

  public static final String SERVICE_NAME = "com.myfunds.fds.grpc.SalesLeaderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetBaseInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBaseInformation",
      requestType = com.myfunds.fds.grpc.LidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.LidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetBaseInformationMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse> getGetBaseInformationMethod;
    if ((getGetBaseInformationMethod = SalesLeaderServiceGrpc.getGetBaseInformationMethod) == null) {
      synchronized (SalesLeaderServiceGrpc.class) {
        if ((getGetBaseInformationMethod = SalesLeaderServiceGrpc.getGetBaseInformationMethod) == null) {
          SalesLeaderServiceGrpc.getGetBaseInformationMethod = getGetBaseInformationMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBaseInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesLeaderServiceMethodDescriptorSupplier("getBaseInformation"))
              .build();
        }
      }
    }
    return getGetBaseInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetManagerListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getManagerList",
      requestType = com.myfunds.fds.grpc.LidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.LidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetManagerListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse> getGetManagerListMethod;
    if ((getGetManagerListMethod = SalesLeaderServiceGrpc.getGetManagerListMethod) == null) {
      synchronized (SalesLeaderServiceGrpc.class) {
        if ((getGetManagerListMethod = SalesLeaderServiceGrpc.getGetManagerListMethod) == null) {
          SalesLeaderServiceGrpc.getGetManagerListMethod = getGetManagerListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getManagerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesLeaderServiceMethodDescriptorSupplier("getManagerList"))
              .build();
        }
      }
    }
    return getGetManagerListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetTeamChannelListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeamChannelList",
      requestType = com.myfunds.fds.grpc.LidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.LidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetTeamChannelListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse> getGetTeamChannelListMethod;
    if ((getGetTeamChannelListMethod = SalesLeaderServiceGrpc.getGetTeamChannelListMethod) == null) {
      synchronized (SalesLeaderServiceGrpc.class) {
        if ((getGetTeamChannelListMethod = SalesLeaderServiceGrpc.getGetTeamChannelListMethod) == null) {
          SalesLeaderServiceGrpc.getGetTeamChannelListMethod = getGetTeamChannelListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeamChannelList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesLeaderServiceMethodDescriptorSupplier("getTeamChannelList"))
              .build();
        }
      }
    }
    return getGetTeamChannelListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetTeamVisitLogListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeamVisitLogList",
      requestType = com.myfunds.fds.grpc.LidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.LidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest,
      com.myfunds.fds.grpc.LidInformationResponse> getGetTeamVisitLogListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse> getGetTeamVisitLogListMethod;
    if ((getGetTeamVisitLogListMethod = SalesLeaderServiceGrpc.getGetTeamVisitLogListMethod) == null) {
      synchronized (SalesLeaderServiceGrpc.class) {
        if ((getGetTeamVisitLogListMethod = SalesLeaderServiceGrpc.getGetTeamVisitLogListMethod) == null) {
          SalesLeaderServiceGrpc.getGetTeamVisitLogListMethod = getGetTeamVisitLogListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.LidInformationRequest, com.myfunds.fds.grpc.LidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeamVisitLogList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesLeaderServiceMethodDescriptorSupplier("getTeamVisitLogList"))
              .build();
        }
      }
    }
    return getGetTeamVisitLogListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LeaderCidInformationRequest,
      com.myfunds.fds.grpc.LeaderCidInformationResponse> getGetChannelVisitLogListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChannelVisitLogList",
      requestType = com.myfunds.fds.grpc.LeaderCidInformationRequest.class,
      responseType = com.myfunds.fds.grpc.LeaderCidInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LeaderCidInformationRequest,
      com.myfunds.fds.grpc.LeaderCidInformationResponse> getGetChannelVisitLogListMethod() {
    io.grpc.MethodDescriptor<com.myfunds.fds.grpc.LeaderCidInformationRequest, com.myfunds.fds.grpc.LeaderCidInformationResponse> getGetChannelVisitLogListMethod;
    if ((getGetChannelVisitLogListMethod = SalesLeaderServiceGrpc.getGetChannelVisitLogListMethod) == null) {
      synchronized (SalesLeaderServiceGrpc.class) {
        if ((getGetChannelVisitLogListMethod = SalesLeaderServiceGrpc.getGetChannelVisitLogListMethod) == null) {
          SalesLeaderServiceGrpc.getGetChannelVisitLogListMethod = getGetChannelVisitLogListMethod =
              io.grpc.MethodDescriptor.<com.myfunds.fds.grpc.LeaderCidInformationRequest, com.myfunds.fds.grpc.LeaderCidInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getChannelVisitLogList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LeaderCidInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.myfunds.fds.grpc.LeaderCidInformationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SalesLeaderServiceMethodDescriptorSupplier("getChannelVisitLogList"))
              .build();
        }
      }
    }
    return getGetChannelVisitLogListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SalesLeaderServiceStub newStub(io.grpc.Channel channel) {
    return new SalesLeaderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SalesLeaderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SalesLeaderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SalesLeaderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SalesLeaderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SalesLeaderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBaseInformation(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBaseInformationMethod(), responseObserver);
    }

    /**
     */
    public void getManagerList(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetManagerListMethod(), responseObserver);
    }

    /**
     */
    public void getTeamChannelList(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTeamChannelListMethod(), responseObserver);
    }

    /**
     */
    public void getTeamVisitLogList(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTeamVisitLogListMethod(), responseObserver);
    }

    /**
     */
    public void getChannelVisitLogList(com.myfunds.fds.grpc.LeaderCidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LeaderCidInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChannelVisitLogListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBaseInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.LidInformationRequest,
                com.myfunds.fds.grpc.LidInformationResponse>(
                  this, METHODID_GET_BASE_INFORMATION)))
          .addMethod(
            getGetManagerListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.LidInformationRequest,
                com.myfunds.fds.grpc.LidInformationResponse>(
                  this, METHODID_GET_MANAGER_LIST)))
          .addMethod(
            getGetTeamChannelListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.LidInformationRequest,
                com.myfunds.fds.grpc.LidInformationResponse>(
                  this, METHODID_GET_TEAM_CHANNEL_LIST)))
          .addMethod(
            getGetTeamVisitLogListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.LidInformationRequest,
                com.myfunds.fds.grpc.LidInformationResponse>(
                  this, METHODID_GET_TEAM_VISIT_LOG_LIST)))
          .addMethod(
            getGetChannelVisitLogListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.myfunds.fds.grpc.LeaderCidInformationRequest,
                com.myfunds.fds.grpc.LeaderCidInformationResponse>(
                  this, METHODID_GET_CHANNEL_VISIT_LOG_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class SalesLeaderServiceStub extends io.grpc.stub.AbstractStub<SalesLeaderServiceStub> {
    private SalesLeaderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalesLeaderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesLeaderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalesLeaderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBaseInformation(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBaseInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getManagerList(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetManagerListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamChannelList(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTeamChannelListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamVisitLogList(com.myfunds.fds.grpc.LidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTeamVisitLogListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChannelVisitLogList(com.myfunds.fds.grpc.LeaderCidInformationRequest request,
        io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LeaderCidInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChannelVisitLogListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SalesLeaderServiceBlockingStub extends io.grpc.stub.AbstractStub<SalesLeaderServiceBlockingStub> {
    private SalesLeaderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalesLeaderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesLeaderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalesLeaderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.myfunds.fds.grpc.LidInformationResponse getBaseInformation(com.myfunds.fds.grpc.LidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBaseInformationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.LidInformationResponse getManagerList(com.myfunds.fds.grpc.LidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetManagerListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.LidInformationResponse getTeamChannelList(com.myfunds.fds.grpc.LidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTeamChannelListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.LidInformationResponse getTeamVisitLogList(com.myfunds.fds.grpc.LidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTeamVisitLogListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.myfunds.fds.grpc.LeaderCidInformationResponse getChannelVisitLogList(com.myfunds.fds.grpc.LeaderCidInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChannelVisitLogListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SalesLeaderServiceFutureStub extends io.grpc.stub.AbstractStub<SalesLeaderServiceFutureStub> {
    private SalesLeaderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SalesLeaderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SalesLeaderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SalesLeaderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.LidInformationResponse> getBaseInformation(
        com.myfunds.fds.grpc.LidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBaseInformationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.LidInformationResponse> getManagerList(
        com.myfunds.fds.grpc.LidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetManagerListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.LidInformationResponse> getTeamChannelList(
        com.myfunds.fds.grpc.LidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTeamChannelListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.LidInformationResponse> getTeamVisitLogList(
        com.myfunds.fds.grpc.LidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTeamVisitLogListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.myfunds.fds.grpc.LeaderCidInformationResponse> getChannelVisitLogList(
        com.myfunds.fds.grpc.LeaderCidInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChannelVisitLogListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BASE_INFORMATION = 0;
  private static final int METHODID_GET_MANAGER_LIST = 1;
  private static final int METHODID_GET_TEAM_CHANNEL_LIST = 2;
  private static final int METHODID_GET_TEAM_VISIT_LOG_LIST = 3;
  private static final int METHODID_GET_CHANNEL_VISIT_LOG_LIST = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SalesLeaderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SalesLeaderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BASE_INFORMATION:
          serviceImpl.getBaseInformation((com.myfunds.fds.grpc.LidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_MANAGER_LIST:
          serviceImpl.getManagerList((com.myfunds.fds.grpc.LidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM_CHANNEL_LIST:
          serviceImpl.getTeamChannelList((com.myfunds.fds.grpc.LidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM_VISIT_LOG_LIST:
          serviceImpl.getTeamVisitLogList((com.myfunds.fds.grpc.LidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LidInformationResponse>) responseObserver);
          break;
        case METHODID_GET_CHANNEL_VISIT_LOG_LIST:
          serviceImpl.getChannelVisitLogList((com.myfunds.fds.grpc.LeaderCidInformationRequest) request,
              (io.grpc.stub.StreamObserver<com.myfunds.fds.grpc.LeaderCidInformationResponse>) responseObserver);
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

  private static abstract class SalesLeaderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SalesLeaderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.myfunds.fds.grpc.SalesLeaderServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SalesLeaderService");
    }
  }

  private static final class SalesLeaderServiceFileDescriptorSupplier
      extends SalesLeaderServiceBaseDescriptorSupplier {
    SalesLeaderServiceFileDescriptorSupplier() {}
  }

  private static final class SalesLeaderServiceMethodDescriptorSupplier
      extends SalesLeaderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SalesLeaderServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SalesLeaderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SalesLeaderServiceFileDescriptorSupplier())
              .addMethod(getGetBaseInformationMethod())
              .addMethod(getGetManagerListMethod())
              .addMethod(getGetTeamChannelListMethod())
              .addMethod(getGetTeamVisitLogListMethod())
              .addMethod(getGetChannelVisitLogListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
