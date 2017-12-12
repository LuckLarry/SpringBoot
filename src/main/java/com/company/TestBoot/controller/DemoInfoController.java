package com.company.TestBoot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.TestBoot.service.DemoInfoService;
import com.winner.po.DemoInfo;

@RestController
public class DemoInfoController {
	
	@Resource
	private DemoInfoService demoInfoService;
	
	@RequestMapping("/{id}")
	DemoInfo queryById(@PathVariable("id") Integer id){
		DemoInfo demoInfo = demoInfoService.queryById(id);
		System.out.println(demoInfo);
		return demoInfo;
	}
	
	@RequestMapping("/select/{id}")
	DemoInfo selectUserById(@PathVariable("id") Integer id){
		DemoInfo demoInfo = demoInfoService.selectUserById(id);
		System.out.println(demoInfo);
		return demoInfo;
	}
	
	@RequestMapping("/query/{id}")
	DemoInfo querUserById(@PathVariable("id") Integer id){
		DemoInfo demoInfo = demoInfoService.selectUserById(id);
		System.out.println(demoInfo);
		return demoInfo;
	}
}
