package com.cykj.admin.mapper;

import com.cykj.pojo.Bus;
import com.cykj.pojo.BusChild;
import com.cykj.pojo.BusInfo;
import com.cykj.pojo.Line;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface BusMapper {
    //分页查询巴士
    List<BusInfo> queryBus(HashMap<String, Object> condition);
    //查询单个巴士
    Bus queryOneBus(@Param("number") String number, @Param("id") int id);
    //修改巴士
    int changeBus(Bus bus);
    //新增巴士
    int insertBus(Bus bus);
    //根据线路id查询巴士信息
    List<BusChild> findBusByLineId(Line line);
}
