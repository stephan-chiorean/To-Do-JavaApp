package com.application.todo.LoginController;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("Stevie");
		boolean isValidPassword = password.equalsIgnoreCase("iscool");
		
		return isValidUserName && isValidPassword;
	}
}