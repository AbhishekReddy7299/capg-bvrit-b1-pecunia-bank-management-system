package com.capg.pbms.accountmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Account already exist", value = HttpStatus.NOT_FOUND)
public class AccountManagementException extends RuntimeException{
	public AccountManagementException(String message)
	{
		super(message);
	}

}
