package com.bookstore.service;

import java.util.List;

import com.bookstore.model.Book;

public interface BookService {
	
	 Book save(Book book);
	 
	 List<Book> listAll();
	 
	 List<Book> getBookByCategory(String bookName);
	 
	 void delete(Book book);

}
