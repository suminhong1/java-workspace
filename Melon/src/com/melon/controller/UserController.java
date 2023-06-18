package com.melon.controller;

import java.util.ArrayList;
import java.util.List;

import com.melon.model.User;

public class UserController {
	User user = null;
	private List<User> userList;
	
	
	public UserController() {
		userList = new ArrayList<>();
	}

	public void signUp(User user) {
		userList.add(user);
	}
	
	public boolean login(String id, String password) {
	    for (User user : userList) {
	        if (user.getId().equals(id) && user.getPassword().equals(password)) {
	            return true;
	        }
	    }
	    return false;
	}
	public User viewProfile(String id) {
		for(User user : userList) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	}
