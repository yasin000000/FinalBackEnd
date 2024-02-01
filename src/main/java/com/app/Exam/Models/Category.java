package com.app.Exam.Models;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity

public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long catagoryId;
	
	private String title;
	
	private String description;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
	@JsonIgnore
	private List<Quize> quizes=new ArrayList<>();

	public long getCatagoryId() {
		return catagoryId;
	}

	public void setCatagoryId(long catagoryId) {
		this.catagoryId = catagoryId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Quize> getQuizes() {
		return quizes;
	}

	public void setQuizes(List<Quize> quizes) {
		this.quizes = quizes;
	}

	public Category(long catagoryId, String title, String description, List<Quize> quizes) {
		super();
		this.catagoryId = catagoryId;
		this.title = title;
		this.description = description;
		this.quizes = quizes;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [catagoryId=" + catagoryId + ", title=" + title + ", description=" + description + ", quizes="
				+ quizes + ", getCatagoryId()=" + getCatagoryId() + ", getTitle()=" + getTitle() + ", getDescription()="
				+ getDescription() + ", getQuizes()=" + getQuizes() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
