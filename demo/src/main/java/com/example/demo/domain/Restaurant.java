package com.example.demo.domain;

import java.math.BigDecimal;

public class Restaurant {

	BigDecimal restid;
	String rname;
	String phone;
	String email;
	String hours;
	String diningtype;
	BigDecimal streetno;
	String streetname;
	String city;
	String state;
	BigDecimal zip;
	String pricerange;
	String deliveryflag;
	String outdoorseatingflag;

	public Restaurant(BigDecimal restid,
			String rname, String phone,
			String email, String hours,
			String diningtype, BigDecimal streetno,
			String streetname, String city,
			String state, BigDecimal zip,
			String pricerange, String deliveryflag,
			String outdoorseatingflag) {
		super();
		this.restid = restid;
		this.rname = rname;
		this.phone = phone;
		this.email = email;
		this.hours = hours;
		this.diningtype = diningtype;
		this.streetno = streetno;
		this.streetname = streetname;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.pricerange = pricerange;
		this.deliveryflag = deliveryflag;
		this.outdoorseatingflag = outdoorseatingflag;
	}

	public BigDecimal getRestid() {
		return restid;
	}

	public void setRestid(BigDecimal restid) {
		this.restid = restid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getDiningType() {
		return diningtype;
	}

	public void setDiningType(String diningtype) {
		this.diningtype = diningtype;
	}

	public BigDecimal getStreetNo() {
		return streetno;
	}

	public void setStreetNo(BigDecimal streetno) {
		this.streetno = streetno;
	}

	public String getStreetName() {
		return streetname;
	}

	public void setStreetName(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public BigDecimal getZip() {
		return zip;
	}

	public void setZip(BigDecimal zip) {
		this.zip = zip;
	}
	
	public String getPrice() {
		return pricerange;
	}
	
	public void setPrice(String pricerange) {
		this.pricerange = pricerange;
	}

	public String getDeliveryFlag() {
		return deliveryflag;
	}

	public void setDeliveryFlag(String deliveryflag) {
		this.deliveryflag = deliveryflag;
	}

	public String getOutdoorSeatingFlag() {
		return outdoorseatingflag;
	}

	public void setOutdoorSeatingFlag(String outdoorseatingflag) {
		this.outdoorseatingflag = outdoorseatingflag;
	}
}