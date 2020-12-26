package com.danieljohn.dogs.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danieljohn.dogs.models.Dog;
import com.danieljohn.dogs.services.DogService;


@RestController
@RequestMapping("/api") // adds /api to the beginning of any end-point
public class APIDogController {

	//Another way to dependency inject. It's the same thing as creating a constructor and equating it to DogService
	@Autowired
	private DogService dService;
	
	//Routes
	// this route with be /api/
	@GetMapping("/")
	public List <Dog> allDogs(){
		return this.dService.getAllDogs();
	}
	
	//Return single dog by id
	//What is this v doing?
	@GetMapping("{id}")
	public Dog getOneDog(@PathVariable("id") Long id) {
		return this.dService.getSingleDog(id);
	}
	
	//Create dog by table info from the front end
	@PostMapping("/")
	public Dog createDog(Dog newDog) {
		return this.dService.createDog(newDog);
	}
	
	// Update dog
	@PutMapping("/update{id}")
	public Dog edit(@PathVariable("id") Long id, Dog updatedDog) {
		return this.dService.updateDog(updatedDog);
	}
	
	//Delete dog by id
	@DeleteMapping("/delete{id}")
	public void deleteDog(@PathVariable("id") Long id) {
		this.dService.deleteDog(id);
	}
	
	
}
