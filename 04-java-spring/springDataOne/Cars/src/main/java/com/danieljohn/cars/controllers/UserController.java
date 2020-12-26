package com.danieljohn.cars.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.danieljohn.cars.models.User;
import com.danieljohn.cars.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService uService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "landing.jsp";
	}
	
	@PostMapping("/register")
	//If we use session to store the id we can access session later to learn the user id's and login credentials
	//Session has a time limit between 20 - 30 minutes, it will expire after that
	public String register(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		if(result.hasErrors()) {
			//If there are validation errors, return back to view
			return "landing.jsp";
		}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/cars";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("lemail") String email, @RequestParam("lpassword") String password, 
			RedirectAttributes redirectAttrs, HttpSession session) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttrs.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User user = this.uService.getByEmail(email);
		session.setAttribute("user_id", user.getId());
		return "redirect:/cars";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	
	
}
