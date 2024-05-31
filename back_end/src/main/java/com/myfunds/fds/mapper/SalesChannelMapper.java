package com.myfunds.fds.mapper;

import com.myfunds.fds.entity.SalesChannel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SalesChannelMapper {
    @Select("SELECT `cid`, `name`, `organization`, `province`, `city`, `zip`," +
            " `address`, `phoneNumber`, `openHours`, `longitude`, `latitude`" +
            " FROM `salesChannel`" +
            " WHERE `cid` IN (SELECT `cid` FROM `responsibility` WHERE `mid`= #{mid});")
    List<SalesChannel> selectByMid(@Param("mid") String mid);

    @Select("SELECT `cid`, `name`, `organization`, `province`, `city`, `zip`," +
            " `address`, `phoneNumber`, `openHours`, `longitude`, `latitude`" +
            " FROM `salesChannel`" +
            " WHERE `cid` IN (SELECT `cid` FROM `responsibility` WHERE `lid`= #{lid});")
    List<SalesChannel> selectByLid(@Param("lid") String lid);

}