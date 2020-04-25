package com.webservice.prepaidservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.prepaidservice.dto.Customer;

@RestController
public class CustomerController {
	
	@GetMapping(value="/customer", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setName("Swastik");
		customer.setPrice(100);
		customer.setDescription("My Name");
		return customer;
	}
}
