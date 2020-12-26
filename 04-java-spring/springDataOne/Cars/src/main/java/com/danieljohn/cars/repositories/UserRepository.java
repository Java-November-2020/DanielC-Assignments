package com.danieljohn.cars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danieljohn.cars.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	//JPA custom Query
	boolean existsByEmail(String email);
	User findByEmail(String email);
	
	
	
}
