package com.myfunds.fds.mapper;

import com.myfunds.fds.entity.SalesChannel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SalesChannelMapperTest {

    @Autowired
    private SalesChannelMapper salesChannelMapper;

    @Test
    void selectByMid() {
        List<SalesChannel> salesChannels = salesChannelMapper.selectByMid("2405315698");
        assertNotNull(salesChannels);
        System.out.println(salesChannels);
        System.out.println(salesChannels.size());
    }

    @Test
    void selectByLid() {
        List<SalesChannel> salesChannels = salesChannelMapper.selectByLid("2024052401");
        assertNotNull(salesChannels);
        System.out.println(salesChannels);
        System.out.println(salesChannels.size());
    }
}