package com.myfunds.fds.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.myfunds.fds.entity.SalesChannel;
import com.myfunds.fds.entity.SalesManager;
import com.myfunds.fds.entity.VisitLog;
import com.myfunds.fds.grpc.*;
import com.myfunds.fds.mapper.SalesChannelMapper;
import com.myfunds.fds.mapper.SalesManagerMapper;
import com.myfunds.fds.mapper.VisitLogMapper;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jbk-xiao
 */
@GRpcService
@Slf4j
@Service
public class SalesManagerServiceImpl extends SalesManagerServiceGrpc.SalesManagerServiceImplBase {
    private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private final SalesManagerMapper salesManagerMapper;
    private final SalesChannelMapper salesChannelMapper;
    private final VisitLogMapper visitLogMapper;

    @Autowired
    public SalesManagerServiceImpl(
            SalesManagerMapper salesManagerMapper,
            SalesChannelMapper salesChannelMapper,
            VisitLogMapper visitLogMapper
    ) {
        this.salesManagerMapper = salesManagerMapper;
        this.salesChannelMapper = salesChannelMapper;
        this.visitLogMapper = visitLogMapper;
    }

    @Override
    public void getBaseInformation(MidInformationRequest request, StreamObserver<MidInformationResponse> responseObserver) {
        SalesManager salesManager = this.salesManagerMapper.selectByMid(request.getMid());
        MidInformationResponse response = MidInformationResponse.newBuilder()
                .setMidInfo(gson.toJson(salesManager))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getChannelList(MidInformationRequest request, StreamObserver<MidInformationResponse> responseStreamObserver) {
        List<SalesChannel> salesChannelList = this.salesChannelMapper.selectByMid(request.getMid());
        MidInformationResponse response = MidInformationResponse.newBuilder()
                .setMidInfo(gson.toJson(salesChannelList))
                .build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void getManagerVisitLogList(MidInformationRequest request, StreamObserver<MidInformationResponse> responseStreamObserver) {
        List<VisitLog> visitLogList = this.visitLogMapper.selectVisitLogByMid(request.getMid());
        MidInformationResponse response = MidInformationResponse.newBuilder()
                .setMidInfo(gson.toJson(visitLogList)).build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void getChannelVisitLogList(CidInformationRequest request, StreamObserver<CidInformationResponse> responseStreamObserver) {
        List<VisitLog> visitLogList = this.visitLogMapper.selectVisitLogByCidAndMid(request.getCid(), request.getMid());
        CidInformationResponse response = CidInformationResponse.newBuilder()
                .setCidInfo(gson.toJson(visitLogList)).build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void postVisitLog(PostVisitLogRequest request, StreamObserver<PostVisitLogResponse> responseObserver) {
        String visitLogStr = request.getVisitLog();
        log.info("visitLogStr: " + visitLogStr);
        VisitLog visitLog = gson.fromJson(visitLogStr, VisitLog.class);
        int result = this.visitLogMapper.insert(visitLog);
        int result1 = this.salesManagerMapper.addVisitNum(visitLog.getMid());
        String res =  result == result1 ? "1" : "0";
        PostVisitLogResponse response = PostVisitLogResponse.newBuilder()
                .setRes(res).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
