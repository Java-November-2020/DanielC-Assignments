package com.danieljohn.show.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.danieljohn.show.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{

	
	
}
