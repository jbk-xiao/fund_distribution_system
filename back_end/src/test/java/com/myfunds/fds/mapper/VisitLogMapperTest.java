package com.myfunds.fds.mapper;

import com.google.gson.Gson;
import com.myfunds.fds.entity.VisitLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class VisitLogMapperTest {

    @Autowired
    VisitLogMapper visitLogMapper;

    Gson gson = new Gson();

    @Test
    void insert() {
        VisitLog visitLog = new VisitLog("0360200019", "中国工商银行股份有限公司广州期货交易所支行",
                "中国工商银行股份有限公司", "2405315698", "陈子琪", "2024052401", "2024-05-31",
                "这是一条拜访摘要", "这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。" +
                "这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。这是一条拜访详情。");
        int result = visitLogMapper.insert(visitLog);
        assertEquals(1, result);
    }

    @Test
    void selectVisitLogByCid() {
        List<VisitLog> visitLogList = visitLogMapper.selectVisitLogByCid("0360200019");
        System.out.println(gson.toJson(visitLogList));
    }

    @Test
    void selectVisitLogByMid() {
        List<VisitLog> visitLogList = visitLogMapper.selectVisitLogByMid("2405315698");
        System.out.println(gson.toJson(visitLogList));
    }

    @Test
    void selectVisitLogByVid() {
    }
}