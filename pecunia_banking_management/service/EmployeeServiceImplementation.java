package com.capg.pecunia_banking_management.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.capg.pecunia_banking_management.dao.EmployeeDao;
import com.capg.pecunia_banking_management.dao.EmployeeDaoImplementation;
import com.capg.pecunia_banking_management.model.Address;
import com.capg.pecunia_banking_management.model.Customer;

public class EmployeeServiceImplementation implements EmployeeService{
	static Scanner in=new Scanner(System.in);
    static EmployeeDao cd=new EmployeeDaoImplementation();
    public boolean addCustomer(Customer customer) {
    	return cd.addCustomer(customer);
    }

 
	public boolean updateCustomerName(Customer customer) {

		return cd.updateCustomerName(customer);
        }
	
	public boolean updateCustomerContact(Customer customer) {

		 return cd.updateCustomerContact(customer);
	}
	@Override
	public boolean updateCustomerAddress(Customer customer) {

	return cd.updateCustomerAddress(customer);
}
	public boolean deleteCustomer(int customerAadhar) {
		
		return cd.deleteCustomer(customerAadhar);
	}
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


}


