package com.myfunds.fds.mapper;

import com.myfunds.fds.entity.SalesManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SalesManagerMapper {

    @Select("SELECT `mid`,`name`,`mail`,`lid`,`team`,`leader`,`channelNum`,`visitNum`" +
            " FROM `salesManager`" +
            " WHERE `mid` = #{mid};")
    SalesManager selectByMid(@Param("mid") String mid);

    @Select("SELECT `mid`,`name`,`mail`,`lid`,`team`,`leader`,`channelNum`,`visitNum`" +
            " FROM `salesManager`" +
            " WHERE `lid` = #{lid};")
    List<SalesManager> selectByLid(@Param("lid") String lid);
}