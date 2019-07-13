package com.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.RoleDAO;
import com.admin.dao.UserDAO;
import com.model.Role;
import com.model.User;

@Service("UserService")
@Transactional
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public List<User> getAllUser(){
		return userDAO.getAllUser();
	}
	
	public void insertUser(User user){
		userDAO.insertUser(user);
	}
	
	public void deleteUser(User user){
		userDAO.deleteRole(user);
	}
	
	public void updateRole(User user){
		roleDAO.updateRole(role);
	}
	
	public Role getRoleByID(String id){
		return roleDAO.getRoleByID(id);
	}
}
