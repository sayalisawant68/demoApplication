package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
	@Id
	@Column(name = "bookingid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	@Column(name = "dishname")
	private String dishName;
	@Column(name = "rname")
	private String rName;
	@Column(name = "date")
	private String date;
	@Column(name = "pname")
	private String pName;
	@Column(name = "number")
	private String phoneNumber;
	@Column(name = "email")
	private String emailId;

	public Orders() {
		super();
	}

	public Orders(String dishName, String rName, String date, String pName, String phoneNumber,
			String emailId) {
		super();
		//this.bookingId = bookingId;
		this.dishName = dishName;
		this.rName = rName;
		this.date = date;
		this.pName = pName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
