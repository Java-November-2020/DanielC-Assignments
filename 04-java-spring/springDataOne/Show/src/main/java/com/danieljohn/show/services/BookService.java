package com.danieljohn.show.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieljohn.show.models.Book;
import com.danieljohn.show.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bRepo;
	
	public Book getSingleBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	
	
}
