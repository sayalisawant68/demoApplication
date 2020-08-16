package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Dish;

@Repository
public interface DishRepository extends JpaRepository<Dish, Long>{
	
   List<Dish> findByDishName(String name);
   List<Dish> findByDishType(String type);
   List<Dish> findByDishCuisine(String dishCuisine);
   List<Dish> findByrName(String rName);

}
