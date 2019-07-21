package com.app.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ILoginUser;
import com.app.pojos.Login;

@Service
@Transactional
public class LoginServiceImpl implements ILoginService{
@Autowired
private ILoginUser dao;;

@Override
	public Login validateUser(String user, String psw) {
System.out.println("serviceImpl "+psw);
	Login l= dao.validateUser(user, psw);
		return l;
	}
	@Override
	public List<Login> getAllUsers() {
		List<Login> usrList= dao.getAllUsers();
		return usrList;
	}
}
