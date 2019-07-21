package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Customer;
import com.app.pojos.HotelOwner;
import com.app.service.ICustService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
@Autowired
private ICustService service;
	
Date dt = null;
SimpleDateFormat smf=new SimpleDateFormat("yyyy-mm-dd");

@GetMapping("/list")
public String showCustomer(Model map) {
	map.addAttribute("customer_list", service.getAllCustomers());
	return "customer/list";
}
@GetMapping("/registercust")
public String registerCust(Customer c)
{
	return "customer/registercust";
}
@PostMapping("/registercust")
public String registerCust(Customer c,RedirectAttributes flashmap) {
	System.out.println("in process cust reg form "+c);
	flashmap.addFlashAttribute("status", service.registerCust(c));
	return "redirect:/customer/custlist";
}
}
