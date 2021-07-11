package com.antxon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.antxon.model.Unicorn;

@RestController
@RequestMapping(path ="api/v1/unicorn")
public class UnicornController {

	@GetMapping(value ="/offers")
	@ResponseBody
	public ResponseEntity<List<Unicorn>> getOffers() {
		List<Unicorn> offeredUnicorns = new ArrayList<>();
		offeredUnicorns.add(new Unicorn("Doudou","Pink", null));		
		return new ResponseEntity<>(offeredUnicorns, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping(value ="/offer")
	@ResponseBody
	public void createOffer(@RequestBody Unicorn unicorn) {
		System.out.println(unicorn.getName());
	}	
	
}
