package com.antxon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "Unicorn")
public class Unicorn {

	public Unicorn() {
		super();
	}

	public Unicorn(String name, String description, String color, Integer basePrice) {
		this.name = name;
		this.description = description;
		this.color = color;
		this.basePrice = basePrice;
	}

	@Id
	@Column(name = "name", updatable = false)
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "color")
	private String color;
	@Column(name = "base_price")
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
