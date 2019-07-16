package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IHotelOwnerDao;
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
	public void register(HotelOwner h) {
		// TODO Auto-generated method stub
		
	}

}
