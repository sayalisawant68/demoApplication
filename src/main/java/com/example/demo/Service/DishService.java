package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Dish;
import com.example.demo.Entity.Restaurant;
import com.example.demo.Exception.ObjectNotFoundException;
import com.example.demo.Repository.DishRepository;
import com.example.demo.Repository.RestaurantRepository;

@Service
public class DishService {

	@Autowired
	private DishRepository dishRepository;
	
	@Autowired
	private RestaurantRepository restaurantRepository;

	public List<Dish> getAllDish() {
		List<Dish> dishes = (List<Dish>) dishRepository.findAll();
		return dishes;
	}

	public void addDish(Dish dish) {
		//System.out.println(dish.getDishName());
		dishRepository.save(dish);
	}

	public void deleteDish(Long id) {
		if(!dishRepository.existsById(id))throw new ObjectNotFoundException();
		dishRepository.deleteById(id);
	}

	public void updateDish(Dish dish) {
		if(!dishRepository.existsById(dish.getDishId()))throw new ObjectNotFoundException();
		Dish dishObj = dishRepository.getOne(dish.getDishId());
		dishRepository.delete(dish);
		dishObj.setDishName(dish.getDishName());
		dishObj.setDishCuisine(dish.getDishCuisine());
		dishObj.setDishType(dish.getDishType());
		dishObj.setDishPrice(dish.getDishPrice());
		dishObj.setrName(dish.getrName());
		dishRepository.save(dishObj);

	}

	public List<Dish> getByName(String name) {
		return dishRepository.findByDishName(name);
	}

	public List<Dish> getByType(String type) {
		return dishRepository.findByDishType(type);
	}

	public List<Dish> getByDishCuisine(String dishCuisine) {
		return dishRepository.findByDishCuisine(dishCuisine);
	}

	public List<Dish> getByRName(String rName) {
		return dishRepository.findByrName(rName);
	}
	
	public List<Dish> getDishesByZipCode(String zipcode){
		List<Restaurant> restaurants = restaurantRepository.findByrZip(zipcode);
		List<Dish> dishes = new ArrayList<>();
		List<String> rNameList = new ArrayList<>();
		for(Restaurant res : restaurants) {
			rNameList.add(res.getrName());
		}
		for(String rname : rNameList) {
			dishes.addAll(dishRepository.findByrName(rname));
		}
		return dishes;
	}
}
