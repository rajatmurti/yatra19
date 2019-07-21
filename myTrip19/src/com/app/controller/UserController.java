package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.app.pojos.HotelOwner;
import com.app.pojos.Login;
import com.app.service.IHotelOwnerService;
import com.app.service.ILoginService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private ILoginService service;
	@GetMapping("/login")
	public String ValidateUser() {
		return "/user/login";
	}
	@PostMapping("/login")
	public String ValidateUserLogin(Model map,@RequestParam String uname,@RequestParam String psw,HttpSession hs) {
		try {
		//HotelOwner v = service.validateHotelOwner(uname, psw);
		// login success
		Login l=service.validateUser(uname, psw);
		map.addAttribute("status", "Login Successful....");
		// store user details under session scope
		hs.setAttribute("user_dtls", l);
		// chk role
		System.out.println("in login user");
		if (l.getPriviledge().equals("admin")) // admin login
		{
			return "redirect:/admin/list";//replace by redirect
		}
		else if (l.getPriviledge().equals("hotelowner")) // admin login
		{
			return "redirect:/hotelowner/holist";//replace by redirect
		}
		else if (l.getPriviledge().equals("user")) // admin login
		{
			return "redirect:/customer/registercust";//replace by redirect
		}
		// vendor login
		return "/vendor/details";
	} catch (RuntimeException e) {
		System.out.println("err in user controller " + e);
		// invalid login
		// add err mesg as model attribute ---req scope
		map.addAttribute("status", "Invalid Login , Pls retry!!!!");
		return "/user/login";
	}

	}
}
