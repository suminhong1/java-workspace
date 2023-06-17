package com.musiccharts.model;

public class User {
	

	private String name;  
	private String id;
	private String password;
	private String email;
	public User() {}
	
	public User(String name, String id, String password, String email) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", email=" + email + "]";
	}
	
}
