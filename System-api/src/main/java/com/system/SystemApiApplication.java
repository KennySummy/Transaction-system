package com.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.system.mapper")
public class SystemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApiApplication.class, args);
	}
}
