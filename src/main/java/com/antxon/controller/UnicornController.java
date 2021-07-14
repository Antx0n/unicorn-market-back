package com.antxon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.antxon.model.Unicorn;
import com.antxon.model.UnicornPrice;
import com.antxon.repository.UnicornRepository;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/unicorn")
public class UnicornController {
	
	@Autowired
	UnicornRepository unicornRepo;

	@GetMapping(value = "/offers")
	@ResponseBody
	public ResponseEntity<List<Unicorn>> getOffers() {
		return new ResponseEntity<>(this.unicornRepo.findAll(), new HttpHeaders(), HttpStatus.OK);
	}

	//WIP AND NOT IMPLEMENTED
	@PostMapping(value = "/offer")
	@ResponseBody
	public void createOffer(@RequestBody Unicorn unicorn) {
		this.unicornRepo.save(unicorn);
		System.out.println(unicorn.getName());
	}
	
	//WIP
//	@PatchMapping(value = "/offer/{name}")
//	@ResponseBody
//	public ResponseEntity<Unicorn> patchOffer(@RequestBody UnicornPrice basePrice, @PathVariable("name") String name){
//		this.unicornRepo.save( basePrice, name);
//		return new ResponseEntity<Unicorn>(this.unicornRepo.findById(name), new HttpHeaders(), HttpStatus.OK);
//	}

}
