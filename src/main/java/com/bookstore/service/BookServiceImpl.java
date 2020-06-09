package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookstore.model.Book;
import com.bookstore.repositories.BookRepository;

@Component
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;
	

	public List<Book> getBookByCategory(String category) {
		return bookRepository.findByCategoryName(category);
	}

	@Override
	public Book save(Book book) {
		Book savedBook = bookRepository.save(book);
		return savedBook;
	}
	
	@Override
    public List<Book> listAll() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(books::add); //fun with Java 8
        return books;
    }

	@Override
	public void delete(String bookName) {
		 bookRepository.deleteByBookName(bookName);
	}
	
	
	
	
}
