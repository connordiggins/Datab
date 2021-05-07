package com.example.demo.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.domain.CustomerReview;
import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.RestaurantCustomer;
import com.example.demo.domain.RestaurantOrder;
import com.example.demo.domain.RestaurantOrderDetails;

@Component
public class RestaurantDAO {

	@Autowired
	private AdvisorMapper advisorMapper;
	
	public List<Restaurant> getRestaurants() {
	
		List<Restaurant> restList = new ArrayList<Restaurant>();
			
		restList = advisorMapper.getRestaurants();
				
		return restList;
	}
	
	public List<CustomerReview> getRestaurantAndReview() {
		
		List<CustomerReview> custList = new ArrayList<CustomerReview>();
		
		custList = advisorMapper.getRestaurantAndReview();
		
		return custList;
	}
	
	public void insertRating(CustomerReview customerReview) {
		advisorMapper.insertRating(customerReview);
		
	}
	
	public List<Menu> getMenu(String rest_name){
		
		List<Menu> menuList = new ArrayList<Menu>();
		
		menuList = advisorMapper.getMenu(rest_name);
		
		return menuList;
	}
	
	public void insertOrder(RestaurantOrder restaurantOrder) {
		
		advisorMapper.insertOrder(restaurantOrder);
		
	}
	
	public void insertOrderDetails(RestaurantOrderDetails restaurantOrderDetails) {
		
		advisorMapper.insertOrderDetails(restaurantOrderDetails);
		
	}
	
	public List<Restaurant> getRestaurant(String search_query) {
		
		List<Restaurant> rest = advisorMapper.getRestaurant(search_query);
		
		return rest;
		
	}
	
	public List<Restaurant> getRestaurantById(BigDecimal search_query) {
		
		List<Restaurant> rest = advisorMapper.getRestaurantById(search_query);
		
		return rest;
		
	}
	
	public List<RestaurantCustomer> getRestaurantCustomer(String search_query){
		
		List<RestaurantCustomer> restCustList = new ArrayList<RestaurantCustomer>();
		
		restCustList = advisorMapper.getRestaurantCustomer(search_query);
		
		return restCustList;
	}
	
	public void insertCustomer(RestaurantCustomer restaurantCustomer) {
		
		advisorMapper.insertCustomer(restaurantCustomer);
		
	}
}
