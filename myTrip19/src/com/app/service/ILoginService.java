package com.app.service;

import java.util.List;

import com.app.pojos.Login;

public interface ILoginService {
	public Login validateUser(String uname,String psw);
	public List<Login> getAllUsers();
}
