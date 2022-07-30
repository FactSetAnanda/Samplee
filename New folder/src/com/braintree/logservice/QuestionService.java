package com.braintree.logservice;

import java.sql.SQLException;

import com.braintrain.beans.QuestionBean;
import com.braintrain.daofactory.DAOFactory;
import com.braintrain.daointerfaces.QuestionDAO;

public class QuestionService {

	public static void addQuestion(QuestionBean question) throws ClassNotFoundException,SQLException{
		QuestionDAO questiondao=DAOFactory.getQuestionDao();
	    questiondao.addQuestion(question);
	}
}