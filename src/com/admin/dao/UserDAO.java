package com.admin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;

@Repository
public class UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUser(){
		Session session = sessionFactory.getCurrentSession();
		List<User> list = session.createQuery("FROM User").list();
		return list;
	}
	
	public void insertUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
	}
	
	public void deleteRole(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(user);
	}
	
	public void updateRole(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.update(user);
	}

	
	public User getUserByID(String userName) {
		Session session = sessionFactory.getCurrentSession();
		User user = (User) session.get(User.class, userName);
		return user;
	}
}
