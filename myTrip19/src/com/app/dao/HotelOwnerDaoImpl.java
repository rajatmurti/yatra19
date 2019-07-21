package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Hotel;
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
	System.out.println("UserName is "+username);
	System.out.println("pass is "+password);
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
public String register(HotelOwner h) {
	 sf.getCurrentSession().save(h);
	 return "Owner Registered Successfully";
}

@Override
public String addHotel(Hotel h) {
	sf.getCurrentSession().save(h);
	return "New Hotel Added Successfully";
}

@Override
public String updateHotel(Hotel h) {
	sf.getCurrentSession().update(h);
	return "Updated Hotel Details";
}

@Override
public String deleteHotel(Integer hid) {
 Hotel h=sf.getCurrentSession().get(Hotel.class,hid);
	sf.getCurrentSession().delete(h);
	return "Deleted Hotel Recored successfully";
}

@Override
public Hotel getHotelDetails(Integer hid) {
	Hotel h=sf.getCurrentSession().get(Hotel.class,hid);
	return h;
}

@Override
public HotelOwner getHotelOwnerDetails(Integer hid) {
	HotelOwner h=sf.getCurrentSession().get(HotelOwner.class,hid);
	return h;
}

@Override
public String updateHotelOwner(HotelOwner h) {
	sf.getCurrentSession().update(h);
	return "Updated Hotel Owner Details";
}

@Override
public List<Hotel> getAllHotels() {
	String jpql="select h from Hotel AS h";
	List<Hotel> hlist=sf.getCurrentSession().createQuery(jpql, Hotel.class).getResultList();
	return hlist;
}

@Override
public String deleteHotelOwner(Integer hoid) {
HotelOwner ho= sf.getCurrentSession().get(HotelOwner.class, hoid);
sf.getCurrentSession().delete(ho);	
return "deleted Owner Record "+hoid;
}

}
