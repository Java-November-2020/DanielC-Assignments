package com.danieljohn.cars.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//Establish Table in MySQL
@Entity
@Table(name="accessories")
public class Accessory {

	//ATTRIBUTES
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min = 8, max = 30)
	private String name;
	private Double price;
	private String description;
	
	//RELATIONSHIPS Many:1 - Car
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="car_id")
	private Car car;
	
	
	//CONSTRUCTOR
	public Accessory() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
}
