package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.demo.domain.Restaurant;
import com.example.demo.domain.CustomerReview;
import com.example.demo.domain.Menu;
import com.example.demo.domain.Profile;
import com.example.demo.domain.RestaurantOrder;
import com.example.demo.domain.RestaurantCustomer;
import com.example.demo.domain.RestaurantOrderDetails;

@Mapper
public interface AdvisorMapper {

	//list all restaurants
	@Select("SELECT r.RESTID, r.RNAME, r.PHONE, r.EMAIL, r.HOURS, r.DININGTYPE, r.STREETNO, r.STREETNAME, r.CITY, r.STATE, r.ZIP, r.PRICERANGE, r.DELIVERYFLAG, r.OUTDOORSEATINGFLAG FROM RESTAURANT r")
	List<Restaurant> getRestaurants();
	
	//list all users
	@Select("SELECT p.USERNAME, p.PASSWORD FROM PROFILES p")
	List<Profile> getProfiles();

	//get all restaurants ratings
	@Select("SELECT c.REVIEWID, c.CUSTEMAIL, c.RESTID, c.REVIEWTITLE, c.REVIEWDESCR, c.REVIEWDATE, c.RATING FROM RESTAURANT r, CUST_REVIEW c WHERE r.RESTID = c.RESTID")
	List<CustomerReview> getRestaurantAndReview();
	
	//get all orders
	@Select("SELECT o.ONO, o.ORDERDATE, o.CUSTEMAIL, o.DINEIN, o.DELIVERY, o.PICKUP, o.PICKUPDATE, o.DELIVERYDATE, o.DINEINDATE FROM RESTAURANT_ORDER o")
	List<RestaurantOrder> getOrders();

	//submit a new rating
	@Insert("insert INTO CUST_REVIEW (REVIEWID, CUSTEMAIL, RESTID, REVIEWTITLE, REVIEWDESCR, REVIEWDATE, RATING) values(#{reviewid}, #{custEmail}, #{restid}, #{reviewTitle}, #{reviewDesc}, #{reviewDate}, #{rating})")
	void insertRating(CustomerReview custReview);

	//list all menu food items and prices for a restaurant
	@Select("select m.RESTID, m.FOODNAME, m.PRICE from RESTAURANT r, MENU m where r.RESTID = m.RESTID and r.RNAME LIKE rest_name")
	List<Menu> getMenu(@Param("rest_name") String rest_name);

	//create a new restaurant order
	@Insert("insert RESTAURANT_ORDER (ono, orderdate, custemail, orderdineinflag, orderdeliveryflag, orderpickupflag, orderpickupdate, orderdeliverydate, orderdineinreceiveddate) values(#{ono} #{orderDate} #{dineIn} #{delivery} #{pickup} #{pickupDate} #{deliveryDate} #{dineInDate})")
	void insertOrder(RestaurantOrder restaurantOrder);
	
	//create the order details
	@Insert("insert RESTAURANT_ODETAILS (ono, foodname, restid, qty) values(#{ono} #{foodName} #{restid} #{qty}")
	void insertOrderDetails(RestaurantOrderDetails restaurantOrderDetails);

	//search restaurant by name
	@Select("select r.RESTID, r.RNAME, r.PHONE, r.EMAIL, r.HOURS, r.DININGTYPE, r.STREETNO, r.STREETNAME, r.CITY, r.STATE, r.ZIP, r.PRICERANGE, r.DELIVERYFLAG, r.OUTDOORSEATINGFLAG from RESTAURANT r where r.RNAME like search_query")
	List<Restaurant> getRestaurant(@Param("search_query") String search_query);
	
	//search restaurant by id
	@Select("select r.RESTID, r.RNAME, r.PHONE, r.EMAIL, r.HOURS, r.DININGTYPE, r.STREETNO, r.STREETNAME, r.CITY, r.STATE, r.ZIP, r.PRICERANGE, r.DELIVERYFLAG, r.OUTDOORSEATINGFLAG from RESTAURANT r where r.RESTID LIKE #{search_query,jdbcType=NUMERIC}")
	List<Restaurant> getRestaurantById(@Param("search_query") BigDecimal search_query);

	//find customer account by email
	@Select("select c.EMAIL, c.FNAME, c.MINIT, c.LNAME, c.PHONE, c.PASSWORD, c.STREETNO, c.STREETNAME, c.CITY, c.STATE, c.ZIP from RESTAURANT_CUSTOMER c where c.EMAIL LIKE #{search_query,jdbcType=VARCHAR}")
	List<RestaurantCustomer> getRestaurantCustomer(@Param("search_query") String search_query);

	//create customer account
	@Insert("insert RESTAURANT_CUSTOMER (email, fname, minit, lname, phone, password, streetno, streetname, city, state, zip) values(#{email} #{fname} #{minit} #{lname} #{phone} #{password} #{streetno} #{streetname} #{city} #{state} #{zip})")
	void insertCustomer(RestaurantCustomer restaurantCustomer);
}