package com.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.cfg.annotations.reflection.XMLContext.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Hotel;
import com.app.pojos.HotelOwner;
import com.app.service.IHotelOwnerService;

@Controller
@RequestMapping("/hotel")
public class HotelController{
	@Autowired
	private IHotelOwnerService service;
	Date dt = null;
SimpleDateFormat smf=new SimpleDateFormat("yyyy-mm-dd");
	@GetMapping("/list")
	public String showHotels(Model map) {
		map.addAttribute("hotel_list", service.getAllHotels());
		//List<HotelOwner> owner=service.getAllOwners();
		return "hotel/list";
	}
	@GetMapping("/registerhotel")
	public String registerOwner() {
		return "hotel/registerhotel";
	}
	@PostMapping("/registerhotel")
	public String registerOwner(@RequestParam String hname,@RequestParam String address,@RequestParam String city,
			@RequestParam String restoAvail,@RequestParam String type,@RequestParam String noOfRooms,
			@RequestParam String swim_pool,@RequestParam String hoid,@RequestParam String openingDate,
			RedirectAttributes flashmap) {
		System.out.println("in post hotel register form ");	
		try {
			dt = smf.parse(openingDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer i=Integer.parseInt(hoid);
		HotelOwner ho= service.getHotelOwnerDetails(i);
		Hotel h=new Hotel(hname,address, city,restoAvail, type, noOfRooms, swim_pool,dt,ho);
		flashmap.addFlashAttribute("status", service.addHotel(h));
		return "redirect:/hotel/list";
	}
	@GetMapping("/updatehotel")
	public String showUpdateForm(@RequestParam String hid,Model map)
	{
		System.out.println("in show update form ");
		//load vendor details from db & attach it to model attribute
		Integer id=Integer.parseInt(hid);
		map.addAttribute("hotel",service.getHotelDetails(id));
		System.out.println(map);
		return "/hotel/updatehotel";
	}
	@PostMapping("/updatehotel")
	public String processUpdateForm(Hotel h,RedirectAttributes flashMap)
	{
		System.out.println("in process update "+h);
		//invoke service --dao --to update vendor dtls
		flashMap.addFlashAttribute("status", service.updateHotel(h));
		return "redirect:/hotel/list";
	}
	@GetMapping("/deletehotel")
	public String deleteVendor(@RequestParam Integer hid,
			RedirectAttributes flashMap) {
		System.out.println("in delete hotel "+hid+" "+flashMap);
		flashMap.addFlashAttribute("status",service.deleteHotel(hid));
			return "redirect:/hotel/list"; //redirect view name
	}
	
}