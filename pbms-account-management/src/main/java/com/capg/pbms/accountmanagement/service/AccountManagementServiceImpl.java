package com.capg.pbms.accountmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pbms.accountmanagement.exceptions.AccountManagementException;
import com.capg.pbms.accountmanagement.exceptions.CustomerAlreadyExistException;
import com.capg.pbms.accountmanagement.exceptions.CustomerNotFoundException;
import com.capg.pbms.accountmanagement.exceptions.EmptyCustomerListException;
import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;
 
import com.capg.pbms.accountmanagement.repository.IAccountManagementRepo;
import com.capg.pbms.accountmanagement.repository.ICustomerRepo;
@Service
public class AccountManagementServiceImpl implements IAccountManagementService {
	
	@Autowired(required=false)
	ICustomerRepo customerrepo;
	@Autowired
	IAccountManagementRepo accountrepo;
 
	@Override
	@Transactional
	public Customer addCustomer(String accountId,Customer customer) {
		if(accountrepo.existsById(accountId))
			throw new CustomerAlreadyExistException("Customer with Id: " +customer.getCustomerId()+" is Already Exist");
		return customerrepo.save(customer);
	}
	
//	 @Transactional
//	public Address getAddress(String customerId) {
//		if(!customerrepo.existsById(customerId)) 
//		{	
//		   throw new CustomerNotFoundException("Customer with Id "+customerId+" Not Found");
//		}
//	    return addressrepo.getOne(customerId);
//	}

	@Override
	@Transactional
	public Customer getCustomer(String customerId) {
		if(!customerrepo.existsById(customerId)) 
		{	
		   throw new CustomerNotFoundException("Customer with Id "+customerId+" Not Found");
		}
	    return customerrepo.getOne(customerId);
	}

	@Override
	@Transactional
	public Customer updateCustomerName(Customer customer) {
		if(!customerrepo.existsById(customer.getCustomerId()))
			
	throw new CustomerNotFoundException("Customer with Id : " +customer.getCustomerId()+" Not Found");
	
		Customer newCustomer=customerrepo.getOne(customer.getCustomerId());
		newCustomer.setCustomerName(customer.getCustomerName());
//		newCustomer.setCustomerContact(customer.getCustomerContact());
//		newCustomer.setCustomerAddress(customer.getCustomerAddress());
//		newCustomer.setCustomerGender(customer.getCustomerGender());
               customerrepo.save(newCustomer);
		         return newCustomer;	
	}

	@Override
	@Transactional 
	public boolean deleteCustomer(String customerId) {
			if(!customerrepo.existsById(customerId)) 
			{	
			   throw new CustomerNotFoundException("Customer with Id "+customerId+" Not Found");
			}
			customerrepo.deleteById(customerId);
			return !customerrepo.existsById(customerId);
			

		}

	@Override
	public AccountManagement addAccount(AccountManagement account) {
		if(accountrepo.existsById(account.getAccountId()))
		{
			throw new AccountManagementException("Account Already Exists");
		}
		return accountrepo.save(account);
	}

	@Override
	public Customer updateCustomerContact(Customer customer) {
		if(!customerrepo.existsById(customer.getCustomerId()))
			
			throw new CustomerNotFoundException("Customer with Id : " +customer.getCustomerId()+" Not Found");
			
				Customer newCustomer=customerrepo.getOne(customer.getCustomerId());
				newCustomer.setCustomerContact(customer.getCustomerContact());
				customerrepo.save(newCustomer);
				return newCustomer;
		
	}

	@Override
	public Customer updateCustomerAddress(Customer customer) {
if(!customerrepo.existsById(customer.getCustomerId()))
			
			throw new CustomerNotFoundException("Customer with Id : " +customer.getCustomerId()+" Not Found");
			
				Customer newCustomer=customerrepo.getOne(customer.getCustomerId());
				newCustomer.setCustomerAddress(customer.getCustomerAddress());
				customerrepo.save(newCustomer);
				return newCustomer;
		
	}
	}


