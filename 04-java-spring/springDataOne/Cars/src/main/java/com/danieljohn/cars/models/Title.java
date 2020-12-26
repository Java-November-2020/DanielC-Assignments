package com.danieljohn.cars.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="titles")
public class Title {
	//This GeneratedValue creates the id
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String vin;
	private String city;
	private String state;
	
	//RELATIONSHIP 1:1
	//The car can only have one title
	@OneToOne(fetch=FetchType.LAZY)
	//The join column is going to be what is labeled in MySQL itself.
	@JoinColumn(name="car_id")
	private Car car;
	
	//RELATIONSHIPS Many:1

	public Title() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	
	
	
	
	
	
}
