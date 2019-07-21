package com.app.controller;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Hotel;
import com.app.pojos.HotelOwner;
import com.app.service.IHotelOwnerService;

@Controller
@RequestMapping("/hotelowner")
public class HotelOwnerController {
@Autowired
private IHotelOwnerService service;
/*@GetMapping("/holist")
public ResponseEntity<List<HotelOwner>> showOwners(Model map) {
	map.addAttribute("owner_list", service.getAllOwners());
	List<HotelOwner> owner=service.getAllOwners();
	return ResponseEntity.ok().body(owner);
}*/
@GetMapping("/holist")
public String showOwners1(Model map) {
	map.addAttribute("owner_list", service.getAllOwners());
	//List<HotelOwner> owner=service.getAllOwners();
	return "hotelowner/holist";
}
@GetMapping("/updateowner")
public String updateCustomer(@RequestParam Integer hoid,Model map ) {
map.addAttribute("hotelOwner", service.getHotelOwnerDetails(hoid));
	return "/hotelowner/updateowner";	
}
@PostMapping("/updateowner")
public String processUpdateForm(HotelOwner ho,RedirectAttributes flashMap)
{
	System.out.println("in process update "+ho);
	//invoke service --dao --to update vendor dtls
	flashMap.addFlashAttribute("status", service.updateHotelOwner(ho));
	return "redirect:/hotelowner/holist";
}
@GetMapping("/registerhowner")
public String registerOwner(HotelOwner h) {
	return "hotelowner/registerhowner";
}
@PostMapping("/registerhowner")
public String registerOwner(HotelOwner ho,RedirectAttributes flashmap) {
	System.out.println("in process reg form "+ho);
	//v -- transient
	flashmap.addFlashAttribute("status", service.register(ho));
	return "redirect:/hotelowner/holist";
}
@GetMapping("/deleteowner")
public String deleteVendor(@RequestParam int hoid,
		RedirectAttributes flashMap) {
	System.out.println("in delete vendor "+hoid+" "+flashMap);
	flashMap.addFlashAttribute("status",service.deleteHotelOwner(hoid));
		return "redirect:/hotelowner/holist"; //redirect view name
}
}