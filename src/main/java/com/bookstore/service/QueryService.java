package com.bookstore.service;

import java.util.List;

import com.bookstore.model.Query;

public interface QueryService {
	
	 Query save(Query video);
	 
	 List<Query> listAll();
	 
	 List<Query> getQueryByCategory(String category);
	 
	 void delete(String queryName);

}
