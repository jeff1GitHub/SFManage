package com.sf.manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@MapperScan("com.sf.manage.mapper")
@SpringBootApplication
public class ManageApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ManageApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ManageApplication.class, args);
		System.out.println("启动成功");
	}
}
