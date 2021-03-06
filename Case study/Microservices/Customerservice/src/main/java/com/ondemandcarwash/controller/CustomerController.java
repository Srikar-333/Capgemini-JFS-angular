package com.ondemandcarwash.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ondemandcarwash.exception.ApiRequestException;
import com.ondemandcarwash.model.Customer;
import com.ondemandcarwash.repository.CustomerRepository;
import com.ondemandcarwash.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/addcustomer")
	public Customer saveCustomer(@RequestBody Customer customer) 
	{
		 return customerService.addCustomer(customer);
	
	}
	

	@GetMapping("/allcustomers")
	public List<Customer> findAllCustomers()
	{
		return customerService.getCustomers();
		
	}
	
	@GetMapping("/allcustomers/{id}")
	public Optional<Customer> getCustomerById(@PathVariable int id) throws ApiRequestException
	{
		return Optional.of(customerRepository.findById(id)
				.orElseThrow(()-> new ApiRequestException("CUSTOMER NOT FOUND WITH THIS ID ::")));
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateCustomer(@PathVariable int id, @RequestBody Customer customer) throws ApiRequestException
	{
		boolean isCustomerExist=customerRepository.existsById(id);
		if(isCustomerExist) {
			customerRepository.save(customer);
			return new ResponseEntity<Object>("user updated successfully with id " +id, HttpStatus.OK);
		}
		else 
		{
			throw new ApiRequestException("CAN NOT UPDATE AS USER NOT FOUND WITH THIS ID ::");
		}
		
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteCustomer (@PathVariable int id) throws ApiRequestException
	{
		boolean isCustomerExist=customerRepository.existsById(id);
		if(isCustomerExist) {
			customerService.deleteById(id);
			return new ResponseEntity<Object>("user deleted with id"+id,HttpStatus.OK);
		}
		else
		{
			throw new ApiRequestException("CAN NOT DELETE AS USER NOT FOUND WITH THIS ID ::");
		}

	}
	

}
