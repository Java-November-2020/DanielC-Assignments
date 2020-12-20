package com.danieljohn.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CounterController {
	@RequestMapping(value="/counter", method=RequestMethod.GET)
	public String index(HttpSession session, Model viewModel) {;
		if(session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		}
		return "counter.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String counter(HttpSession sesh) {
		int counter = (int)sesh.getAttribute("counter");
		sesh.setAttribute("counter", counter + 1);
		return "index.jsp";
	}
	
	@RequestMapping(value="/counterTwo", method=RequestMethod.GET)
	public String CounterTwo(HttpSession sesh) {
		int counter = (int)sesh.getAttribute("counter");
		sesh.setAttribute("counter", counter + 2);
		return "counterTwo.jsp";
	}
	
	@RequestMapping(value="/reset", method=RequestMethod.GET)
	public String reset(HttpSession sesh) {
		sesh.setAttribute("counter", 0);
		return "redirect:/";
	}
}
