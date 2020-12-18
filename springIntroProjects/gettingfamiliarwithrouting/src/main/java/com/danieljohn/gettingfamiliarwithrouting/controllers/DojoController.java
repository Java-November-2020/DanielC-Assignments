package com.danieljohn.gettingfamiliarwithrouting.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	//@RequestMapping("/{part1}/")
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome";
	}
	
	@RequestMapping("/dojo/{location}")
	public String dojoCenter(@PathVariable("location") String location) {
		switch (location) {
		case "burbank":
			return "Burbank Dojo is location in SoCal";
		case "san-jose":
			return "SJ dojo is the HQ";
		}
		return "You selected " + location;
		
		//THIS DOESN'T WORK FOR SOME REASON
		//if (location == "asd") {
			//return "Burbank Dojo is located in Southern California";
		//} else if (location == "San-jose") {
			//return "SJ dojo is the headquarters";
		//} //else {
			//return "Coding Dojo is fun.";
		//}
		//return "You selected " + location;
	}

}
