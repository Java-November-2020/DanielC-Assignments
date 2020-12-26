package com.danieljohn.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danieljohn.books.models.Book;
import com.danieljohn.books.services.BookService;

@RequestMapping("/books")
@Controller
public class BookController {
	
	@Autowired
	private BookService bService;

	
	@GetMapping("/{id}")
	public String index(@PathVariable("id") Long id, Model viewModel) {
		Book harryPotterBook = bService.getSingleBook(id);
		viewModel.addAttribute("book", harryPotterBook);
		return "main.jsp";
	}
}

