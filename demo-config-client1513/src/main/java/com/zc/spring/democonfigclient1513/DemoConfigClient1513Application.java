package com.zc.spring.democonfigclient1513;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigClient1513Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigClient1513Application.class, args);
	}

	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
}
