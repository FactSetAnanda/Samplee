package com.braintree.logservice;

import java.sql.SQLException;

import com.braintrain.beans.Login;
import com.braintrain.daofactory.DAOFactory;
import com.braintrain.daointerfaces.LoginDAO;

public class LoginService {
public static String validateUser(Login login) throws ClassNotFoundException,SQLException{
	LoginDAO logindao=DAOFactory.getLoginDao();
	return logindao.validateUser(login);	
}
}