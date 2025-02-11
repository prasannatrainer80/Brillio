package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	 private static Logger logger = Logger.getLogger(HelloController.class);
	@GetMapping(value="/")
	public String test() {
		logger.info("Hello...Satwik");
		logger.info("Log4j is working");
		return "Spring Boot Aws...";
	}
	@GetMapping(value="/hello")
	public String sayHello() {
		return "Welcome to Spring Boot...";
	}
}
