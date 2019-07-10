package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.service.CourseService;

@Controller
@Transactional
@RequestMapping(value = "course")
public class CourseController {
	@Autowired
	private CourseService courseService;

	// Trang chủ
	@RequestMapping(method = RequestMethod.GET)
	public String home(ModelMap model, HttpServletRequest request) {
		System.out.println("AAAAAAAAAAAAAA: " + courseService.getAllCourse().size());
		return "admin/index";
	}
}
