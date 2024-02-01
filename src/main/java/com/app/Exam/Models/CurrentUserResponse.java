package com.app.Exam.Models;

import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor

public class CurrentUserResponse {
	private User user;
	
	private UserDetails userDetails;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public CurrentUserResponse(User user, UserDetails userDetails) {
		super();
		this.user = user;
		this.userDetails = userDetails;
	}

	public CurrentUserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CurrentUserResponse [user=" + user + ", userDetails=" + userDetails + ", getUser()=" + getUser()
				+ ", getUserDetails()=" + getUserDetails() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
