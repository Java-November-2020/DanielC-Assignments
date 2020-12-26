package com.danieljohn.cars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danieljohn.cars.models.Title;

@Repository
public interface TitleRepository extends CrudRepository<Title, Long>{

	
	
	
}
