package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/hello")
	public String sayHello() {
		return "Welcome to Spring Boot Application...";
	}
	
	@GetMapping(value="/greet/{name}")
	public String sayHello(@PathVariable String name) {
		return "Good Morning...!"+name;
	}
	
	@GetMapping(value="/company")
	public String company() {
		return "Mphasis Client...";
	}
	
	@GetMapping(value="/topic")
	public String topic() {
		return "Spring Boot Intro...";
	}
}
