package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Login;

@Repository
public class LoginUserDao implements ILoginUser{
	@Autowired
	private SessionFactory sf;
	@Override
	public Login validateUser(String uname, String psw) {
		//System.out.println("pass is "+psw);
		String jpql="select l from Login l where l.username=:user and l.password=:pass";
		Login l=sf.getCurrentSession().createQuery(jpql, Login.class)
				  .setParameter("user", uname)
				  .setParameter("pass", psw).getSingleResult();
	//	System.out.println("user "+l);
		return l;
	}
	@Override
	public List<Login> getAllUsers() {
		String jpql="select l from Login l";
		List<Login> Userlist=sf.getCurrentSession().createQuery(jpql, Login.class).getResultList();
		return Userlist;
	}
}