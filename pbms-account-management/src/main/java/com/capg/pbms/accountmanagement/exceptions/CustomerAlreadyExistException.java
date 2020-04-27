package com.capg.pbms.accountmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.ALREADY_REPORTED,reason = "Customer Already Exist",value = HttpStatus.ALREADY_REPORTED)
public class CustomerAlreadyExistException extends RuntimeException {
	public CustomerAlreadyExistException(String message)
	{
		super(message);
	}

}
