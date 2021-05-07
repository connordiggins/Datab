package com.example.demo.domain;

import java.math.BigDecimal;

public class RestaurantCustomer {

	String email;
	String fname;
	String minit;
	String lname;
	String phone;
	String password;
	BigDecimal streetno;
	String streetname;
	String city;
	String state;
	BigDecimal zip;

	public RestaurantCustomer(String email, String fname, String minit,
			String lname, String phone, String password,
			BigDecimal streetno, String streetname, String city, String state, BigDecimal zip) {
		super();
		this.email = email;
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.phone = phone;
		this.password = password;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getFullName() {
		return fname;
	}

}