package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dish")
public class Dish {

	@Id
	@Column(name = "dishid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dishId;
	@Column(name = "rname")
	private String rName;
	@Column(name = "dishname")
	private String dishName;
	@Column(name = "dishcuisine")
	private String dishCuisine;
	@Column(name = "dishtype")
	private String dishType;
	@Column(name = "dishprice")
	private String dishPrice;
	
	
	public Dish() {
		super();
	}

	public Dish(Long dishId, String rName, String dishName, String dishCuisine, String dishType, String dishPrice) {
		super();
		this.dishId = dishId;
		this.rName = rName;
		this.dishName = dishName;
		this.dishCuisine = dishCuisine;
		this.dishType = dishType;
		this.dishPrice = dishPrice;
	}
	
	public Long getDishId() {
		return dishId;
	}
	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}
	
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	
	public String getDishCuisine() {
		return dishCuisine;
	}
	public void setDishCuisine(String dishCuisine) {
		this.dishCuisine = dishCuisine;
	}
	
	public String getDishType() {
		return dishType;
	}
	public void setDishType(String dishType) {
		this.dishType = dishType;
	}
	
	public String getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(String dishPrice) {
		this.dishPrice = dishPrice;
	}
	
	
}
