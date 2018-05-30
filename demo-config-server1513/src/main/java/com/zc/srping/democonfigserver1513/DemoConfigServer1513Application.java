package com.zc.srping.democonfigserver1513;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoConfigServer1513Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigServer1513Application.class, args);
	}
}
