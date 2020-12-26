package com.danieljohn.cars.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieljohn.cars.models.Car;
import com.danieljohn.cars.models.User;
import com.danieljohn.cars.repositories.UserRepository;

@Service
public class UserService {

		@Autowired
		private UserRepository uRepo;
		
		
		//METHOD: Register a new user
		public User registerUser(User user) {
			//generate aHash
			String hash = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
			//Set Hashed password on the users password field
			user.setPassword(hash);
			// Save the new user and their password to the data base
			return this.uRepo.save(user);
		}
		
		//METHOD: Authenticate a user
		public boolean authenticateUser(String email, String password) {
			//Make sure the user logging in is who they say they are
			//Step 1: try and query for a user by email
			User user = this.uRepo.findByEmail(email);
			
			if (user == null) {
				return false;
			}
			
			//Step 2: Check provided email against email in database
			return BCrypt.checkpw(password, user.getPassword());

		}
		
		public User getByEmail(String email) {
			return this.uRepo.findByEmail(email);
		}
		
		
		public User getSingleUser(Long id) {
			return this.uRepo.findById(id).orElse(null);
		}
		
		
		
}
