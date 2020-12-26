package com.danieljohn.cars.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danieljohn.cars.models.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long>{

	// this is the same as SELECT * FROM cars, it lists all the car objects we have, but give it to us in a java List
	List<Car> findAll();
}
