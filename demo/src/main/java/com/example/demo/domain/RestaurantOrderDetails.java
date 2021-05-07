package com.example.demo.domain;

import java.math.BigDecimal;

public class RestaurantOrderDetails {

	BigDecimal ono;
	String foodName;
	BigDecimal restid;
	BigDecimal qty;

	public RestaurantOrderDetails(BigDecimal ono, String foodName, BigDecimal restid, BigDecimal qty) {
		super();
		this.ono = ono;
		this.foodName = foodName;
		this.restid = restid;
		this.qty = qty;
	}
}