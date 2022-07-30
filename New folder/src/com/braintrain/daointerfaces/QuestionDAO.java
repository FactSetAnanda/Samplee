package com.braintrain.daointerfaces;

import java.sql.SQLException;

import com.braintrain.beans.QuestionBean;

public interface QuestionDAO {
public abstract void addQuestion(QuestionBean question)throws ClassNotFoundException, SQLException;
}