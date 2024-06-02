package com.myfunds.fds.mapper;

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

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`" +
            " FROM `visitLog` WHERE `cid` = #{cid} AND `mid` = #{mid};")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    List<VisitLog> selectVisitLogByCidAndMid(@Param("cid") String cid, @Param("mid") String mid);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`" +
            " FROM `visitLog` WHERE `cid` = #{cid} AND `lid` = #{lid};")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    List<VisitLog> selectVisitLogByCidAndLid(@Param("cid") String cid, @Param("lid") String lid);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`" +
            " FROM `visitLog` WHERE `mid` = #{mid};")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    List<VisitLog> selectVisitLogByMid(@Param("mid") String mid);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`" +
            " FROM `visitLog` WHERE `lid` = #{lid};")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    List<VisitLog> selectVisitLogByLid(@Param("lid") String lid);

    @Select("SELECT CONCAT('v', `vid`) `vid`, `cid`, `channel`, `organization`, `mid`, `manager`, `lid`, `date`, `abstract`, `detail`" +
            " FROM `visitLog` WHERE `vid` = RIGHT(#{vid}, LENGTH(#{vid}) - 1);")
    @Results({
            @Result(property = "logAbstract", column = "abstract")
    })
    VisitLog selectVisitLogByVid(@Param("vid") String vid);

}