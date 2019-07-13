package com.admin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.UserRole;

@Repository
public class UserRoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<UserRole> getAllUserRole(){
		Session session = sessionFactory.getCurrentSession();
		List<UserRole> list = session.createQuery("FROM UserRole").list();
		return list;
	}
	
}
