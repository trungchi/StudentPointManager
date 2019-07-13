package com.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.service.CourseService;
import com.admin.service.RoleService;
import com.admin.service.UserRoleService;
import com.model.Role;
import com.model.UserRole;

@Controller
@Transactional
@RequestMapping(value = "test")
public class TestController {
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private UserRoleService userRoleService;

	// Trang chủ
	@RequestMapping(method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request) {
		System.out.println("AAAAAAAAAAAAAA: " + roleService.getAllRole().size());
		List<UserRole> allUserRole = userRoleService.getAllUserRole();
		for(UserRole role : allUserRole){
			System.out.println(role.getId() + " - " + role.getRole() + " - " + role.isStatus());
		}
		
//		UserRole r = userRoleService.getRoleByID("hoang");
//		System.out.println("ROLE: " + r.getUser());
		return "admin/home";
	}
}
