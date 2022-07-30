package com.braintrain.servicefactory;

import com.braintree.logservice.CourseService;
import com.braintree.logservice.LoginService;
import com.braintree.logservice.QuestionService;
import com.braintree.logservice.RegistrationService;

public class ServiceFactory {
private static LoginService loginservice=null;
private static RegistrationService registrationservice=null;
private static CourseService courseservice=null;
private static QuestionService questionservice=null;
public static LoginService getLoginService(){
if(loginservice==null){
	
	loginservice=new LoginService();
}
else
{
return loginservice;	
}
return loginservice;
}
public static RegistrationService getRegistrationService(){
	if(registrationservice==null){
		
		registrationservice=new RegistrationService();
	}
	else{
		return registrationservice;
	}
	return registrationservice;
}
public static CourseService getCourseService(){
	if(courseservice==null){
		
		courseservice=new CourseService();
		
	}
	else{
		return courseservice;
	}
	return courseservice;
}
public static QuestionService getQuestionService(){
	if(questionservice==null){
		
		questionservice=new QuestionService();
	}
	else{
		return questionservice;
	}
	return questionservice;
	
}
}