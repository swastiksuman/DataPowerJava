package com.webservice.prepaidservice.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.webservice.prepaidservice.dto.Address;
import com.webservice.prepaidservice.dto.Customer;

@Component
public class CustomerDAO {
	public static List<Customer> customerList= new ArrayList<Customer>();
	
	CustomerDAO(){
		Customer customer = new Customer();
		customer.setVersion("1.0");
		customer.setId("3");
		customer.setName("Shankar");
		customer.setPrice("500");
		customer.setDescription("My Name");
		Address address = new Address();
		address.setMain("Balisahi Street");
		address.setState("OR");
		customer.setAddress(address);
		
		Customer customer1 = new Customer();
		customer1.setVersion("1.0");
		customer1.setId("4");
		customer1.setName("Jyoti");
		customer1.setPrice("300");
		customer1.setDescription("My Name");
		Address address1 = new Address();
		address1.setMain("Harchandi Street");
		address1.setState("OR");
		customer1.setAddress(address1);
		customerList.add(customer1);
		customerList.add(customer);
	}
	public List<Customer> getCustomerByName(String customerName) {
		return customerList.stream().filter(
				(customer) -> 
				customerName.toUpperCase().equals(customer.getName().toUpperCase()
						))
				.collect(Collectors.toList());
	}
	
}
