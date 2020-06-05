package com.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bookstore.model.User;

@Component
public class UserServiceImpl {

	private List<User> users = getUsers();

	public boolean signin(User user) {
		for(User userDb : users){
			if (userDb.getUserId().equals(user.getUserId()) && userDb.getPassword().equals(user.getPassword())) {
				return true;
			}
		}
		return false;
	}

	public void signup(User user) {
		users.add(user);
	}
	
	private List<User> getUsers() {
		users = new ArrayList<>();
		users.add(new User("mkrish", "Mamatha", "K", "12345", "Bangalore", "mamatha.k@gmail.com", "123456"));
		users.add(new User("admin", "Admin", "", "12345", "Bangalore", "admin@gmail.com", "123456"));
		return users;
	}
}
