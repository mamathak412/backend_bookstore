package com.bookstore.service;

import java.util.List;

import com.bookstore.model.BDocument;
import com.bookstore.model.Book;

public interface DocumentService {
	
	 BDocument save(BDocument document);
	 
	 List<BDocument> listAll();
	 
	 List<BDocument> getDocumentByCategory(String category);
	 
	 void delete(String documentName);
	 
	 List<BDocument> getDocumentByDocumentName(String documentName);

}
