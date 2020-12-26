package com.danieljohn.cars.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danieljohn.cars.models.Accessory;
import com.danieljohn.cars.services.AccessoryService;
import com.danieljohn.cars.services.CarService;

//Purpose of having multiple controllers is to help keep your side segmented/modularized
//Everything that comes off from an accessory is going to have a prefix in the URL
@Controller
@RequestMapping("/accessory")
public class AccessoryController {

	@Autowired
	private AccessoryService aService;
	@Autowired
	private CarService cService;
	
	//ModelAttributes are used when blank objects are being created
	//Model is needed because we need something to display all of the cars that we will be grabbing from our DB to append to this controller
	@GetMapping("/new")
	public String createAccessory(@ModelAttribute("accessory") Accessory accessory, Model viewModel) {
		viewModel.addAttribute("cars", this.cService.getAllCars());
		return "accessory/new.jsp";
	}
	
	//If you want to render the controllers main page, in this case /accessory, the this must be left blank ("")
	@PostMapping("")
	public String create(@Valid @ModelAttribute("accessory") Accessory accessory, BindingResult result, Model viewModel) {
		if (result.hasErrors()) {
			viewModel.addAttribute("cars", this.cService.getAllCars());
			return "accessory/new.jsp";
		}
		this.aService.create(accessory);
		return"redirect:/";
	}
}
