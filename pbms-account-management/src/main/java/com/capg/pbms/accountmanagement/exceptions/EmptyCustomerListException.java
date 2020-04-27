package com.capg.pbms.accountmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Customer list is Empty", value = HttpStatus.NOT_FOUND)
public class EmptyCustomerListException extends RuntimeException {
	public EmptyCustomerListException(String message)
	{
		super(message);
	}

}
