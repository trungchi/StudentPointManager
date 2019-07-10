package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CourseDAO;
import com.model.Course;

@Service("CourseService")
@Transactional
public class CourseService {
	@Autowired
	private CourseDAO courseDAO;
	
	public List<Course> getAllCourse() {
		return courseDAO.getAllCourse();
	}
}
