package com.capg.pbms.accountmanagement.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pbms.accountmanagement.exceptions.CustomerAlreadyExistException;
import com.capg.pbms.accountmanagement.exceptions.CustomerNotFoundException;
import com.capg.pbms.accountmanagement.exceptions.EmptyCustomerListException;
import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.repository.IAccountRepo;
@Service
public class AccountServiceImpl implements IAccountService {
	
	@Autowired(required=false)
	IAccountRepo repo;

	@Override
	@Transactional
	public Customer addCustomer(Customer customer) {
		if(repo.existsById(customer.getCustomerContact()))
			throw new CustomerAlreadyExistException("Customer with Contact: " +customer.getCustomerContact()+" is Already Exist");
		return repo.save(customer);
	}

	@Override
	@Transactional
	public Customer getCustomer(String customerId) {
		if(!repo.existsById(customerId)) 
		{	
		   throw new CustomerNotFoundException("Customer with Id "+customerId+" Not Found");
		}
	    return repo.getOne(customerId);
	}

	  @Override
	  @Transactional
	   public List<Customer> getAllCustomer() {
		   if(repo.count()==0)
		    	throw new EmptyCustomerListException("No Customer Found in Customer Database"); 
			return repo.findAll();
	}

	@Override
	@Transactional
	public Customer updateCustomer(Customer customer) {
		if(!repo.existsById(customer.getCustomerId()))
			
	throw new CustomerNotFoundException("Customer with Id : " +customer.getCustomerId()+" Not Found");
	
		Customer newCustomer=repo.getOne(customer.getCustomerId());
		newCustomer.setCustomerName(customer.getCustomerName());
		newCustomer.setCustomerContact(customer.getCustomerContact());
		newCustomer.setCustomerAddress(customer.getCustomerAddress());
		newCustomer.setCustomerGender(customer.getCustomerGender());
               repo.save(newCustomer);
		         return newCustomer;	
	}

	@Override
	@Transactional 
	public boolean deleteCustomer(String customerId) {
			if(!repo.existsById(customerId)) 
			{	
			   throw new CustomerNotFoundException("Customer with Id "+customerId+" Not Found");
			}
			repo.deleteById(customerId);
			return !repo.existsById(customerId);
			

		}
	}


