package com.danieljohn.dojoSurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {

		@RequestMapping(value=("/"), method=RequestMethod.GET)
		public String index() {
			return "index.jsp";
		}
		
		
		 @RequestMapping(value=("/viewData"), method=RequestMethod.POST) 
		 public String viewData(HttpSession session, @RequestParam("name") String name, @RequestParam("IDE") String ide, @RequestParam("favLang") String favLang, 
		@RequestParam("comments") String comments, Model modelView) 
		 {
			session.setAttribute("name", name);
			session.setAttribute("IDE", ide);
			session.setAttribute("favLang", favLang);
			session.setAttribute("comments", comments);
			modelView.addAttribute("name");
			modelView.addAttribute("IDE");
			modelView.addAttribute("favLang");
			modelView.addAttribute("comments"); 
			
			return "viewData.jsp"; 
		 }
}
