package com.danieljohn.cars.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	@Size(max=15)
	private String firstName;
	@NotBlank
	@Size(max=30)
	private String lastName;
	//Regular expression validation
	@Email
	private String email;
	private String password;
	//Transient says this can be part of the model but we will not be storing this in the DB
	//This is a transient field
	@Transient
	private String confirmPassword;
	
	//RELATIONSHIP Many:Many
	//Many users can like many cars + Many cars can be liked by many users
	//List of cars that the user has liked
	@ManyToMany
	@JoinTable(
			//Inside these parenthesis go all our attributes
			//name of the conjoined table?
			//ManyToMany tables need to be the exact same on both models
			name="likes",
			//first column is always the model we are making the table on
			joinColumns = @JoinColumn(name="user_id"),
			//InverseJoinColumn is whatever is being liked
			inverseJoinColumns = @JoinColumn(name="car_id")
			)
	//Which cars are being liked by users
	private List<Car> likedCars;
	
	
	public User() {
		
	}


	public String getFirstName() {
		return firstName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getConfirmPassword() {
		return confirmPassword;
	}


	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}


	public List<Car> getLikedCars() {
		return likedCars;
	}


	public void setLikedCars(List<Car> likedCars) {
		this.likedCars = likedCars;
	}
	
	
	
	
	
	
	
	
	

}