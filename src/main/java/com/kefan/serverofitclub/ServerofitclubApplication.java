package com.kefan.serverofitclub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kefan.serverofitclub.dao")
public class ServerofitclubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerofitclubApplication.class, args);
	}
}
