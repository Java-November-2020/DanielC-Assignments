package com.danieljohn.books.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieljohn.books.models.Book;
import com.danieljohn.books.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bRepo;
	
	public Book getSingleBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
}
