package com.cakefresh.dev.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cakefresh.dev.models.UserTypeJPA;

public interface UserTypeRepository extends JpaRepository<UserTypeJPA, Long>{
	List<UserTypeJPA> findByUserType(String UserType);
}
