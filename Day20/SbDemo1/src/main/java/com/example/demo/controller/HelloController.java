package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "Welcome to Spring Boot..";
	}
	
	@GetMapping(value="/")
	public String defaultData() {
		return "Welcome to Brillio...";
	}
	
	@GetMapping(value="/greet/{name}")
	public String greeting(@PathVariable String name) {
		return "Good Morning...!" + name;
	}
}
