package com.example.demo.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class RestaurantOrder {

	BigDecimal ono;
	Timestamp orderDate;
	String custEmail;
	String dineIn;
	String delivery;
	String pickup;
	Timestamp pickupDate;
	Timestamp deliveryDate;
	Timestamp dineInDate;

	public RestaurantOrder() {}
	
	public RestaurantOrder(BigDecimal ono, Timestamp orderDate,
			String custEmail, String dineIn, String delivery,
			String pickup, Timestamp pickupDate,
			Timestamp deliveryDate, Timestamp dineInDate) {
		super();
		this.ono = ono;
		this.orderDate = orderDate;
		this.custEmail = custEmail;
		this.dineIn = dineIn;
		this.delivery = delivery;
		this.pickup = pickup;
		this.pickupDate = pickupDate;
		this.deliveryDate = deliveryDate;
		this.dineInDate = dineInDate;
	}
	
	public BigDecimal getOno() {
		return ono;
	}
	
	public void setOno(BigDecimal ono) {
		this.ono = ono;
	}
	
	public Timestamp getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(Timestamp orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getCustEmail() {
		return custEmail;
	}
	
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	
	public String getDineIn() {
		return dineIn;
	}
	
	public void setDineIn(String dineIn) {
		this.dineIn = dineIn;
	}
	
	public String getDelivery() {
		return delivery;
	}
	
	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}
	
	public String getPickup() {
		return pickup;
	}
	
	public void setPickup(String pickup) {
		this.pickup = pickup;
	}
	
	public Timestamp getPickupDate() {
		return pickupDate;
	}
	
	public void setPickupDate(Timestamp pickupDate) {
		this.pickupDate = pickupDate;
	}
	
	public Timestamp getDeliveryDate() {
		return deliveryDate;
	}
	
	public void setDeliveryDate(Timestamp deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public Timestamp getDineInDate() {
		return dineInDate;
	}
	
	public void setDineInDate(Timestamp dineInDate) {
		this.dineInDate = dineInDate;
	}

}