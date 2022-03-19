package com.OnDemandCarWash.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.OnDemandCarWash.model.CarDetails;
import com.OnDemandCarWash.model.Customer;
import com.OnDemandCarWash.repository.CarDetailsRepository;

@RestController
public class CarDetailsController {
	@Autowired
	private CarDetailsRepository repository;
	
	@PostMapping("/addCarDetails")
	public int saveBook(@RequestBody CarDetails cardetails) {
		repository.save(cardetails);
		return cardetails.getId();
	}
	@GetMapping("/findAllCarDetails")
	public List<CarDetails> getBooks(){
		return repository.findAll();
	}


}
