package com.danieljohn.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	

	 @RequestMapping("/") public String index(Model
	 guestName, @RequestParam(value="name", required=false, defaultValue="Human")
	 String name) { guestName.addAttribute("name", name); return "index.jsp"; }
	 
	 @RequestMapping("/lastName") public String indexLast(Model
	 guestLastName, @RequestParam(value="lastname", required = false,
	 defaultValue="") String lastName) { guestLastName.addAttribute("lastName",
	 lastName); return "index.jsp"; }
	 
}
