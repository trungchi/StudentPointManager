package com.admin.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.model.Course;

@Repository
public class CourseDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Course> getAllCourse() {
		Session session = sessionFactory.getCurrentSession();
		List<Course> list = session.createQuery("FROM Course").list();
		return list;
	}
}
