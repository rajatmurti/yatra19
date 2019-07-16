package com.app.dao;

import java.util.List;

import com.app.pojos.HotelOwner;

public interface IHotelOwnerDao {
	public HotelOwner validateHotelOwner(String username, String password);
	public List<HotelOwner> getAllOwners();
	public void register(HotelOwner h);
}
