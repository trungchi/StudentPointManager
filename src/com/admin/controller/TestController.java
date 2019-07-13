package com.admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.admin.dao.UserDAO;
import com.admin.service.CourseService;
import com.admin.service.RoleService;
import com.admin.service.UserRoleService;
import com.admin.service.UserService;
import com.model.Role;
import com.model.UserData;
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
	
	@Autowired
	private UserService userService;

	// Trang chủ
	@RequestMapping(method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request) {
//		System.out.println("AAAAAAAAAAAAAA: " + userService.getAllUser().size());
		List<UserData> allUserRole = userService.getAllUser();
		for(UserData obj : allUserRole){
			System.out.println(obj.getUserName() + " - " + obj.getFristName() + " - " + obj.getLastName());
		}
		
		UserData o = userService.getUserByID("hoang");
		System.out.println("ROLE: " + o.getFristName());
		return "admin/home";
	}
}
