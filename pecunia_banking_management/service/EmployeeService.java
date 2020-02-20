package com.capg.pecunia_banking_management.service;

import java.util.List;

import com.capg.pecunia_banking_management.model.Customer;

public interface EmployeeService {
	public boolean addCustomer(Customer customer);
	public boolean deleteCustomer(int customerAadhar);
	public List<Customer> getAllCustomer();
	boolean updateCustomerName(Customer customer);
	boolean updateCustomerContact(Customer customer);
	boolean updateCustomerAddress(Customer customer);

}
