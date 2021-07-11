package com.antxon.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unicorn {
	
	
	public Unicorn(String name, String color, Integer basePrice) {
		this.name = name;
		this.color = color;
		this.basePrice = basePrice;
	}
	
	@Id
	private String name;
	private String color;
	private Integer basePrice;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}

}
