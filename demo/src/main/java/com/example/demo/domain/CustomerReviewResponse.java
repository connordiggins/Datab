package com.example.demo.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class CustomerReviewResponse {

	BigDecimal reviewid;
	String custEmail;
	BigDecimal restid;
	String reviewTitle;
	String reviewDesc;
	Timestamp reviewDate;
	BigDecimal rating;
	String reviewerName;
	String restReviewed;

	public CustomerReviewResponse(BigDecimal reviewid, String custEmail,
			BigDecimal restid, String reviewTitle, String reviewDesc,
			Timestamp reviewDate, BigDecimal rating) {
		super();
		this.reviewid = reviewid;
		this.custEmail = custEmail;
		this.restid = restid;
		this.reviewTitle = reviewTitle;
		this.reviewDesc = reviewDesc;
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
		return reviewDesc;
	}

	public void setReviewDesc(String reviewDesc) {
		this.reviewDesc = reviewDesc;
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
	
	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}
	
	public String getRestaurantReviewed() {
		return restReviewed;
	}

	public void setRestReviewed(String restReviewed) {
		this.restReviewed = restReviewed;
	}
}