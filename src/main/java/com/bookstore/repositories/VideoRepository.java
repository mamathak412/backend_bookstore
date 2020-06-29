package com.bookstore.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.model.Video;

@Repository
public interface VideoRepository extends CrudRepository<Video, String> {
	
	List<Video> findByCategoryName(String categoryName);
	
	void deleteByVideoName(String videoName);
	
	List<Video> findByVideoName(String videoName);

}
