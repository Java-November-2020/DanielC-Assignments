package com.danieljohn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsassignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsassignmentApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Yo! Thanks for coming here! Hope you have a blast!";
	}
	
	@RequestMapping("/random")
	public String springBoot() {
		return "Spring Boot is so great! I can't believe how easy it is!";
	}
}
