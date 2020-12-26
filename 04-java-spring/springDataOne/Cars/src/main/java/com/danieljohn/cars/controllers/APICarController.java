package com.danieljohn.cars.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.danieljohn.cars.models.Car;
import com.danieljohn.cars.services.CarService;

//What is an API? Library?
//API's don't care about languages, they are just connectors (language independent)

//To create an API we use @RestController
//We can only return Strings, text, or xml
@RestController
//Now all of these inputs need to have this on the url before the other end points
@RequestMapping("/api")
public class APICarController {
	
	//Dependency injection
	private CarService cService;
	
	public APICarController(CarService service) 
	{
		this.cService = service;
	}
	
	//Routes
	@RequestMapping(value="")
	public List<Car> index()
	{
		return this.cService.getAllCars();
	}
	
	//@PathVariable assigns whatever is typed into the url as a variable
	@RequestMapping(value="/{id}")
	public Car getCar(@PathVariable("id") Long id) 
	{
		return this.cService.getSingleCar(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public Car createCar(Car car) 
	{
		return this.cService.createCar(car);
	}

	@RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
	public void deleteCar(@PathVariable("id") Long id) 
	{
		this.cService.deleteCar(id);
	}
	
	@RequestMapping(value="/edit/{id}", method=RequestMethod.PUT)
		public Car editCar(@PathVariable("id") Long id, Car updatedCar) {
			//we have to find the car we want to update first
			return this.cService.updateCar(updatedCar);
		}
	}
	
	
	
	
	
	
