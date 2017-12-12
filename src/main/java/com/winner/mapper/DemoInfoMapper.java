package com.winner.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.winner.po.DemoInfo;

@Mapper
public interface DemoInfoMapper {

    DemoInfo queryById(Integer id);

}