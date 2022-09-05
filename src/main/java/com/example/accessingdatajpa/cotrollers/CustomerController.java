package com.example.accessingdatajpa.cotrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.accessingdatajpa.Customer;
import com.example.accessingdatajpa.CustomerRepository;



@RestController
public class CustomerController {
	
	@Autowired  
	private CustomerRepository repo ;
	
	@RequestMapping("/allrecord")
	public Iterable<Customer> getAllCustomer() {
		
		return repo.findAll();
	}

}