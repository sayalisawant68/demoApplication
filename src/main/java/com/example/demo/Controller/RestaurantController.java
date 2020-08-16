package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Restaurant;
import com.example.demo.Service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	//get all available restaurants
	@GetMapping("/All")
	public List<Restaurant> getAll(){
		return restaurantService.getAllRestaurants();
	}
	
	//add new restaurant
	@RequestMapping(method = RequestMethod.POST,value = "/add")
	public void addRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.addRestaurant(restaurant);
	}
	
	//delete restaurant
	@RequestMapping(method = RequestMethod.DELETE,value = "/delete/{id}")
	public void deleteReastaurant(@PathVariable Long id) {
		restaurantService.deleteRestaurant(id);
	}
	
	//update restaurant
	@RequestMapping(method = RequestMethod.PUT,value = "/update")
	public void updateRestaurant(@RequestBody Restaurant restaurant) {
		restaurantService.updateRestaurant(restaurant);
	}
	
	

}
