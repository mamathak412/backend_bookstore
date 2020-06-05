package com.bookstore.model;

public class Book {
	
	private String bookId;
	
	private String bookName;
	
	private String bookDescription;
	
	private String rating;
	
	private String link;
	
	private String bookImage;
	
	private String cost;
	
	private String author;
	
	public Book(String bookId, String bookName, String bookDescription, String rating, String link, String bookImage,
			String cost, String author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookDescription = bookDescription;
		this.rating = rating;
		this.link = link;
		this.bookImage = bookImage;
		this.cost = cost;
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookDescription() {
		return bookDescription;
	}

	public void setBookDescription(String bookDescription) {
		this.bookDescription = bookDescription;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getLink() {
		return link;
	}

	public void setLikes(String link) {
		this.link = link;
	}

	public String getBookImage() {
		return bookImage;
	}

	public void setBookImage(String bookImage) {
		this.bookImage = bookImage;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
