package com.lilo.mapper;

import com.lilo.pojo.Overview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

/**
 * Created by liming on 16-11-9.
 */
@Mapper
public interface OverviewMapper {

    @Select("select * from overview where ts = #{date}")
    Overview findByDate(@Param("date") String date);
}
