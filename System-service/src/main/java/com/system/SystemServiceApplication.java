package com.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.system.mapper"})
@SpringBootApplication
public class SystemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemServiceApplication.class, args);
	}
}
