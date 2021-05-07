package com.example.demo.service;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.RestaurantDAO;
import com.example.demo.domain.CustomerReview;
import com.example.demo.domain.Menu;
import com.example.demo.domain.Restaurant;
import com.example.demo.domain.RestaurantCustomer;
import com.example.demo.domain.RestaurantOrder;
import com.example.demo.domain.RestaurantOrderDetails;
import com.example.demo.domain.RestaurantResponse;
import com.example.demo.domain.CustomerReviewResponse;

@Component
public class RestaurantService {
	
	@Autowired
	RestaurantDAO restDAO;
	
	public List<RestaurantResponse> getRestaurants() {
		RestaurantResponse r;
		List<Restaurant> restList = restDAO.getRestaurants();
		List<RestaurantResponse> responseList = new ArrayList<RestaurantResponse>();
		for (int i = 0; i < restList.size(); i++) {
			r = (new RestaurantResponse(restList.get(i).getRestid(),
			restList.get(i).getRname(), restList.get(i).getPhone(),
			restList.get(i).getEmail(), restList.get(i).getHours(),
			restList.get(i).getDiningType(), restList.get(i).getStreetNo(),
			restList.get(i).getStreetName(), restList.get(i).getCity(),
			restList.get(i).getState(), restList.get(i).getZip(),
			restList.get(i).getPrice(), restList.get(i).getDeliveryFlag(),
			restList.get(i).getOutdoorSeatingFlag()));
			r.setAddress(r.getStreetNo().toString() + " " + r.getStreetName().toString() + " " + r.getCity().toString() + ", " + r.getState().toString() + " " + r.getZip().toString());
			responseList.add(r);
		}
		return responseList;
	}
	
	public List<CustomerReviewResponse> getRestaurantAndReview() {
		CustomerReviewResponse r;
		List<RestaurantCustomer> c;
		List<Restaurant> rest;
		List<CustomerReview> reviewList = restDAO.getRestaurantAndReview();
		List<CustomerReviewResponse> responseList = new ArrayList<CustomerReviewResponse>();
		for (int i = 0; i < reviewList.size(); i++) {
			r = (new CustomerReviewResponse(reviewList.get(i).getReviewid(),
					reviewList.get(i).getCustEmail(), reviewList.get(i).getRestid(),
					reviewList.get(i).getReviewTitle(), reviewList.get(i).getReviewDesc(),
					reviewList.get(i).getReviewDate(), reviewList.get(i).getRating()));
			c = getRestaurantCustomer(r.getCustEmail());
			rest = getRestaurantById(r.getRestid());
			r.setReviewerName(c.get(0).getFullName());
			r.setRestReviewed(rest.get(0).getRname());
			responseList.add(r);
		}
		return responseList;
	}
	
	public void insertRating(CustomerReview customerReview) {
		restDAO.insertRating(customerReview);
	}
	
	public List<Menu> getMenu(String rest_menu){
		return restDAO.getMenu(rest_menu);
	}
	
	public void insertOrder(RestaurantOrder restaurantOrder) {
		restDAO.insertOrder(restaurantOrder);
	}
	
	public void insertOrderDetails(RestaurantOrderDetails restaurantOrderDetails) {
		restDAO.insertOrderDetails(restaurantOrderDetails);
	}
	
	public List<Restaurant> getRestaurant(String search_query) {
		return restDAO.getRestaurant(search_query);
	}
	
	public List<Restaurant> getRestaurantById(BigDecimal search_query) {
		return restDAO.getRestaurantById(search_query);
	}
	
	public List<RestaurantCustomer> getRestaurantCustomer(String search_query) {
		return restDAO.getRestaurantCustomer(search_query);
	}
	
	public void insertCustomer(RestaurantCustomer restaurantCustomer) {
		restDAO.insertCustomer(restaurantCustomer);
	}
}
