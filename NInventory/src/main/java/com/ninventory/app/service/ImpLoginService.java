package com.ninventory.app.service;

import com.ninventory.app.model.Users;

public class ImpLoginService implements LoginService {

	@Override
	public Users findUserbyEmail(String email) {

		return userRepository.findByEmail(email);
	}

}
