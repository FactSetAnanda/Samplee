package com.braintrain.daointerfaces;

import java.sql.SQLException;

import com.braintrain.beans.RegisterBean;

public interface RegistrationDAO {
	public abstract int addNewUser(RegisterBean register) throws ClassNotFoundException,SQLException;
}