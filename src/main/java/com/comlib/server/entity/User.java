package com.comlib.server.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//User represents all persons on the library. This could be community admins, people who have books to offer and those
//who want to lend books.

@Entity
public class User {
	
	private @Id @GeneratedValue Long userId;
	private String email;
	private String name;
	private String password;
	private boolean isActive;
	
	public User() {
		super();
	}

	public User(Long userId, String email, String name, String password, boolean isActive) {
		super();
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.password = password;
		this.isActive = isActive;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", name=" + name 
				+ ", isActive=" + isActive + "]";
	}

}
