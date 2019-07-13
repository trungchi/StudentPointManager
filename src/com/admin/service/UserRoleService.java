package com.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.RoleDAO;
import com.admin.dao.UserRoleDAO;
import com.model.Role;
import com.model.UserRole;

@Service("UserRoleService")
@Transactional
public class UserRoleService {
	@Autowired
	private UserRoleDAO userRoleDAO;
	
	public List<UserRole> getAllUserRole(){
		return userRoleDAO.getAllUserRole();
	}
}
