package com.myfunds.fds.mapper;

import com.myfunds.fds.entity.SalesLeader;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SalesLeaderMapper {

    List<SalesLeader> selectAll();

    SalesLeader selectByLid(@Param("lid") String lid);

    int insert(SalesLeader salesLeader);

    int update(SalesLeader salesLeader);

    int deleteByLid(@Param("lid") String lid);
}