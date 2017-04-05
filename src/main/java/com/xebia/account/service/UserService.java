package com.xebia.account.service;

import com.xebia.account.model.User;

public interface UserService {
	User findByUsername(String username);
	
	void save(User user);
}