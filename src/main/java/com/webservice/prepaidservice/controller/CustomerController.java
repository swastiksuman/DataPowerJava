package com.webservice.prepaidservice.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.prepaidservice.dto.Address;
import com.webservice.prepaidservice.dto.Customer;

@RestController
public class CustomerController {
	
	@GetMapping(value="/customer", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setId("1");
		customer.setName("Swastik");
		customer.setPrice("100");
		customer.setDescription("My Name");
		Address address = new Address();
		address.setMain("101 Street");
		address.setState("FL");
		customer.setAddress(address);
		return customer;
	}
}
