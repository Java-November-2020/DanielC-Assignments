package com.danieljohn.displaydate.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		DateTimeFormatter d = DateTimeFormatter.ofPattern("EEEE-dd-MMMM-yyyy");
		String formatDateTime = LocalDateTime.now().format(d);
		String[] parsedDate = formatDateTime.split("-");
		String dayOfWeekName = parsedDate[0];
		String dayOfWeekNum = parsedDate[1];
		String monthOfYear = parsedDate[2];
		String year = parsedDate[3];
		String thisIsTheDate = dayOfWeekName + ", the " + dayOfWeekNum + " of " + monthOfYear + ", " + year;
		model.addAttribute("dayOfWeek", thisIsTheDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model modelTime) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("h-mm-a");
		String formateDateTime = LocalDateTime.now().format(f);
		String [] parsedTime = formateDateTime.split("-");
		String thisIsTheTime = parsedTime[0] + ":" + parsedTime[1] + " " + parsedTime[2];
		modelTime.addAttribute("timeOfDay", thisIsTheTime);
		return "time.jsp";		
	}
}
