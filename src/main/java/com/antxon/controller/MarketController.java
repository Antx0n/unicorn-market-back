package com.antxon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.antxon.services.PricingService;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/market")
public class MarketController {

	@Autowired
	PricingService pricingService;

	@GetMapping(value = "/price")
	@ResponseBody
	public ResponseEntity<Integer> getMarketPrice(@RequestParam String uniName) {
		return new ResponseEntity<>(Math.abs(pricingService.getPrice(uniName).intValue()), new HttpHeaders(),
				HttpStatus.OK);
	}
}
