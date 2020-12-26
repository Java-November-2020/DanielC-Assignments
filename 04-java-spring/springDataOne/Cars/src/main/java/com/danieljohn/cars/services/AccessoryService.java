package com.danieljohn.cars.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieljohn.cars.models.Accessory;
import com.danieljohn.cars.repositories.AccessoryRepository;

@Service
public class AccessoryService {

	@Autowired
	private AccessoryRepository aRepo;
	
	public Accessory create(Accessory accessory) {
		return this.aRepo.save(accessory);
	}
}
