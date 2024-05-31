package com.myfunds.fds.mapper;

import com.myfunds.fds.entity.SalesChannel;
import com.myfunds.fds.entity.VisitLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VisitLogMapper {

    @Insert("INSERT INTO `visitLog`" +
            " (`cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`)" +
            " VALUES (#{cid}, #{channel}, #{organization}, #{mid}, #{manager}, #{lid}, #{date}," +
            " #{logAbstract}, #{detail});")
    int insert(VisitLog visitLog);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`" +
            " FROM `visitLog` WHERE `cid` = #{cid};")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    List<VisitLog> selectVisitLogByCid(@Param("cid") String cid);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`" +
            " FROM `visitLog` WHERE `mid` = #{mid};")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    List<VisitLog> selectVisitLogByMid(@Param("mid") String mid);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`" +
            " FROM `visitLog` WHERE `vid` = RIGHT(#{vid}, LENGTH(#{vid}) - 1);")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    VisitLog selectVisitLogByVid(@Param("vid") String vid);

}