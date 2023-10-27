package com.cakefresh.dev.payload.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;
import jdk.jfr.Name;

public class UserTypePost {
	
	@NotNull(message = "The user type is required!, and can not be null.")
	@JsonProperty("user_type")
	private String userType;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
}
