package com.zc.spring.democonfigserver202;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoConfigServer202Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigServer202Application.class, args);
	}
}
