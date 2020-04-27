package com.capg.pbms.accountmanagement.service;

import java.util.List;

import com.capg.pbms.accountmanagement.model.Customer;

public interface IAccountService {
	Customer addCustomer(Customer customer);
	 
	 Customer getCustomer(String customerId);
	 
	 List<Customer> getAllCustomer();
	 
	 Customer updateCustomer(Customer customer);
	 
	 boolean deleteCustomer(String customerId);

	


}
