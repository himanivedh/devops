package com.niit.devops.dao;

import java.util.List;

import com.niit.devops.model.Customer;

public interface CustomerDao {
	void saveCustomer(Customer customer);
	List<Customer> getCustomers();//duplicate username and email
}
