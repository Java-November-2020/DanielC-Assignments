package com.danieljohn.dogs.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.danieljohn.dogs.models.Dog;
import com.danieljohn.dogs.services.DogService;

@Controller
public class DogController {

	@Autowired
	private DogService dService;
	
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Dog> allDogs = this.dService.getAllDogs();
		viewModel.addAttribute("allDogs", allDogs);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addDog(@ModelAttribute("dog") Dog dog) {
		return "add.jsp";
	}
	
	@PostMapping("/addNewDog")
	public String addNewDog(@Valid @ModelAttribute("dog") Dog dog, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		}
		this.dService.createDog(dog);
		return "redirect:/";
		
	}
	
	
	// Old way of doing normal html form + validations from scratch
	@PostMapping("/addDog")
	public String newDog(@RequestParam("name") String name, @RequestParam("breed") String breed, @RequestParam("age") int age,
			RedirectAttributes redirectAttrs) {
		ArrayList<String> errors = new ArrayList<String>();
		if(name.equals("")) {
			//Place to say length needs to be more than one
			errors.add("Hey there, you forgot to add a name!");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
				redirectAttrs.addFlashAttribute("errors", e);
				return "redirect:/add";
			}
		}
		//System.out.println(name + breed + age);
		this.dService.createDog(name, breed, age);
		return "redirect:/";
	}
}
