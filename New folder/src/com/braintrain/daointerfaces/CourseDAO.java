package com.braintrain.daointerfaces;

import java.sql.SQLException;
import java.util.List;

import com.braintrain.beans.CourseBean;

public interface CourseDAO {
	public abstract List addCourse(CourseBean course) throws ClassNotFoundException,SQLException;
}