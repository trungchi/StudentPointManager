package com.admin.controller;

import javax.transaction.Transactional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.UserData;

@Controller
@Transactional
//@RequestMapping(value = "admin")
public class LoginController {
	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String formLogin(ModelMap model) {
		model.addAttribute("userData", new UserData());
		return "admin/login";
	}
}
