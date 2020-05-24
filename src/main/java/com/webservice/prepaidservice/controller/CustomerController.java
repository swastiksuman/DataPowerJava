package com.webservice.prepaidservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.prepaidservice.dao.CustomerDAO;
import com.webservice.prepaidservice.dto.Address;
import com.webservice.prepaidservice.dto.Customer;
import com.webservice.prepaidservice.dto.CustomerSearch;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDAO customerDAO;
	
	@GetMapping(value="/customer", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setVersion("1.0");
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
	
	@GetMapping(value="/newcustomer", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
	public Customer getnewCustomer() {
		Customer customer = new Customer();
		customer.setVersion("2.0");
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
	
	@PostMapping(value="/searchcustomer", produces = { MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
	public Customer addCustomer(@RequestBody CustomerSearch customersearch) {
		return customerDAO.getCustomerByName(customersearch.getName()).get(0);
	}
}
