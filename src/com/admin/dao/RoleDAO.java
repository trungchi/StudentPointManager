package com.admin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Role;

@Repository
public class RoleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Role> getAllRole(){
		Session session = sessionFactory.getCurrentSession();
		List<Role> list = session.createQuery("FROM Role").list();
		return list;
	}
	
	public void insertRole(Role role) {
		Session session = sessionFactory.getCurrentSession();
		session.save(role);
	}
	
	public void deleteRole(Role role) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(role);
	}
	
	public void updateRole(Role role) {
		Session session = sessionFactory.getCurrentSession();
		session.update(role);
	}

	
	public Role getRoleByID(String id) {
		Session session = sessionFactory.getCurrentSession();
		Role role = (Role) session.get(Role.class, id);
		return role;
	}
	
}
