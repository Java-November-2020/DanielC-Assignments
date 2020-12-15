package com.danieljohn.gettingfamiliarwithrouting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	@RequestMapping("/coding")
	public String hello() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
}
