package com.capg.pbms.accountmanagement.service;

import java.util.List;

import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;

public interface IAccountManagementService {
	
	 AccountManagement addAccount(AccountManagement account) ;
	 
	 Customer addCustomer(String accountId,Customer customer);
	 
	 Customer getCustomer(String customerId);
	 
	 Customer updateCustomerName(Customer customer);
	 
	 Customer updateCustomerContact(Customer customer);
	 
	 Customer updateCustomerAddress(Customer customer);
	 
	 
	 boolean deleteCustomer(String customerId);

	


}
