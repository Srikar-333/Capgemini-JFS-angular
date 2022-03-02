package com.ondemandcarwash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ondemandcarwash.model.Customer;
import com.ondemandcarwash.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
		
	}
	public List<Customer> getCustomers() {
		List<Customer> customers =customerRepository.findAll();
		System.out.println("Getting Customers from DB" + customers);
		return customers;
	}

	public void deleteById(int id) {
		customerRepository.deleteById(id);
		
	}
	
	
}
