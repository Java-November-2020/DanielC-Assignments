package com.danieljohn.cars.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danieljohn.cars.models.Accessory;

@Repository
public interface AccessoryRepository extends CrudRepository<Accessory, Long> {

}
