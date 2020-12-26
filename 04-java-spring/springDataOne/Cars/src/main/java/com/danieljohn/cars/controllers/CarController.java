package com.danieljohn.cars.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.danieljohn.cars.models.Car;
import com.danieljohn.cars.models.Title;
import com.danieljohn.cars.models.User;
import com.danieljohn.cars.services.CarService;
import com.danieljohn.cars.services.TitleService;
import com.danieljohn.cars.services.UserService;

//Why is this here? Why not RestController?
@Controller
@RequestMapping("/cars")
public class CarController {

	//DEPENDENICES
	//This is another way to do dependency injection
	@Autowired
	private CarService cService;
	
	@Autowired
	private TitleService tService;
	
	@Autowired
	private UserService uService;
	
	// @GetMapping("/") is the same as @RequestMapping("/", method=RequestMethod.GET)
	// @PostMaping() is used for POSTs
	
	@GetMapping("")
	public String index(Model viewModel, HttpSession session) {
		if(session.getAttribute("user_id").equals(null)) {
			return "redirect:/";
		}
		User user = this.uService.getSingleUser((Long)session.getAttribute("user_id"));
		List<Car> allCars = this.cService.getAllCars();	
		viewModel.addAttribute("allCars", allCars);
		viewModel.addAttribute("user", user);
			return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addCar(@ModelAttribute("car") Car car) {
		return "add.jsp";
	}
	
	//On a PostMapping you never want to render a page, you redirect
	//New way with JSTL forms to add a car
	@PostMapping("/add")
	public String addC(@Valid @ModelAttribute("car") Car car, BindingResult result) {
		if(result.hasErrors()) {
			return "add.jsp";
		}
		this.cService.createCar(car);
		return "redirect:/";
	}
	
	//Old WAY TO DO ERRORS
	@PostMapping("/addOldWay")
	public String addCarToDB(@RequestParam("make") String make, @RequestParam("model") String model, @RequestParam("color") String color,
		@RequestParam("year") int year, @RequestParam("transmission") String transmission, RedirectAttributes rAttr) {
		ArrayList<String> errors = new ArrayList<String>();
		if(make.equals("")) {
			errors.add("Hey there, you forgot to add a make!");
		}
		if(errors.size() > 0) {
			for(String e : errors) {
				rAttr.addFlashAttribute("errors", e);
			}
			return "redirect:/add";
		}
		this.cService.createCarOldWay(make, model, color, year, transmission);
		return "redirect:/";
	}
	
	
	@GetMapping("/{id}")
	public String updateCar(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("title") Title title, @ModelAttribute("car") Car car) {
		viewModel.addAttribute("car", cService.getSingleCar(id));
		return "show.jsp";
	}
	
	@PostMapping("/addTitle")
	public String addTitle(@Valid @ModelAttribute("title") Title title, BindingResult result, Model viewModel) {
		Long carId = title.getCar().getId();
		if (result.hasErrors()) {
			viewModel.addAttribute("car", cService.getSingleCar(carId));
			return "show.jsp";
		} else {
			this.tService.create(title);
			return "redirect:/";
		}
		
	}
	
	//This is the only thing you need to do in order to have a delete function, besides allow the functionality on the front end
	@GetMapping("/delete/{id}")
	public String deleteCar(@PathVariable("id") Long id) {
		this.cService.deleteCar(id);
		return "redirect:/";
	}
	
	//Process Editing Car Details
	//Valid, ModelAttribute, and Binding Result must be written in this order
	@PostMapping("/edit/{id}")
	public String editCar(@Valid @ModelAttribute("car") Car car, BindingResult result, @PathVariable("id") Long id, Model viewModel, @ModelAttribute("title") Title title) {
		Long carId = car.getId();
		if(result.hasErrors()) {
		//here if result finds errors, we cannot redirect, we have to re-render the page until correct attributes are added.
			viewModel.addAttribute("car", cService.getSingleCar(carId));
			return "show.jsp";
		}
		this.cService.updateCar(car);
		return "redirect:/" + carId;
	}
	
	//Adding likes to a car
	@GetMapping("/like/{id}")
	//We want to know which car is going to be liked so id = car id
	public String like(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		Long carId = id;
		User liker = this.uService.getSingleUser(userId);
		Car likedCar = this.cService.getSingleCar(carId);
		this.cService.addLiker(liker, likedCar);
		return "redirect:/cars";
	}
	
	//Removes likes from a car
	@GetMapping("/unlike/{id}")
	//We want to know which car is going to be liked so id = car id
	public String unlike(@PathVariable("id") Long id, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		Long carId = id;
		User liker = this.uService.getSingleUser(userId);
		Car likedCar = this.cService.getSingleCar(carId);
		this.cService.removeLiker(liker, likedCar);
		return "redirect:/cars";
	}
	
	
	
}
