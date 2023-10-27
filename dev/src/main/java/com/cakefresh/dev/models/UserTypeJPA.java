package com.cakefresh.dev.models;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name = "[cf_data_usertype]")
public class UserTypeJPA {
	
	@Id
	@Column(name = "[usertype_id]", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "[usertype]", nullable = false)
	@JsonProperty("user_type")
	private String userType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "UserTypeJPA [id=" + id + ", userType=" + userType + "]";
	}
	
	public UserTypeJPA() {
		
	}

	public UserTypeJPA(String userType) {
		this.userType = userType;
	}
	
}
