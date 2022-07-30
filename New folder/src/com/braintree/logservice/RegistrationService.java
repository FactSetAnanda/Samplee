package com.braintree.logservice;

import java.sql.SQLException;

import com.braintrain.beans.RegisterBean;
import com.braintrain.daofactory.DAOFactory;
import com.braintrain.daointerfaces.RegistrationDAO;



public class RegistrationService {
	
	public static int AddNewUser(RegisterBean register) throws ClassNotFoundException,SQLException{
		RegistrationDAO registrationdao=DAOFactory.getRegistrationDao();
	 return registrationdao.addNewUser(register);
	}
	

}