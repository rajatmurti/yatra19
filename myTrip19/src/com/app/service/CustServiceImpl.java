package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.pojos.Customer;

@Service
@Transactional
public class CustServiceImpl implements ICustService{
	@Autowired
	private ICustomerDao dao;
public CustServiceImpl() {
	System.out.println("In cust Service constr");
}
@Override
public String registerCust(Customer c) {
	return 	dao.registerCust(c);
}
@Override
public List<Customer> getAllCustomers() {
	return dao.getAllCustomers();
}
}
