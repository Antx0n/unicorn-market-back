package com.antxon.services;

import org.springframework.stereotype.Service;

@Service
public class PricingService {
	
	public Long getPrice(String unicornName){   
		//The unicorn was a gold coin that formed part of Scottish coinage between 1484 and 1525. 
		//It was initially issued in the reign of James III with a value of 18 shillings Scots.		
		return 	((unicornName.hashCode() * (System.currentTimeMillis() % 1000))/10000) / 18;
	}

}
