package com.app.service;

import java.util.List;

import com.app.pojos.Customer;

public interface ICustService {
	String registerCust(Customer c);
	List<Customer> getAllCustomers();
	//Customer getCustomerById(Integer cid);
}
