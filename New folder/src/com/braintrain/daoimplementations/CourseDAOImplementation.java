package com.braintrain.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.braintrain.dbutility.DBUtility;
import com.braintrain.beans.CourseBean;
import com.braintrain.daointerfaces.CourseDAO;
import com.braintrain.daointerfaces.CourseDAO;

public class CourseDAOImplementation implements CourseDAO {

	public  List addCourse(CourseBean course) throws ClassNotFoundException,SQLException{
		List courselist=new ArrayList();
	 System.out.println("you are in courseDao");
		String topicname="";
		Connection con=DBUtility.getConnection();
		PreparedStatement psmt=con.prepareStatement("insert into TOPIC8879 values(TOPIC_ID.nextval,?)");
		psmt.setString(1, course.getCourseName());
		psmt.executeUpdate();
	PreparedStatement psmt1=con.prepareStatement("select TOPIC_NAME from TOPIC8879");
	    ResultSet rs=psmt1.executeQuery();
	    while(rs.next()){
	    	course.setCourseName(rs.getString("TOPIC_NAME"));
	    	//course.
	    	courselist.add(rs.getString("TOPIC_NAME"));
	    	System.out.println(courselist);
	  }
	    DBUtility.closeConnection(con);
	    return courselist;
	}
}