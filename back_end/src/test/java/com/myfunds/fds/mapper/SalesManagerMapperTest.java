package com.myfunds.fds.mapper;

import com.myfunds.fds.entity.SalesManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalesManagerMapperTest {

    @Autowired
    private SalesManagerMapper salesManagerMapper;

    @Test
    void selectByMid() {
        SalesManager salesManager = salesManagerMapper.selectByMid("2405315698");
        assertNotNull(salesManager);
        System.out.println(salesManager);
    }

    @Test
    void selectByLid() {
        List<SalesManager> salesManagers = salesManagerMapper.selectByLid("2024052401");
        assertNotNull(salesManagers);
        System.out.println(salesManagers);
        System.out.println(salesManagers.size());
    }
}