package com.cakefresh.dev.models;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;


@Entity
@Table(name = "[cf_data_users]",
uniqueConstraints = { 
	      @UniqueConstraint(columnNames = "phone_number"),
	      @UniqueConstraint(columnNames = "email_id") 
	    })
public class UsersJPA {
	
	@Id
	@Column(name = "[user_id]")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	
	@Column(name = "[first_name]")
	@JsonProperty("first_name")
	private String firstName;
	
	@Column(name = "[last_name]")
	@JsonProperty("last_name")
	private String lastName;
	
	@Column(name = "[email_id]")
	@JsonProperty("email_id")
	private String emailId;
	
	@Column(name= "[phone_number]")
	@JsonProperty("phone_number")
	private String phoneNumber;
	
	@Column(name = "[alternative_phone_number]")
	@JsonProperty("alternative_phone_number")
	private String alternativePhoneNumber;
	
	@Column(name = "[dob]")
	@JsonProperty("date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "[gender]")
	@JsonProperty("gender")
	private String gender;
	
	@Column(name = "[created_date]")
	private Date createdDate;
	
	@Column(name = "[last_modified_date]")
	private Date lastModifiedDate;
	
	@Column(name = "[usertype_id]")
	private int userTypeId;
	
	@Column(name ="[address_id]")
	private int addressId;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAlternativePhoneNumber() {
		return alternativePhoneNumber;
	}

	public void setAlternativePhoneNumber(String alternativePhoneNumber) {
		this.alternativePhoneNumber = alternativePhoneNumber;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(int userTypeId) {
		this.userTypeId = userTypeId;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public UsersJPA(String firstName, String lastName, String emailId, String phoneNumber, String alternativePhoneNumber,
			Date dateOfBirth, String gender, Date createdDate, Date lastModifiedDate, int userTypeId, int addressId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phoneNumber = phoneNumber;
		this.alternativePhoneNumber = alternativePhoneNumber;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.createdDate = createdDate;
		this.lastModifiedDate = lastModifiedDate;
		this.userTypeId = userTypeId;
		this.addressId = addressId;
	}
	
	
	

}
