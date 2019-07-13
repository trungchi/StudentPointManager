package com.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.RoleDAO;
import com.admin.dao.UserDAO;
import com.model.Role;
import com.model.UserData;

@Service("UserService")
@Transactional
public class UserService {
	@Autowired
	private UserDAO userDAO;
	
	public List<UserData> getAllUser(){
		return userDAO.getAllUser();
	}
	
	public void insertUser(UserData user){
		userDAO.insertUser(user);
	}
	
	public void deleteUser(UserData user){
		userDAO.deleteRole(user);
	}
	
	public void updateRole(UserData user){
		userDAO.updateUser(user);
	}
	
	public UserData getUserByID(String userName){
		return userDAO.getUserByID(userName);
	}
}
