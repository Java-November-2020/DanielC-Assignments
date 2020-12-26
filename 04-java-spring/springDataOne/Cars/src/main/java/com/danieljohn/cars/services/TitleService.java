package com.danieljohn.cars.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieljohn.cars.models.Title;
import com.danieljohn.cars.repositories.TitleRepository;

@Service
public class TitleService {

	@Autowired
	private TitleRepository tRepo;
	
	//Create
	public Title create(Title title) {
		return this.tRepo.save(title);
	}
	
	
	
	
	
	
	
}
