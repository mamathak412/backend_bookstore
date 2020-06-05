package com.bookstore.model;

public class User {
	
	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String password;
	
	private String address;
	
	private String emailId;
	
	private String phoneNumber;
	
	public User() {
		
	}
	
	
	public User(String userId, String firstName, String lastName, String password, String address, String emailId,
			String phoneNumber) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.address = address;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
