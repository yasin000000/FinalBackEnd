package com.app.Exam.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "roles")
public class Roles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long rollId;
	
	private String rollName; 
   
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<UserRoll> userRolls=new ArrayList<>();

	public long getRollId() {
		return rollId;
	}

	public void setRollId(long rollId) {
		this.rollId = rollId;
	}

	public String getRollName() {
		return rollName;
	}

	public void setRollName(String rollName) {
		this.rollName = rollName;
	}

	public List<UserRoll> getUserRolls() {
		return userRolls;
	}

	public void setUserRolls(List<UserRoll> userRolls) {
		this.userRolls = userRolls;
	}

	public Roles(long rollId, String rollName, List<UserRoll> userRolls) {
		super();
		this.rollId = rollId;
		this.rollName = rollName;
		this.userRolls = userRolls;
	}

	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Roles [rollId=" + rollId + ", rollName=" + rollName + ", userRolls=" + userRolls + ", getRollId()="
				+ getRollId() + ", getRollName()=" + getRollName() + ", getUserRolls()=" + getUserRolls()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
//	@ManyToOne()
//	private User user;
	
	
	
}
  