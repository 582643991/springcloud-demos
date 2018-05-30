package com.zc.spring.democonfigclient202;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigClient202Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfigClient202Application.class, args);
	}

	@Value("${foo}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
}
