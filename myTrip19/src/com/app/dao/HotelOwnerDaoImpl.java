package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.HotelOwner;

@Repository
public class HotelOwnerDaoImpl implements IHotelOwnerDao{
@Autowired
private SessionFactory sf;
	public HotelOwnerDaoImpl() {
		System.out.println("In constr hotelownerimpl");
	}

@Override
public HotelOwner validateHotelOwner(String username, String password) {
	String jpql="select h from HotelOwner h where h.username=:user and h.password=:pass";
	HotelOwner h=sf.getCurrentSession().createQuery(jpql, HotelOwner.class).setParameter("user", username).setParameter("pass", password).getSingleResult();
	if(h==null)
	return null;
	else
		return h;
}

@Override
public List<HotelOwner> getAllOwners() {
	String jpql="select v from HotelOwner AS v";
	List<HotelOwner> cust = sf.getCurrentSession().createQuery(jpql,HotelOwner.class).getResultList();
	return cust;
}

@Override
public void register(HotelOwner h) {
	// TODO Auto-generated method stub
	
}
	
}
