package com.braintrain.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.braintrain.dbutility.DBUtility;
import com.braintrain.beans.QuestionBean;
import com.braintrain.daointerfaces.QuestionDAO;


public class QuestionsDAOImplementation implements QuestionDAO{

	public void addQuestion(QuestionBean question) throws ClassNotFoundException,SQLException{
		System.out.println("we are in Question Dao");
		Connection con=DBUtility.getConnection();
		PreparedStatement psmt=con.prepareStatement("INSERT INTO QUESTION8879 VALUES(Q_ID.nextval,?,?,?)");
		psmt.setString(1, question.getQuestion());
		psmt.setString(2, question.getAnswer());
		psmt.setString(3, question.getLevel());
		psmt.executeQuery();
	}
	
	public void check(String qno) {
		// TODO Auto-generated method stub
		Connection con;
		try {
			con = DBUtility.getConnection();
			PreparedStatement psmt=con.prepareStatement("select question,answer from answers");
			ResultSet rs=psmt.executeQuery();
			System.out.println(rs.next());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
}