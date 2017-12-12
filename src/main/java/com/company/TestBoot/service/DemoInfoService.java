package com.company.TestBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.winner.mapper.DemoInfoMapper;
import com.winner.mapper.UserMapper1;
import com.winner.po.DemoInfo;
@Service
public class DemoInfoService {
	@Autowired
	private DemoInfoMapper demoInfoMapper;
	
	@Autowired
	private UserMapper1 userMapper1;
	
	public DemoInfo queryById(int id){
		return demoInfoMapper.queryById(id);
	}
	
	public DemoInfo selectUserById(int id){
		return userMapper1.selectUserById(id);
	}
}
