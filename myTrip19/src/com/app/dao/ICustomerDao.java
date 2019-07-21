package com.app.dao;

import java.util.List;

import com.app.pojos.Customer;

public interface ICustomerDao {
String registerCust(Customer c);
List<Customer> getAllCustomers();
//Customer getCustomerById(Integer cid);

}
