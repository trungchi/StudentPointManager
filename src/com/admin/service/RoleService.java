package com.admin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.RoleDAO;
import com.model.Role;

@Service("RoleService")
@Transactional
public class RoleService {
	@Autowired
	private RoleDAO roleDAO;
	
	public List<Role> getAllRole(){
		return roleDAO.getAllRole();
	}
	
	public void insertRole(Role role){
		roleDAO.insertRole(role);
	}
	
	public void deleteRole(Role role){
		roleDAO.deleteRole(role);
	}
	
	public void updateRole(Role role){
		roleDAO.updateRole(role);
	}
	
	public Role getRoleByID(String id){
		return roleDAO.getRoleByID(id);
	}
}
