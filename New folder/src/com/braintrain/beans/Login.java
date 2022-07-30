package com.braintrain.beans;
import java.io.Serializable;

public class Login implements Serializable {
	
	public Login(){
		
	}
	private int registrationId;

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}
	
}