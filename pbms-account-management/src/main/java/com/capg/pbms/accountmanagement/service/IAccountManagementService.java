package com.capg.pbms.accountmanagement.service;

import java.util.List;

import com.capg.pbms.accountmanagement.model.Customer;

public interface IAccountManagementService {
	
	 Customer  addAccount(Customer customer) ;
	 	 
	 Customer  getAccount(long accountId);
	 
	 List<Customer> getAllAccounts();
	 
	 Customer  updateCustomerName(Customer customer);
	 
	 Customer  updateCustomerContact(Customer customer);
	 
	 Customer  updateCustomerAddress(Customer customer);
	 
	 boolean deleteAccount(long accountId);

	


}
