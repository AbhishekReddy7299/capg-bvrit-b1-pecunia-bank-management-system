 package com.capg.pbms.accountmanagement.exceptions;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
	}
}