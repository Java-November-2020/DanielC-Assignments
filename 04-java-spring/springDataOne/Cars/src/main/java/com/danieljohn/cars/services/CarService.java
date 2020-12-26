package com.danieljohn.cars.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.danieljohn.cars.models.Car;
import com.danieljohn.cars.models.User;
import com.danieljohn.cars.repositories.CarRepository;


@Service //tells Spring boot that this class is a service class
public class CarService {

	//The service is in charge and needs to tell the repository what to do
	//We dependency inject so that this service has access to everything the repository does
	//Dependency injection
	private CarRepository cRepo;
	
	public CarService(CarRepository repo) {
		this.cRepo = repo;
	}
	
	
	//METHOD: Get All Cars
	public List<Car> getAllCars(){
		return this.cRepo.findAll();
	}
	
	//METHOD: Get One Car
	//Returns a type optional(will return an object or not()If it exists)
	//Return the car but if not, return null
	public Car getSingleCar(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	//METHOD: Create car
	public Car createCar(Car newCar) {
		return this.cRepo.save(newCar);
	}
	
	//METHOD: Delete car
	//Void because we don't want to return anything
	// Can be String and say "We deleted " + id + " car"
	public void deleteCar(Long id) {
		this.cRepo.deleteById(id);
	}
	
	//METHOD: Update car
	public Car updateCar(Car car) {
		return this.cRepo.save(car);
	}
	
	//Create object with parameters
	public Car createCarOldWay(String make, String model, String color, int year, String transmission) {
		Car newCar = new Car(make, model, color, year, transmission);
		return this.cRepo.save(newCar);
	}
	
	//Add user to list of likers
	//Void because we don't want to return anything, we just want to add the users
	public void addLiker(User user, Car car) {
		//Get list from the car object
		List<User> likers = car.getLikers();
		//Add the liker
		likers.add(user);
		//Update the DB of likers on the car table
		this.cRepo.save(car);
	}
	
	//Remove user from list of likers (remove like)
	public void removeLiker(User user, Car car) {
		//Get list from the car object
		List<User> likers = car.getLikers();
		//Add the liker
		likers.remove(user);
		//Update the DB of likers on the car table
		this.cRepo.save(car);
	
	}
}




