package com.winner.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.winner.po.DemoInfo;

@Mapper
public interface UserMapper1 {
	
	@Select("select id, username, password from user where id = #{id}")
	DemoInfo selectUserById(@Param("id")Integer id);
}
