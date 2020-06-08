package com.bookstore.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookstore.model.Book;
import com.bookstore.repositories.BookRepository;

@Component
public class BookServiceImpl implements BookService{
	
	@Autowired
	private DataCenter dataCenter;
	
	@Autowired
	private BookRepository bookRepository;
	
	public Map<String, List<Book>> prepareBooksByCategory() {
		Map<String, List<Book>> categoryBooks = new HashMap<String, List<Book>>();
		
		categoryBooks.put("Devops", dataCenter.getDevopsBooks());
		
		categoryBooks.put("Jenkins", dataCenter.getJenkinsBooks());
		
		categoryBooks.put("Aws", dataCenter.getAWSBooks());
		
		return categoryBooks;
	}

	public List<Book> getBookByCategory(String category) {
		/*List<Book> books = new ArrayList<Book>();
		for(Map.Entry<String, List<Book>> entry : prepareBooksByCategory().entrySet()) {
			if(entry.getKey().equals(category)) {
				books.addAll(entry.getValue());
			}
		}*/
		return bookRepository.findByCategoryName(category);
	}

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		books.addAll(dataCenter.getDevopsBooks());
		books.addAll(dataCenter.getJenkinsBooks());
		books.addAll(dataCenter.getAWSBooks());
		return books;
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
		 bookRepository.deleteBybookName(bookName);
	}
	
	
	
	
}
