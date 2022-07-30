package com.braintrain.daoimplementations;

import java.sql.SQLException;
import java.sql.*;
import java.sql.Connection;

import com.braintrain.dbutility.DBUtility;
import com.braintrain.beans.Login;
import com.braintrain.daointerfaces.LoginDAO;

public class LoginDAOImplementation implements LoginDAO {
	public String validateUser(Login login) throws ClassNotFoundException,SQLException{
		String role="";
		Connection con=DBUtility.getConnection();
		PreparedStatement psmt=con.prepareStatement("SELECT ROLE FROM REGISTERATION8879 WHERE REGISTRATIONID=?");
		psmt.setInt(1, login.getRegistrationId());
		ResultSet rs=psmt.executeQuery();
		if(rs.next()){
			System.out.println(rs.getString("ROLE"));
			role=rs.getString("ROLE");
		}
		else{
			
			role="not valid";
		}
		return role;
	}
}