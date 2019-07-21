package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao{
	@Autowired
	private SessionFactory sf;
	public CustomerDaoImpl() {
		System.out.println("In cust Dao constr");
	}
	@Override
	public String registerCust(Customer c) {
		sf.getCurrentSession().save(c);
		return "Customer Registered Successfully";
	}
	@Override
	public List<Customer> getAllCustomers() {
		String jpql="select c from Customer AS c";
		List<Customer> custlist=sf.getCurrentSession().createQuery(jpql, Customer.class).getResultList();	
		return custlist;
	}
	
}
