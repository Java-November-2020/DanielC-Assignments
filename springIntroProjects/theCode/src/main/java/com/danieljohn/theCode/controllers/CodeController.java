package com.danieljohn.theCode.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.GET)
	public String sMessage() {
		return "secretMessage.jsp";
	}
	
	@RequestMapping(value="/tryagain", method=RequestMethod.POST)
		public String Try(HttpSession sesh, @RequestParam(value="uGuess") String uGuess, RedirectAttributes redirectA) 
		{
			sesh.setAttribute("uGuess", uGuess);
			if (uGuess.equals("bushido"))
			{
				return "redirect:/code";
			} 
			else 
			{
				redirectA.addFlashAttribute("errors", "The path you travel is dark and lonely.");	
				return "redirect:/";
			}
		}
}
