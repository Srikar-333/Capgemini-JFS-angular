package com.OnDemandCarWash.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="ReviewAndRating")
public class ReviewAndRating {
	@Id
	private int id;
	@Field
	private String washername;
	@Field
	private int rating;
	@Field
	private String review;
	public ReviewAndRating(int id, String washername, int rating, String review) {
		super();
		this.id = id;
		this.washername = washername;
		this.rating = rating;
		this.review = review;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWashername() {
		return washername;
	}
	public void setWashername(String washername) {
		this.washername = washername;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	

}
