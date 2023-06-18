package com.webtoon.controller;

import java.util.ArrayList;
import java.util.List;

import com.webtoon.model.User;

public class UserController {
		private User logInUser;  
	    private List<User> userList;
	
	
	public UserController() {
		userList = new ArrayList<>();
	}

	public void signUp(User user) {
		userList.add(user);
	}
	 public boolean login(String id, String password) {
	        boolean loginSuccess = false;
	        for (User user : userList) {
	            if (user.getId().equals(id) && user.getPassword().equals(password)) {
	                loginSuccess = true;
	                logInUser = user;
	                break;
	            }
	        }
	        return loginSuccess;
	    }

	public User viewProfile(String id) {
		for(User user : userList) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	public boolean updateProfile(String id, String newName, String newEmail) {
		for(User user : userList) {
			if(user.getId().equals(id)) {
				user.setName(newName);
				user.setEmail(newEmail);
				return true;
			}
		}
		return false;
	}
	public boolean deleteProfile(String id) {
		for(User user : userList) {
			if(user.getId().equals(id)) {
				userList.remove(user);
				return true;
			}
		}
		return false;
	}
	}
