package com.antxon.model;

public class UnicornPrice {
	public UnicornPrice() {
		super();
	}

	public UnicornPrice(Integer basePrice) {
		super();
		this.basePrice = basePrice;
	}

	private Integer basePrice;

	public Integer getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(Integer basePrice) {
		this.basePrice = basePrice;
	}
}
