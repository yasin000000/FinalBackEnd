package com.app.Exam.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
public class Queitions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long queistionsId;
	
	private String answer;
	
	@Column(length = 5000)
	private String content;
	
	private String image;
	
	private String option1;
	
	private String option2;
	
	private String option3;
	
	private String option4;
	
	@ManyToOne 
	private Quize quize;

	public long getQueistionsId() {
		return queistionsId;
	}

	public void setQueistionsId(long queistionsId) {
		this.queistionsId = queistionsId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Quize getQuize() {
		return quize;
	}

	public void setQuize(Quize quize) {
		this.quize = quize;
	}

	public Queitions(long queistionsId, String answer, String content, String image, String option1, String option2,
			String option3, String option4, Quize quize) {
		super();
		this.queistionsId = queistionsId;
		this.answer = answer;
		this.content = content;
		this.image = image;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.quize = quize;
	}

	public Queitions() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Queitions [queistionsId=" + queistionsId + ", answer=" + answer + ", content=" + content + ", image="
				+ image + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4="
				+ option4 + ", quize=" + quize + ", getQueistionsId()=" + getQueistionsId() + ", getAnswer()="
				+ getAnswer() + ", getContent()=" + getContent() + ", getImage()=" + getImage() + ", getOption1()="
				+ getOption1() + ", getOption2()=" + getOption2() + ", getOption3()=" + getOption3() + ", getOption4()="
				+ getOption4() + ", getQuize()=" + getQuize() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

}
