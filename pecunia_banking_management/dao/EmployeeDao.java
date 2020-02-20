package com.capg.pecunia_banking_management.dao;

import java.util.List;

import com.capg.pecunia_banking_management.model.Customer;

public interface EmployeeDao {
	public boolean addCustomer(Customer customer);
	public boolean deleteCustomer(int customerAadhar);
	public boolean updateCustomerContact(Customer customer);
	public List<Customer> getAllCustomer();
	public boolean updateCustomerAddress(Customer customer);
	public boolean updateCustomerName(Customer customer);
	
	

}
