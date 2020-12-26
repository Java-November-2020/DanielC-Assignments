package com.danieljohn.show.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danieljohn.show.models.Book;
import com.danieljohn.show.services.BookService;

@RequestMapping("/books")
@Controller
public class BookController {

	@Autowired
	private BookService bService;
	
	
	@GetMapping("/{id}")
	public String index() {
		return "mainPage.jsp";
	}
	
}
//	//Editing page
//	@GetMapping("/edit/{id}")
//	public String updateCar(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("car") Book book) {
//		viewModel.addAttribute("book", bService.getSingleBook(id));
//		return "edit.jsp";
//	}
	

