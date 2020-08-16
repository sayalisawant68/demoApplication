package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Restaurant;
import com.example.demo.Exception.ObjectNotFoundException;
import com.example.demo.Repository.RestaurantRepository;

@Service
public class RestaurantService {
	 @Autowired
	 private RestaurantRepository restaurantRepository;
	 
	 public List<Restaurant> getAllRestaurants(){
		List<Restaurant> restautants = (List<Restaurant>) restaurantRepository.findAll();
		 return restautants;
	 }
	 
	 public void addRestaurant(Restaurant restautant) {
		 restaurantRepository.save(restautant);
	 }
	 
	 public void deleteRestaurant(Long id) {
		 if(!restaurantRepository.existsById(id))throw new ObjectNotFoundException();
		 restaurantRepository.deleteById(id);
	 }
	 
	 public void updateRestaurant(Restaurant restaurant) {
		 if(!restaurantRepository.existsById(restaurant.getrId()))throw new ObjectNotFoundException();
		 Restaurant restaurantObj =  restaurantRepository.getOne(restaurant.getrId());
		 restaurantRepository.delete(restaurant);
		 restaurantObj.setrCity(restaurant.getrCity());
		 restaurantObj.setrCountry(restaurant.getrCountry());
		 restaurantObj.setrName(restaurant.getrName());
		 restaurantObj.setrPhone(restaurant.getrPhone());
		 restaurantObj.setrState(restaurant.getrState());
		 restaurantObj.setrZip(restaurant.getrZip());
		 restaurantRepository.save(restaurantObj);
	}

}
