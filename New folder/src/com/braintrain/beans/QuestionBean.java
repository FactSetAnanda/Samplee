package com.braintrain.beans;
import java.io.Serializable;
public class QuestionBean implements Serializable {
	private String question;
	private String answer;
	private String level;
	
	public QuestionBean(){
		
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public void setLevel(String level){
		this.level=level;
	}
	public String getLevel(){
		return level;
	}
}