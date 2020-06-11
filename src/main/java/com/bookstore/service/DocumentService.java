package com.bookstore.service;

import java.util.List;

import com.bookstore.model.BDocument;

public interface DocumentService {
	
	 BDocument save(BDocument document);
	 
	 List<BDocument> listAll();
	 
	 List<BDocument> getDocumentByCategory(String category);
	 
	 void delete(BDocument document);

}
