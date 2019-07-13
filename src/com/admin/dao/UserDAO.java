package com.admin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.UserData;;

@Repository
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<UserData> getAllUser(){
		Session session = sessionFactory.getCurrentSession();
		List<UserData> list = session.createQuery(" FROM UserData ").list();
		return list;
	}
	
	public void insertUser(UserData user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
	
	public void deleteRole(UserData user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
	}
	
	public void updateUser(UserData user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}

	
	public UserData getUserByID(String userName) {
		Session session = sessionFactory.getCurrentSession();
		UserData user = (UserData) session.get(UserData.class, userName);
		return user;
	}
}
