package com.system;

import com.system.model.SysUserInfo;
import com.system.service.impl.SysUserInfoServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.system.mapper"})
@MapperScan(basePackages = {"com.system.mapper"})
@SpringBootTest(classes = SystemServiceApplication.class)
public class SystemServiceApplicationTests {

	@Resource
	private SysUserInfoServiceImpl service;

	@Test
	public void contextLoads() {
		SysUserInfo record = new SysUserInfo();
		record.setUserCode("123");
		record.setUserPwd("123");
		service.insertRecord(record);
	}

}
