package com.cakefresh.dev.request.wrapper;

import com.cakefresh.dev.models.AddressJPA;
import com.cakefresh.dev.models.UsersJPA;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UserDetailsWrapper {
	
	@JsonProperty("user")
	private UsersJPA userJPA;
	
	@JsonProperty("address")
	private AddressJPA addressJPA;
	
	public UserDetailsWrapper(UsersJPA userJPA, AddressJPA addressJPA) {
		super();
		this.userJPA = userJPA;
		this.addressJPA = addressJPA;
	}

	public UsersJPA getUserJPA() {
		return userJPA;
	}

	public void setUserJPA(UsersJPA userJPA) {
		this.userJPA = userJPA;
	}

	public AddressJPA getAddressJPA() {
		return addressJPA;
	}

	public void setAddressJPA(AddressJPA addressJPA) {
		this.addressJPA = addressJPA;
	}

}
