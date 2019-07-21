package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IHotelOwnerDao;
import com.app.pojos.Hotel;
import com.app.pojos.HotelOwner;
@Service
@Transactional
public class HotelOwnerServiceImpl implements IHotelOwnerService{
@Autowired
private IHotelOwnerDao dao;
	@Override
	public HotelOwner validateHotelOwner(String username, String password) {
		HotelOwner h = dao.validateHotelOwner(username, password);
		return h;
	}

	@Override
	public List<HotelOwner> getAllOwners() {
	List<HotelOwner> holist=dao.getAllOwners();
		return holist;
	}

	@Override
	public String register(HotelOwner h) {
		dao.register(h);
		return "Registered Successfully";
	}

	@Override
	public String addHotel(Hotel h) {
		return dao.addHotel(h);
	}

	@Override
	public String updateHotel(Hotel h) {
		return dao.updateHotel(h);
	}

	@Override
	public String deleteHotel(Integer hid) {
		return dao.deleteHotel(hid);
	}

	@Override
	public Hotel getHotelDetails(Integer hid) {
		return dao.getHotelDetails(hid);
	}

	@Override
	public HotelOwner getHotelOwnerDetails(Integer hid) {
		return dao.getHotelOwnerDetails(hid);
	}

	@Override
	public String updateHotelOwner(HotelOwner h) {
		return dao.updateHotelOwner(h);
	}

	@Override
	public List<Hotel> getAllHotels() {
		return dao.getAllHotels();
	}

	@Override
	public String deleteHotelOwner(Integer hoid) {
		return dao.deleteHotelOwner(hoid);
	}
}
