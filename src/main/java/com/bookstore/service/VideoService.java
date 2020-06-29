package com.bookstore.service;

import java.util.List;

import com.bookstore.model.Video;

public interface VideoService {
	
	 Video save(Video video);
	 
	 List<Video> listAll();
	 
	 List<Video> getVideoByCategory(String category);
	 
	 void delete(String videoName);

}
