package com.braintrain.beans;

import java.io.Serializable;

public class AssessmentBean implements Serializable {
	private String level1;
	private String level2;
	private String level3;

	public AssessmentBean() 
	{

	}

	public String getLevel1()
	 {
		return level1;
	}

	public void setLevel1(String level1) 
	{
		this.level1 = level1;
	}

	public String getLevel2() 
	{
		return level2;
	}

	public void setLevel2(String level2)
	 {
		this.level2 = level2;
	}

	public String getLevel3() 
	{
		return level3;
	}

	public void setLevel3(String level3) {
		this.level3 = level3;
	}

}