package com.braintrain.beans;

public class CourseBean implements java.io.Serializable{

private String courseName;
	
	public CourseBean(){
		
		
	}
	public CourseBean(String courseName){
		this.courseName=courseName;
	}
	
	public void setCourseName(String courseName){
		this.courseName=courseName;
	}
	public String getCourseName(){
		
		return courseName;
	}
	public String toString(){
		return courseName;
	}
}