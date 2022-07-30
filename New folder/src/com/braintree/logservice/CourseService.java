package com.braintree.logservice;

import java.sql.SQLException;
import java.util.List;

import com.braintrain.beans.CourseBean;
import com.braintrain.daofactory.DAOFactory;
import com.braintrain.daointerfaces.CourseDAO;


public class CourseService {

	public static List addCourse(CourseBean course) throws ClassNotFoundException,SQLException{
		CourseDAO coursedao=DAOFactory.getCourseDao();
		return coursedao.addCourse(course);
	}
}