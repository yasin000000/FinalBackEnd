package com.app.Exam.Models;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
public class Mail {
	
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public Mail(String message) {
	super();
	this.message = message;
}

public Mail() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Mail [message=" + message + ", getMessage()=" + getMessage() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
	


}
