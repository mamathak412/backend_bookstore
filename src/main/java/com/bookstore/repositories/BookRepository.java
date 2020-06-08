package com.bookstore.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
	
	List<Book> findByCategoryName(String categoryName);
	
	void deleteByBookName(String bookName);

}
