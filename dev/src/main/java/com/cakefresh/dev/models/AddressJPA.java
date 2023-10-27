package com.cakefresh.dev.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "[cf_data_address]")
public class AddressJPA {
	
	@Id
	@Column(name = "[address_id]")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "[country]")
	@JsonProperty("country")
	private String country;
	
	@Column(name = "[address_line_1]")
	@JsonProperty("address_line_1")
	private String addressLineOne;
	
	@Column(name = "[address_line_2]")
	@JsonProperty("address_line_2")
	private String addressLineTwo;
	
	@Column(name = "[pincode]")
	@JsonProperty("pincode")
	private int pincode;
	
	@Column(name = "[post_office]")
	@JsonProperty("post_office")
	private String postOffice;
	
	@Column(name = "[area]")
	private String area;
	
	@Column(name = "[district]")
	private String district;
	
	@Column(name = "[state]")
	private String state;
	
	@Column(name = "[landmark]")
	private String landmark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public void setAddressLineTwo(String addressLineTwo) {
		this.addressLineTwo = addressLineTwo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getPostOffice() {
		return postOffice;
	}

	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public AddressJPA(String country, String addressLineOne, String addressLineTwo, int pincode, String postOffice,
			String area, String district, String state, String landmark) {
		super();
		this.country = country;
		this.addressLineOne = addressLineOne;
		this.addressLineTwo = addressLineTwo;
		this.pincode = pincode;
		this.postOffice = postOffice;
		this.area = area;
		this.district = district;
		this.state = state;
		this.landmark = landmark;
	}
	
	

}
