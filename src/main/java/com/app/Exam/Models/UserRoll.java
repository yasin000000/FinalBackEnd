package com.app.Exam.Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
public class UserRoll {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private long userRollId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user; 
	
	@ManyToOne
	private Roles roles;

	public long getUserRollId() {
		return userRollId;
	}

	public void setUserRollId(long userRollId) {
		this.userRollId = userRollId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public UserRoll(long userRollId, User user, Roles roles) {
		super();
		this.userRollId = userRollId;
		this.user = user;
		this.roles = roles;
	}

	public UserRoll() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserRoll [userRollId=" + userRollId + ", user=" + user + ", roles=" + roles + ", getUserRollId()="
				+ getUserRollId() + ", getUser()=" + getUser() + ", getRoles()=" + getRoles() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
