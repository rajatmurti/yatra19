package com.app.dao;

import java.util.List;

import com.app.pojos.Hotel;
import com.app.pojos.HotelOwner;

public interface IHotelOwnerDao {
	public HotelOwner validateHotelOwner(String username, String password);
	public List<HotelOwner> getAllOwners();
	public List<Hotel> getAllHotels();
	public String register(HotelOwner h);
	public String addHotel(Hotel h);
	public String updateHotel(Hotel h);
	public String deleteHotel(Integer hid);
	public String deleteHotelOwner(Integer hoid);
	public Hotel getHotelDetails(Integer hid);
	public HotelOwner getHotelOwnerDetails(Integer hid);
	public String updateHotelOwner(HotelOwner h);

}
