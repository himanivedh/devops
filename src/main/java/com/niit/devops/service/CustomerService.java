package com.niit.devops.service;

import java.util.List;

import com.niit.devops.model.Customer;

public interface CustomerService {
	void saveCustomer(Customer customer);
	List<Customer> getCustomers();
}
