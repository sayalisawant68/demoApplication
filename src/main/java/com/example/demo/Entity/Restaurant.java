package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class Restaurant {
	@Id
	@Column(name = "rid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rId;
	@Column(name = "rname")
	private String rName;
	@Column(name = "rphone")
	private String rPhone;
	@Column(name = "rcity")
	private String rCity;
	@Column(name = "rstate")
	private String rState;
	@Column(name = "rzip")
	private String rZip ;
	@Column(name = "rcountry")
	private String rCountry;
	
	
	public Restaurant() {
		super();
	}
	public Restaurant(Long rId, String rName, String rPhone, String rCity, String rState, String rZip,
			String rCountry) {
		super();
		this.rId = rId;
		this.rName = rName;
		this.rPhone = rPhone;
		this.rCity = rCity;
		this.rState = rState;
		this.rZip = rZip;
		this.rCountry = rCountry;
	}
	public Long getrId() {
		return rId;
	}
	public void setrId(Long rId) {
		this.rId = rId;
	}
	public String getrName() {
		return rName;
	}
	public void setrName(String rName) {
		this.rName = rName;
	}
	public String getrPhone() {
		return rPhone;
	}
	public void setrPhone(String rPhone) {
		this.rPhone = rPhone;
	}
	public String getrCity() {
		return rCity;
	}
	public void setrCity(String rCity) {
		this.rCity = rCity;
	}
	public String getrState() {
		return rState;
	}
	public void setrState(String rState) {
		this.rState = rState;
	}
	public String getrZip() {
		return rZip;
	}
	public void setrZip(String rZip) {
		this.rZip = rZip;
	}
	public String getrCountry() {
		return rCountry;
	}
	public void setrCountry(String rCountry) {
		this.rCountry = rCountry;
	}
	
	

}
