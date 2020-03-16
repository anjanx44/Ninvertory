package com.ninventory.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninventory.app.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	 
	   Users findByEmail(String email);
	 
}