package com.braintrain.daofactory;

import com.braintrain.daoimplementations.CourseDAOImplementation;
import com.braintrain.daoimplementations.LoginDAOImplementation;
import com.braintrain.daoimplementations.QuestionsDAOImplementation;
import com.braintrain.daoimplementations.RegistrationDAOImplementation;
import com.braintrain.daointerfaces.CourseDAO;
import com.braintrain.daointerfaces.LoginDAO;
import com.braintrain.daointerfaces.QuestionDAO;
import com.braintrain.daointerfaces.RegistrationDAO;

public class DAOFactory {
private static LoginDAO logindao=null;
private static RegistrationDAO registrationdao=null;
private static CourseDAO coursedao=null;
private static QuestionDAO questiondao=null;
public static LoginDAO getLoginDao() {

	if(logindao==null){
		
		logindao=new LoginDAOImplementation();
		
	}
	else{
		
		return logindao;
	}
	return logindao;
}
public static RegistrationDAO getRegistrationDao(){
	
	if(registrationdao==null){
		
		registrationdao=(RegistrationDAO) new RegistrationDAOImplementation();
	}
	else{
		return registrationdao;
	}
	return registrationdao;
}
public static CourseDAO getCourseDao(){
	
	if(coursedao==null){
		coursedao=(CourseDAO) new CourseDAOImplementation();
	}
	else{
		return coursedao;
	}
	return coursedao;
}
public static QuestionDAO getQuestionDao(){
	
	if(questiondao==null){
		
		questiondao=(QuestionDAO) new QuestionsDAOImplementation();
	}
	else{
		return questiondao;
	}
	return questiondao;
}
}