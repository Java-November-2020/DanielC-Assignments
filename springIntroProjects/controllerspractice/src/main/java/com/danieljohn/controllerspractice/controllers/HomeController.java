package com.danieljohn.controllerspractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "Burbank");
		return "index.jsp";
	}
	
	public String home () {
		return "Hello World, whasszup";
	}
		
}
