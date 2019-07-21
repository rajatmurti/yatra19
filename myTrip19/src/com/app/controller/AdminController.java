package com.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Hotel;
import com.app.pojos.Login;
import com.app.service.ILoginService;

@RestController
@RequestMapping("/admin")
public class AdminController {
@Autowired
private ILoginService service;
	
@GetMapping("/list")
public ResponseEntity<List<Login>> showUsers(Model map) {
	map.addAttribute("user_list", service.getAllUsers());
	List<Login> user=service.getAllUsers();
	return ResponseEntity.ok().body(user);
}
@GetMapping("/update")
public String updateCustomer(@RequestParam int vid,Model map ) {
return "admin/update";	
}

}