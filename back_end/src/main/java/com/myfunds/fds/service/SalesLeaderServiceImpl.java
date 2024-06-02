package com.myfunds.fds.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.myfunds.fds.entity.SalesChannel;
import com.myfunds.fds.entity.SalesLeader;
import com.myfunds.fds.entity.SalesManager;
import com.myfunds.fds.entity.VisitLog;
import com.myfunds.fds.grpc.*;
import com.myfunds.fds.mapper.SalesChannelMapper;
import com.myfunds.fds.mapper.SalesLeaderMapper;
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
 * @version 2021-05-16-23:44
 */
@GRpcService
@Slf4j
@Service
public class SalesLeaderServiceImpl extends SalesLeaderServiceGrpc.SalesLeaderServiceImplBase {
    private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private final SalesLeaderMapper salesLeaderMapper;
    private final SalesManagerMapper salesManagerMapper;
    private final SalesChannelMapper salesChannelMapper;
    private final VisitLogMapper visitLogMapper;

    @Autowired
    public SalesLeaderServiceImpl(
            SalesLeaderMapper salesLeaderMapper,
            SalesManagerMapper salesManagerMapper,
            SalesChannelMapper salesChannelMapper,
            VisitLogMapper visitLogMapper
    ) {
        this.salesLeaderMapper = salesLeaderMapper;
        this.salesManagerMapper = salesManagerMapper;
        this.salesChannelMapper = salesChannelMapper;
        this.visitLogMapper = visitLogMapper;
    }

    @Override
    public void getBaseInformation(LidInformationRequest request, StreamObserver<LidInformationResponse> responseObserver) {
        SalesLeader salesLeader = this.salesLeaderMapper.selectByLid(request.getLid());
        LidInformationResponse response = LidInformationResponse.newBuilder()
                .setLidInfo(gson.toJson(salesLeader))
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getManagerList(LidInformationRequest request, StreamObserver<LidInformationResponse> responseStreamObserver) {
        List<SalesManager> salesManagerList = this.salesManagerMapper.selectByLid(request.getLid());
        LidInformationResponse response = LidInformationResponse.newBuilder()
                .setLidInfo(gson.toJson(salesManagerList)).build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }

    @Override
    public void getTeamChannelList(LidInformationRequest request, StreamObserver<LidInformationResponse> responseObserver) {
        List<SalesChannel> salesChannelList = this.salesChannelMapper.selectByLid(request.getLid());
        LidInformationResponse response = LidInformationResponse.newBuilder()
                .setLidInfo(gson.toJson(salesChannelList)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getTeamVisitLogList(LidInformationRequest request, StreamObserver<LidInformationResponse> responseObserver) {
        List<VisitLog> visitLogList = this.visitLogMapper.selectVisitLogByLid(request.getLid());
        LidInformationResponse response = LidInformationResponse.newBuilder()
                .setLidInfo(gson.toJson(visitLogList)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getChannelVisitLogList(LeaderCidInformationRequest request, StreamObserver<LeaderCidInformationResponse> responseObserver) {
        List<VisitLog> visitLogList = this.visitLogMapper.selectVisitLogByCidAndLid(request.getCid(), request.getLid());
        LeaderCidInformationResponse response = LeaderCidInformationResponse.newBuilder()
                .setCidInfo(gson.toJson(visitLogList)).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
