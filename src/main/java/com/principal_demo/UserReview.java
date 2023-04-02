package com.principal_demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class UserReview {
	
	private String first_name;
	private String last_name;
	private String date;
	private String email;
	private String comment;
	
	// create default constructor
	public UserReview () {};
	
	
	public UserReview(String first_name, String last_name, String date, String email, String comment) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.date = date;
		this.email = email;
		this.comment = comment;
	}
	
	// getters and setters
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "UserReview [first_name=" + first_name + ", last_name=" + last_name + ", date=" + date + ", email="
				+ email + ", comment=" + comment + "]";
	}
	
}
