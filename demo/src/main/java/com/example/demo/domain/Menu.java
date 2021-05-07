package com.example.demo.domain;

import java.math.BigDecimal;

public class Menu {

	BigDecimal restid;
	String foodName;
	BigDecimal price;

	public Menu(BigDecimal restid, String foodName, BigDecimal price) {
		super();
		this.restid = restid;
		this.foodName = foodName;
		this.price = price;
	}

	public BigDecimal getRestid() {
		return restid;
	}

	public void setRestid(BigDecimal restid) {
		this.restid = restid;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}