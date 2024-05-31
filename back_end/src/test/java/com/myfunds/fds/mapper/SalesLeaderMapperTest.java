package com.myfunds.fds.mapper;

import com.google.gson.Gson;
import com.myfunds.fds.entity.SalesLeader;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalesLeaderMapperTest {

    @Autowired
    private SalesLeaderMapper salesLeaderMapper;

    Gson gson = new Gson();

    @Test
    void selectAll() {
        List<SalesLeader> salesLeaders = salesLeaderMapper.selectAll();
        assertNotNull(salesLeaders);
        System.out.println(gson.toJson(salesLeaders));
    }

    @Test
    void selectByLid() {
        SalesLeader salesLeader = salesLeaderMapper.selectByLid("0123456789");
        System.out.println(salesLeader);
    }

    @Test
    void insert() {
       int result = salesLeaderMapper.insert(new SalesLeader("0123456789", "Leader_name", "new@example.com", "team"));
       assertEquals(1, result);
    }

    @Test
    void update() {
        SalesLeader salesLeader = new SalesLeader("0123456789", "update_name", "new@example.com", "team");
        int result = salesLeaderMapper.update(salesLeader);
        assertEquals(1, result);
    }

    @Test
    void deleteByLid() {
        int result = salesLeaderMapper.deleteByLid("0123456789");
        assertEquals(1, result);
    }
}