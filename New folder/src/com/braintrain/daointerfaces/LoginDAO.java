package com.braintrain.daointerfaces;

import java.sql.SQLException;

import com.braintrain.beans.Login;

public interface LoginDAO {
	public abstract String validateUser(Login login ) throws ClassNotFoundException, SQLException;
	

}