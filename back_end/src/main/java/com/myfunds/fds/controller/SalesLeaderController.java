package com.myfunds.fds.controller;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.stp.StpUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.myfunds.fds.config.satoken.AuthConst;
import com.myfunds.fds.entity.SalesChannel;
import com.myfunds.fds.entity.SalesLeader;
import com.myfunds.fds.entity.SalesManager;
import com.myfunds.fds.entity.VisitLog;
import com.myfunds.fds.grpc.*;
import com.myfunds.fds.util.sg.AjaxJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author jbk-xiao
 * @version 2024-06-02
 */
@Slf4j
@CrossOrigin("*")
@RequestMapping("/salesLeader/")
@RestController
@Api(tags = "销售领导部分api")
public class SalesLeaderController {
    private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private final SalesLeaderServiceGrpc.SalesLeaderServiceBlockingStub salesLeaderServiceBlockingStub;

    @Autowired
    public SalesLeaderController(SalesLeaderServiceGrpc.SalesLeaderServiceBlockingStub salesLeaderServiceBlockingStub) {
        this.salesLeaderServiceBlockingStub = salesLeaderServiceBlockingStub;
    }

    @ApiOperation(value = "接收传入的lid，并与已登录用户的token对比，匹配则返回用户主页所有信息。")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "lid", value = "用户ID", required = true, paramType = "path")
    })
    @GetMapping("/baseInformation/{lid}")
    public AjaxJson getBaseInformation(@PathVariable("lid") String lid) {
        log.info("Get UserInfo: {}", lid);
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
            return AjaxJson.getNotLogin();
        }
        log.info("Get loginId: {}", loginId);
        if (!loginId.equals(lid)) {
            return AjaxJson.getNotJur("用户信息不一致！");
        }
        int roleId = 0;
        if (StpUtil.hasPermission(AuthConst.R1)) {
            roleId = 1;
        }
        if (StpUtil.hasPermission(AuthConst.R2)) {
            roleId = 2;
        }
        LidInformationResponse lidInformationResponse = this.salesLeaderServiceBlockingStub
                .getBaseInformation(LidInformationRequest.newBuilder().setLid(lid).build());
//                        .setUserId(userId).setRoleId(roleId).build());
        String baseInformation = lidInformationResponse.getLidInfo();
        log.info("Response: {}, taking {}", baseInformation, System.currentTimeMillis() - start);
        if (baseInformation.isEmpty()) return AjaxJson.getError("账户未激活！");
        return AjaxJson.getSuccessData(gson.fromJson(baseInformation, SalesLeader.class));
    }

    @ApiOperation(value = "依据领导id返回团队经理列表。")
    @GetMapping("/managerList/{lid}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "lid", value = "领导ID", required = true, paramType = "path")
    })
    public AjaxJson getManagerList(@PathVariable("lid") String lid) {
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
        if (!loginId.equals(lid)) {
            return AjaxJson.getNotJur("您没有权限查看！");
        }
        log.info("Get loginId: {}", loginId);
        LidInformationResponse lidInformationResponse = this.salesLeaderServiceBlockingStub.getManagerList(
                LidInformationRequest.newBuilder().setLid(lid).build()
        );
        String managerList = lidInformationResponse.getLidInfo();
        log.info("Response: {}, taking {}", managerList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(managerList, new TypeToken<List<SalesManager>>() {}.getType()));
    }

    @ApiOperation(value = "依据领导（团队）id返回团队负责所有渠道列表。")
    @GetMapping("/teamChannelList/{lid}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "lid", value = "用户ID", required = true, paramType = "path")
    })
    public AjaxJson getTeamChannelList(@PathVariable("lid") String lid) {
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
        if (!loginId.equals(lid)) {
            return AjaxJson.getNotJur("您没有权限查看！");
        }
        log.info("Get loginId: {}", loginId);
        LidInformationResponse lidInformationResponse = this.salesLeaderServiceBlockingStub.getTeamChannelList(
                LidInformationRequest.newBuilder().setLid(lid).build()
        );
        String teamChannelList = lidInformationResponse.getLidInfo();
        log.info("Response: {}, taking {}", teamChannelList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(teamChannelList, new TypeToken<List<SalesChannel>>() {}.getType()));
    }

    @ApiOperation(value = "依据领导（团队）id返回团队负责所有拜访记录列表。")
    @GetMapping("/teamVisitLogList/{lid}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "lid", value = "用户ID", required = true, paramType = "path")
    })
    public AjaxJson getTeamVisitLogList(@PathVariable("lid") String lid) {
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
        if (!loginId.equals(lid)) {
            return AjaxJson.getNotJur("您没有权限查看！");
        }
        log.info("Get loginId: {}", loginId);
        LidInformationResponse lidInformationResponse = this.salesLeaderServiceBlockingStub.getTeamVisitLogList(
                LidInformationRequest.newBuilder().setLid(lid).build()
        );
        String teamVisitLogList = lidInformationResponse.getLidInfo();
        log.info("Response: {}, taking {}", teamVisitLogList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(teamVisitLogList, new TypeToken<List<VisitLog>>() {}.getType()));
    }

//    @ApiOperation(value = "依据经理id返回经理负责所有拜访记录列表。")
//    @GetMapping("/managerVisitLogList/{mid}")
//    @ApiImplicitParams({
//            @ApiImplicitParam(name = "mid", value = "用户ID", required = true, paramType = "path")
//    })
//    public AjaxJson getManagerVisitLogList(@PathVariable("mid") String mid) {
//        long start = System.currentTimeMillis();
//        String loginId;
//        try {
//            loginId = StpUtil.getLoginIdAsString();
//        } catch (NotLoginException e) {
//            log.info("Not login...");
////            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
//            return AjaxJson.getNotLogin();
//        }
//        if (!loginId.equals(mid)) {
//            return AjaxJson.getNotJur("您没有权限查看！");
//        }
//        log.info("Get loginId: {}", loginId);
//        MidInformationResponse midInformationResponse = this.salesManagerServiceBlockingStub.getManagerVisitLogList(
//                MidInformationRequest.newBuilder().setMid(mid).build()
//        );
//        String managerVisitLogList = midInformationResponse.getMidInfo();
//        log.info("Response: {}, taking {}", managerVisitLogList, System.currentTimeMillis() - start);
//        return AjaxJson.getSuccessData(gson.fromJson(managerVisitLogList, new TypeToken<List<VisitLog>>() {}.getType()));
//    }

    @ApiOperation(value = "依据渠道id返回渠道和团队负责所有拜访记录列表。")
    @GetMapping("/channelVisitLogList/{cid}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "cid", value = "渠道ID", required = true, paramType = "path")
    })
    public AjaxJson getChannelVisitLogList(@PathVariable("cid") String cid) {
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
//        if (!loginId.equals(cid)) {
//            return AjaxJson.getNotJur("您没有权限查看！");
//        }
        log.info("Get loginId: {}", loginId);
        LeaderCidInformationResponse leaderCidInformationResponse = this.salesLeaderServiceBlockingStub.getChannelVisitLogList(
                LeaderCidInformationRequest.newBuilder().setCid(cid).setLid(loginId).build()
        );
        String channelVisitLogList = leaderCidInformationResponse.getCidInfo();
        log.info("Response: {}, taking {}", channelVisitLogList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(channelVisitLogList, new TypeToken<List<VisitLog>>() {}.getType()));
    }
}
