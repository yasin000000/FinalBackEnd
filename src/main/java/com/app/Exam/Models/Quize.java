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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@Entity
public class Quize {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long quizeid;
	
	private boolean active=false;
	
	private String title;
	
	private String maxMarks;
	
	private String description;
	
	private String noOfQuestions;
	
	@ManyToOne
	private Category category;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "quize")
	@JsonIgnore
	List<Queitions> queitions=new ArrayList<>();

	public long getQuizeid() {
		return quizeid;
	}

	public void setQuizeid(long quizeid) {
		this.quizeid = quizeid;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNoOfQuestions() {
		return noOfQuestions;
	}

	public void setNoOfQuestions(String noOfQuestions) {
		this.noOfQuestions = noOfQuestions;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Queitions> getQueitions() {
		return queitions;
	}

	public void setQueitions(List<Queitions> queitions) {
		this.queitions = queitions;
	}

	public Quize() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quize(long quizeid, boolean active, String title, String maxMarks, String description, String noOfQuestions,
			Category category, List<Queitions> queitions) {
		super();
		this.quizeid = quizeid;
		this.active = active;
		this.title = title;
		this.maxMarks = maxMarks;
		this.description = description;
		this.noOfQuestions = noOfQuestions;
		this.category = category;
		this.queitions = queitions;
	}

	@Override
	public String toString() {
		return "Quize [quizeid=" + quizeid + ", active=" + active + ", title=" + title + ", maxMarks=" + maxMarks
				+ ", description=" + description + ", noOfQuestions=" + noOfQuestions + ", category=" + category
				+ ", queitions=" + queitions + ", getQuizeid()=" + getQuizeid() + ", isActive()=" + isActive()
				+ ", getTitle()=" + getTitle() + ", getMaxMarks()=" + getMaxMarks() + ", getDescription()="
				+ getDescription() + ", getNoOfQuestions()=" + getNoOfQuestions() + ", getCategory()=" + getCategory()
				+ ", getQueitions()=" + getQueitions() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
