package com.example.demo.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CustomerReview {

	BigDecimal reviewid;
	String custEmail;
	BigDecimal restid;
	String reviewTitle;
	String reviewDescr;
	Timestamp reviewDate;
	BigDecimal rating;

	public CustomerReview() {}
	
	public CustomerReview(BigDecimal reviewid, String custEmail,
			BigDecimal restid, String reviewTitle, String reviewDescr,
			Timestamp reviewDate, BigDecimal rating) {
		super();
		this.reviewid = reviewid;
		this.custEmail = custEmail;
		this.restid = restid;
		this.reviewTitle = reviewTitle;
		this.reviewDescr = reviewDescr;
		this.reviewDate = reviewDate;
		this.rating = rating;
	}

	public BigDecimal getReviewid() {
		return reviewid;
	}

	public void setReviewid(BigDecimal reviewid) {
		this.reviewid = reviewid;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public BigDecimal getRestid() {
		return restid;
	}

	public void setRestid(BigDecimal restid) {
		this.restid = restid;
	}

	public String getReviewTitle() {
		return reviewTitle;
	}

	public void setReviewTitle(String reviewTitle) {
		this.reviewTitle = reviewTitle;
	}

	public String getReviewDesc() {
		return reviewDescr;
	}

	public void setReviewDesc(String reviewDescr) {
		this.reviewDescr = reviewDescr;
	}

	public Timestamp getReviewDate() {
		return reviewDate;
	}

	public void setReviewDate(Timestamp reviewDate) {
		this.reviewDate = reviewDate;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public void setRating(BigDecimal rating) {
		this.rating = rating;
	}
}