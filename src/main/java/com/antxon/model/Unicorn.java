package com.antxon.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Unicorn {
	
	
	public Unicorn(String name, String description, String color, Integer basePrice) {
		this.name = name;
		this.description = description;
		this.color = color;
		this.basePrice = basePrice;
	}
	
	@Id
	private String name;
	private String description;
	private String color;
	private Integer basePrice;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
