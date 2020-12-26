package com.danieljohn.books.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {

		//ATTRIBUTES:
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String title;
		private String description;
		private String language;
		private int numberOfPages;
		
		
		//CONSTRUCTOR
		public Book() {
			
		}

		//GETTERS & SETTERS
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getLanguage() {
			return language;
		}

		public void setLanguage(String language) {
			this.language = language;
		}

		public int getNumberOfPages() {
			return numberOfPages;
		}

		public void setNumberOfPages(int numberOfPages) {
			this.numberOfPages = numberOfPages;
		}
	
	
}

