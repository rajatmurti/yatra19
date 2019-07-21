package com.app.dao;

import java.util.List;

import com.app.pojos.Login;

public interface ILoginUser {
	public Login validateUser(String user,String pass);
	public List<Login> getAllUsers();
}
