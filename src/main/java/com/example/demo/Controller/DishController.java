package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Dish;

import com.example.demo.Service.DishService;

@RestController
@RequestMapping("/Dish")
public class DishController {

	@Autowired
	DishService dishService;

	// get all available Dishes
	@GetMapping("/All")
	public List<Dish> getAll() {
		return dishService.getAllDish();
	}

	// add new dish
	@RequestMapping(method = RequestMethod.POST, value = "/add")
	public void addRestaurant(@RequestBody Dish dish) {
		dishService.addDish(dish);
	}

	// delete dish
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
	public void deleteReastaurant(@PathVariable Long id) {
		dishService.deleteDish(id);
	}

	// update restaurant
	@RequestMapping(method = RequestMethod.PUT, value = "/update")
	public void updateRestaurant(@RequestBody Dish dish) {
		dishService.updateDish(dish);
	}

	// get dishes by dishName
	@GetMapping("/getByName/{name}")
	public List<Dish> getByName(@PathVariable String name) {
		return dishService.getByName(name);
	}

	// get dishes by dishType
	@GetMapping("/getByType/{type}")
	public List<Dish> getByType(@PathVariable String type) {
		return dishService.getByType(type);
	}

	// get dishes by dishCuisine
	@GetMapping("/getByDishCuisine/{dishCuisine}")
	public List<Dish> getByDishCuisine(@PathVariable String dishCuisine) {
		return dishService.getByDishCuisine(dishCuisine);
	}

	// get dishes by dishRName
	@GetMapping("/getByrName/{rName}")
	public List<Dish> getByRName(@PathVariable String rName) {
		return dishService.getByRName(rName);
	}

	//Get the list of dishes which are available within a Zip code 
	@GetMapping("/getByZipCode/{zipcode}")
	public List<Dish> getDishesByZipCode(@PathVariable String zipcode){
		
		return dishService.getDishesByZipCode(zipcode);
	}
}
