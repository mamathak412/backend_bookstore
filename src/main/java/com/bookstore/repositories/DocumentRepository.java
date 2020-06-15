package com.bookstore.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.model.BDocument;

@Repository
public interface DocumentRepository extends CrudRepository<BDocument, String> {
	
	List<BDocument> findByCategoryName(String categoryName);
	
	void deleteByDocumentName(String documentName);
	
	List<BDocument> findByDocumentName(String documentName);

}
