               package com.washer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.washer.model.Washers;
import com.washer.service.WashService;


@RestController
@RequestMapping("/wash")
public class Washercontroller {

	@Autowired
	private WashService service;
	

	@Autowired
	private RestTemplate restTemplate;
	
	
	//Washer Operations
	@PostMapping("/addwasher")
	public Washers saveWasher(@RequestBody Washers washer) {
		return service.addWasher(washer);
	}
	
	@GetMapping("/allwashers")
	public List<Washers> findAllwashers() {
		return service.getwashers();
	}

	@GetMapping("/{location}")
	public List<Washers> findwasherByAddress(@PathVariable String location) {
		return service.getwasherbylocation(location);
	}

	@DeleteMapping("/delete/{id}")
	public Washers removeUser(@RequestBody Washers washer) {
		service.deletewasher(washer);
		return washer;
	}

		
}
