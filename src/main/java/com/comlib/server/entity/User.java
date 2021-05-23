package com.comlib.server.entity;

//User represents all persons on the library. This could be community admins, people who have books to offer and those
//who want to lend books.

public class User {
	
	private int id;
	private String email;
	private String name;
	private String password;
	private boolean isActive;
	
	public User() {
		super();
	}

	public User(String email, String name, String password, boolean isActive) {
		super();
		this.email = email;
		this.name = name;
		this.password = password;
		this.isActive = isActive;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [userId=" + id + ", email=" + email + ", name=" + name 
				+ ", isActive=" + isActive + "]";
	}

}
