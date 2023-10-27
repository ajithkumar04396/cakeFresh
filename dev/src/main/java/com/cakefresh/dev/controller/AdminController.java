package com.cakefresh.dev.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cakefresh.dev.models.UserTypeJPA;
import com.cakefresh.dev.models.UsersJPA;
import com.cakefresh.dev.payload.request.UserTypePost;
import com.cakefresh.dev.repository.UserTypeRepository;
import com.cakefresh.dev.request.wrapper.UserDetailsWrapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/admin/")
public class AdminController {
	@Autowired
	UserTypeRepository userTypeRepository;
	
	@RequestMapping(value = "userType", method = RequestMethod.POST)
	public ResponseEntity createUserType(@Valid @RequestBody UserTypePost userTypeJPA) {
		try {
			UserTypeJPA _userTypeJPA = userTypeRepository.save(new UserTypeJPA(userTypeJPA.getUserType()));
			return new ResponseEntity<>(_userTypeJPA, HttpStatus.OK);
			
		} catch (DataIntegrityViolationException e) {
			// TODO: handle exception
			Map errorObject = new HashMap(){{
				put("timestamp", new Date().toGMTString());
		        put("status", 500);
		        put("errors", "could not execute statement to create User Type!.");
				}
			};
			return new ResponseEntity<>(errorObject, HttpStatus.INTERNAL_SERVER_ERROR);
		}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "userType", method = RequestMethod.GET)
	public ResponseEntity<List<UserTypeJPA>> getUserType(){
		try {
			List<UserTypeJPA> _userTypeJPAList = new ArrayList<UserTypeJPA>();
			userTypeRepository.findAll().forEach(_userTypeJPAList::add);
			return new ResponseEntity<>(_userTypeJPAList, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	@RequestMapping(value = "userDetails", method = RequestMethod.POST)
	public ResponseEntity createUserDetails(@RequestBody UserDetailsWrapper userDetailsWrapper) {
		try {
			System.out.println("----------Request-------------");
			UsersJPA usersJPA = userDetailsWrapper.getUserJPA();
			System.out.println(usersJPA.getFirstName());
			System.out.print(usersJPA.getAddressId());
			
			return new ResponseEntity(null, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			return new ResponseEntity(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
