package com.myfunds.fds.controller;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.stp.StpUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.myfunds.fds.config.satoken.AuthConst;
import com.myfunds.fds.entity.SalesChannel;
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
@RequestMapping("/salesManager/")
@RestController
@Api(tags = "销售经理部分api")
public class SalesManagerController {
    private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private final SalesManagerServiceGrpc.SalesManagerServiceBlockingStub salesManagerServiceBlockingStub;

    @Autowired
    public SalesManagerController(SalesManagerServiceGrpc.SalesManagerServiceBlockingStub salesManagerServiceBlockingStub) {
        this.salesManagerServiceBlockingStub = salesManagerServiceBlockingStub;
    }

    @ApiOperation(value = "接收传入的mid，并与已登录用户的token对比，匹配则返回用户主页所有信息。")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mid", value = "用户ID", required = true, paramType = "path")
    })
    @GetMapping("/baseInformation/{mid}")
    public AjaxJson getBaseInformation(@PathVariable("mid") String mid) {
        log.info("Get UserInfo: {}", mid);
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
            return AjaxJson.getNotLogin();
        }
        log.info("Get loginId: {}", loginId);
        if (!loginId.equals(mid)) {
            return AjaxJson.getNotJur("用户信息不一致！");
        }
        int roleId = 0;
        if (StpUtil.hasPermission(AuthConst.R1)) {
            roleId = 1;
        }
        if (StpUtil.hasPermission(AuthConst.R2)) {
            roleId = 2;
        }
        //TODO 添加是否已激活的判断
        MidInformationResponse midInformationResponse = this.salesManagerServiceBlockingStub
                .getBaseInformation(MidInformationRequest.newBuilder().setMid(mid).build());
        String baseInformation = midInformationResponse.getMidInfo();
        log.info("Response: {}, taking {}", baseInformation, System.currentTimeMillis() - start);
        if (baseInformation.isEmpty()) return AjaxJson.getError("账户未激活！");
        return AjaxJson.getSuccessData(gson.fromJson(baseInformation, SalesManager.class));
    }

    @ApiOperation(value = "依据经理id返回经理负责所有渠道列表。")
    @GetMapping("/channelList/{mid}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mid", value = "用户ID", required = true, paramType = "path")
    })
    public AjaxJson getChannelList(@PathVariable("mid") String mid) {
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
        if (!loginId.equals(mid)) {
            return AjaxJson.getNotJur("您没有权限查看！");
        }
        log.info("Get loginId: {}", loginId);
        MidInformationResponse midInformationResponse = this.salesManagerServiceBlockingStub.getChannelList(
                MidInformationRequest.newBuilder().setMid(mid).build()
        );
        String salesChannelList = midInformationResponse.getMidInfo();
        log.info("Response: {}, taking {}", salesChannelList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(salesChannelList, new TypeToken<List<SalesChannel>>() {}.getType()));
    }

    @ApiOperation(value = "依据经理id返回经理负责所有拜访记录列表。")
    @GetMapping("/managerVisitLogList/{mid}")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "mid", value = "用户ID", required = true, paramType = "path")
    })
    public AjaxJson getManagerVisitLogList(@PathVariable("mid") String mid) {
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
        if (!loginId.equals(mid)) {
            return AjaxJson.getNotJur("您没有权限查看！");
        }
        log.info("Get loginId: {}", loginId);
        MidInformationResponse midInformationResponse = this.salesManagerServiceBlockingStub.getManagerVisitLogList(
                MidInformationRequest.newBuilder().setMid(mid).build()
        );
        String managerVisitLogList = midInformationResponse.getMidInfo();
        log.info("Response: {}, taking {}", managerVisitLogList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(managerVisitLogList, new TypeToken<List<VisitLog>>() {}.getType()));
    }

    @ApiOperation(value = "依据渠道id返回渠道和经理负责所有拜访记录列表。")
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
        CidInformationResponse midInformationResponse = this.salesManagerServiceBlockingStub.getChannelVisitLogList(
                CidInformationRequest.newBuilder().setCid(cid).setMid(loginId).build()
        );
        String channelVisitLogList = midInformationResponse.getCidInfo();
        log.info("Response: {}, taking {}", channelVisitLogList, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(gson.fromJson(channelVisitLogList, new TypeToken<List<VisitLog>>() {}.getType()));
    }

    @ApiOperation(value = "依据渠道id返回渠道和经理负责所有拜访记录列表。")
    @PostMapping("/visitLog")
    public AjaxJson postVisitLog(@RequestBody VisitLog visitLog) {
        log.info("visitLog: " + visitLog);
        long start = System.currentTimeMillis();
        String loginId;
        try {
            loginId = StpUtil.getLoginIdAsString();
        } catch (NotLoginException e) {
            log.info("Not login...");
//            response.setStatus(AjaxJson.CODE_NOT_LOGIN);
            return AjaxJson.getNotLogin();
        }
        log.info("Get loginId: {}", loginId);
        PostVisitLogResponse postVisitLogResponse = this.salesManagerServiceBlockingStub.postVisitLog(
                PostVisitLogRequest.newBuilder()
                        .setVisitLog(gson.toJson(visitLog)).build()
        );
        String res = postVisitLogResponse.getRes();
        log.info("Response: {}, taking {}", res, System.currentTimeMillis() - start);
        return AjaxJson.getSuccessData(res);
    }
}
