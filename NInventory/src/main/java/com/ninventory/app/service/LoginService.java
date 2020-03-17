package com.ninventory.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ninventory.app.model.Users;
import com.ninventory.app.repository.UserRepository;

@Service
public interface LoginService {
public static final UserRepository userRepository = null;

public Users findUserbyEmail (String email);

	
}
