package com.xebia.account.service;

public interface SecurityService {
	void autologin(String username, String password);
	
	String findLoggedInUsername();
}