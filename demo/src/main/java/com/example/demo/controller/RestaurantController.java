package com.example.demo.controller;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.domain.CustomerReview;
import com.example.demo.domain.CustomerReviewResponse;
import com.example.demo.domain.RestaurantOrder;
import com.example.demo.domain.RestaurantResponse;
import com.example.demo.domain.User;
import com.example.demo.service.RestaurantService;

@Controller
public class RestaurantController {

	@Autowired
	RestaurantService restService;
	 
	@RequestMapping(value = "/displayEmployees", method = RequestMethod.GET)
	public String formExampleDisplay(HttpServletRequest request, Model model) {

		List<RestaurantResponse> restList = new ArrayList<RestaurantResponse>();
		List<CustomerReviewResponse> reviewList = new ArrayList<CustomerReviewResponse>();
		
		restList = restService.getRestaurants();
		reviewList = restService.getRestaurantAndReview();
		
		ArrayList<String> restNames = new ArrayList<String>();
		for (int i = 0; i < restList.size(); i++) {
			restNames.add(restList.get(i).getRname());
		}
			
		model.addAttribute("restList",restList);
		model.addAttribute("reviewList",reviewList);
		model.addAttribute("restNames",restNames);
		
		return "Home";
	}
	
	@RequestMapping(value = "/displayEmployees", method = RequestMethod.POST)
	public String insertOrder(@ModelAttribute RestaurantOrder order, Model model) {
	
		restService.insertOrder(order);
		
		model.addAttribute("order", order);
		
		return "Home";
	}
	
	@RequestMapping(value = "/submitReview", method = RequestMethod.POST)
	public String reviewSubmission(@ModelAttribute CustomerReview custReview, Model model) {

		Random rand = new Random();
		model.addAttribute("custReview", custReview);
		
		CustomerReview updatedReview = custReview;
		int x = rand.nextInt(900000) + 100000;
		BigDecimal y = BigDecimal.valueOf(x);
		updatedReview.setReviewid(y);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		updatedReview.setReviewDate(timestamp);
		restService.insertRating(updatedReview);

		return "reviewSubmission";
	}

	@RequestMapping(value = "/submitReview", method = RequestMethod.GET)
	public String reviewDisplay(@ModelAttribute CustomerReview custReview, Model model) {
		List<RestaurantResponse> restList = new ArrayList<RestaurantResponse>();
		restList = restService.getRestaurants();
		custReview = new CustomerReview();
		model.addAttribute("custReview",custReview);
		model.addAttribute("restList",restList);

		return "submitReview";
	}
	
	@RequestMapping(value = "/submitOrder", method = RequestMethod.POST)
	public String orderSubmission(@ModelAttribute RestaurantOrder restOrder, Model model) {
		Random rand = new Random();
		model.addAttribute("restOrder", restOrder);
		
		RestaurantOrder updatedOrder = restOrder;
		int x = rand.nextInt(900000) + 100000;
		BigDecimal y = BigDecimal.valueOf(x);
		updatedOrder.setOno(y);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		updatedOrder.setOrderDate(timestamp);
		
		if(restOrder.getDineIn().startsWith("Y")) {
			updatedOrder.setDineInDate(timestamp);
			updatedOrder.setDineIn("Y");
		}
		else {
			updatedOrder.setDineIn("N");
		}
		if(restOrder.getDelivery().startsWith("Y")) {
			updatedOrder.setDeliveryDate(timestamp);
			updatedOrder.setDelivery("Y");
		}
		else {
			updatedOrder.setDelivery("N");
			
		}
		if(restOrder.getPickup().startsWith("Y")) {
			updatedOrder.setPickupDate(timestamp);
			updatedOrder.setPickup("Y");
		}
		else {
			updatedOrder.setPickup("N");
		}
		
		return "orderSubmission";
	}

	@RequestMapping(value = "/submitOrder", method = RequestMethod.GET)
	public String reviewDisplay(@ModelAttribute RestaurantOrder restOrder, Model model) {
		restOrder = new RestaurantOrder();
		model.addAttribute("restOrder", restOrder);
		return "submitOrder";
	}
	
	@RequestMapping(value = "/RestaurantLogin", method = RequestMethod.GET)
	public String userLogin(HttpServletRequest request, @ModelAttribute User user, Model model) {

		return "login";
	}

	@RequestMapping(value = "/RestaurantLogin", method = RequestMethod.POST)
	public String inputExamplePost(HttpServletRequest request, @ModelAttribute User user, Model model) {

		return "/displayEmployees";
	}

}