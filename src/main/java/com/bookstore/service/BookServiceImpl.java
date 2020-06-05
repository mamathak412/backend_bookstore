package com.bookstore.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookstore.model.Book;

@Component
public class BookServiceImpl {
	
	@Autowired
	private DataCenter dataCenter;
	
	public Map<String, List<Book>> prepareBooksByCategory() {
		Map<String, List<Book>> categoryBooks = new HashMap<String, List<Book>>();
		
		categoryBooks.put("Devops", dataCenter.getDevopsBooks());
		
		categoryBooks.put("Jenkins", dataCenter.getJenkinsBooks());
		
		categoryBooks.put("Aws", dataCenter.getAWSBooks());
		
		return categoryBooks;
	}

	public List<Book> getBookByCategory(String category) {
		List<Book> books = new ArrayList<>();
		for(Map.Entry<String, List<Book>> entry : prepareBooksByCategory().entrySet()) {
			if(entry.getKey().equals(category)) {
				books.addAll(entry.getValue());
			}
		}
		return books;
	}

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		books.addAll(dataCenter.getDevopsBooks());
		books.addAll(dataCenter.getJenkinsBooks());
		books.addAll(dataCenter.getAWSBooks());
		return books;
	}
	
	
}
