package com.danieljohn.dogs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.danieljohn.dogs.models.Dog;
import com.danieljohn.dogs.repositories.DogRepository;

@Service
public class DogService {

	//Dependency inject dog repository to access the CRUD interface and FindAll Methods
	private DogRepository dRepo;
	
	
	public DogService(DogRepository dogRepository) {
		this.dRepo = dogRepository;
	}
	
	//Retrieve All
	public List<Dog> getAllDogs(){
		return this.dRepo.findAll();
	}
	
	
	//Create
	public Dog createDog(Dog newDog) {
		return this.dRepo.save(newDog);
	}
	
	public Dog createDog(String name, String breed, int age) {
		Dog newDog = new Dog(name, breed, age);
		return this.dRepo.save(newDog);
	}
	
	//Read
	public Dog getSingleDog(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	//save function is used to create and update
	//Update
	public Dog updateDog(Dog updatedDog) {
		return this.dRepo.save(updatedDog);
	}
	
	//Delete
	public void deleteDog(Long id) {
		this.dRepo.deleteById(id);
	}
}
