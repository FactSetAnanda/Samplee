package com.braintrain.daoimplementations;

import com.braintrain.dbutility.DBUtility;
import com.braintrain.beans.RegisterBean;
import com.braintrain.daointerfaces.RegistrationDAO;

import java.sql.*;

public class RegistrationDAOImplementation implements RegistrationDAO {

	
	public int addNewUser(RegisterBean register) throws ClassNotFoundException,SQLException {
		int registrationId;
		System.out.println("IN DAO CLASS......");
		Connection con=DBUtility.getConnection();
		System.out.println("connection object in dao..");
		PreparedStatement psmt =con.prepareStatement("insert into REG_BT1876 values(REG_ID.nextval,?,?,?,?,?,?,?)");
		/*psmt1.setString(1, name);*/
		psmt.setString(1,register.getName());
		psmt.setInt(2,register.getAge());
		psmt.setString(3,register.getQualification());
		psmt.setString(4,register.getAddress());
		psmt.setString(5,register.getEmailId());
		psmt.setInt(6,register.getPhoneno());
		psmt.setString(7,register.getTopic());
		//psmt.setLong(8, register.getAge());
		psmt.executeUpdate();
		PreparedStatement psmt1=con.prepareStatement("select REG_ID from REG_BT1876 where NAME=?");
		psmt1.setString(1, register.getName());
		System.out.println("inserted successfully......");
		ResultSet rs=psmt1.executeQuery();
		if(rs.next()){
			registrationId=rs.getInt("REG_ID");
			System.out.println(registrationId);
		}
		else{
			registrationId=0;
		}
		DBUtility.closeConnection(con);
		return registrationId;
	}

	
}