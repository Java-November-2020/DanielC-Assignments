package com.danieljohn.cars.models;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity // Java speak for a table
@Table(name="cars") // Once up and running there will be a table in MySQL named cars
public class Car {
	
	//ATTRIBUTES
	@Id // creates an primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //tells the id that every time we create an object the id increments by 1
	private Long id; //when creating an id you want a long because it allows for lots of different models
	
	//The annotation below corresponds to "make" and it states a min and max size that must exist for that var to be valid
	@Size(min=1, max=30, message="That make size was too big or too small!")
	private String make;
	@Size(min=8, max=30)
	private String model;
	@Size(min=1, max=30)
	private String color;
	//NotNull means something has to be present
	//@NotNull is for numbers
	@NotNull
	private int year;
	//Since NotNull is for numbers; Strings can use @NotEmpty or @NotBlank
	//@NotEmpty is constrained char sequence: collection, map, array, valid as long as not null, and size length is greater than 0
	//@NotBlank: Is valid as long as something is there but it trims away whitespace. @NotEmpty will leave spaces which may cause errors
	@NotBlank
	private String transmission;
	
	// RELATIONSHIPS: 1:1
	//The title can only be linked to one car
	@OneToOne(mappedBy="car", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private Title title;
	
	//RELATIONSHIPS: 1:Many - Accessories
	@OneToMany(mappedBy="car", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Accessory> accessories;
	
	//RELATIONSHIP Many:Many
	//List of users that like a specific car
	@ManyToMany
	@JoinTable(
			//Inside these parenthesis go all our attributes
			//name of the conjoined table?
			//ManyToMany tables need to be the exact same on both models
			name="likes",
			//column of this item
			joinColumns = @JoinColumn(name="car_id"),
			//InverseJoinColumn is whatever is being joined to
			inverseJoinColumns = @JoinColumn(name="user_id")
			)
	//Which users are liking which cars
	private List<User> likers;
	
	
	//Column is needed when we want to tell the server we want this in a new column
	//DateTimeFormat formats the time and how we see it using it's pattern attribute
	//These attributes and functions allow us to track the time an object has been created or updated
	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM-dd-YY HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "MM-dd-YY HH:mm:ss")
	private Date updatedAt;
	
	//@PrePersist is a callback: Do this before any record is inserted into the DB
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	// empty constructor is also known as a bean, Plain Old Java Object
	// We need this because it creates an empty object for the user to fill it and then we can add that to the database
	public Car() {
	
	}

	//The constructor comes with the aforementioned validations but we don't need them because we will make our own on the front end
	//public Car(@Size(min = 1, max = 30) String make, @Size(min = 1, max = 30) String model,
	//@Size(min = 1, max = 30) String color, @NotNull int year, @NotBlank String transmission)
	
	public Car(String make, String model, String color, int year, String transmission) {
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.transmission = transmission;
	}

	//If we want to alter anything in the future, we need our getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public List<Accessory> getAccessories() {
		return accessories;
	}

	public void setAccessories(List<Accessory> accessories) {
		this.accessories = accessories;
	}

	public List<User> getLikers() {
		return likers;
	}

	public void setLikers(List<User> likers) {
		this.likers = likers;
	}

	

	
	
}
