package com.capg.pbms.accountmanagement.service;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.pbms.accountmanagement.exceptions.AccountAlreadyExistException;
import com.capg.pbms.accountmanagement.exceptions.AccountNotFoundException;
import com.capg.pbms.accountmanagement.exceptions.EmptyAccountListException;
import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.repository.IAccountManagementRepo;
@Service
public class AccountManagementServiceImpl implements IAccountManagementService {
	
	@Autowired(required=false)
	IAccountManagementRepo accountrepo;
 
	@Override
	@Transactional
	public Customer addAccount(Customer customer) {
		customer.setAccountId(Long.parseLong(String.valueOf(Math.abs(new Random().nextLong())).substring(0, 12)));
		customer.setAccountHolderId(String.valueOf(Math.abs(new Random().nextLong())).substring(0, 12));
		customer.setAccountBranchId("1");
		customer.setAccountBalance(0.0);
		customer.setAccountIntrest(0.0);
		customer.setCustomerId(String.valueOf(Math.abs(new Random().nextLong())).substring(0,4));
		if(accountrepo.existsById(customer.getAccountId()))
		throw new AccountAlreadyExistException("Customer with Id: " +customer.getAccountId()+" is Already Exist");
		return accountrepo.save(customer);
	}
	@Override
	@Transactional
	public Customer getAccount(long accountId) {
		if(!accountrepo.existsById(accountId)) 
		{	
		   throw new AccountNotFoundException("Customer with Id "+accountId+" Not Found");
		}
	    return accountrepo.getOne(accountId);
	}

	
	@Override
	@Transactional
	public Customer updateCustomerName(long accountId,Customer customer) {
		if(!accountrepo.existsById(customer.getAccountId()))
			
	throw new AccountNotFoundException("Customer with Id : " +customer.getAccountId()+" Not Found");
	
		Customer newAccount=accountrepo.getOne(customer.getAccountId());
		newAccount.setCustomerName(customer.getCustomerName());
               accountrepo.save(newAccount);
		         return newAccount;	
	}

	@Override
	@Transactional 
	public boolean deleteAccount(long accountId) {
			if(!accountrepo.existsById(accountId)) 
			{	
			   throw new AccountNotFoundException("Customer with Id "+accountId+" Not Found");
			}
			accountrepo.deleteById(accountId);
			return !accountrepo.existsById(accountId);
			

		}

	@Override
	public List<Customer> getAllAccounts() {
	
		 if(accountrepo.count()==0)
		    throw new EmptyAccountListException("No Account Found in Account Database");
			return accountrepo.findAll();
	}

	@Override
	public Customer updateCustomerContact(long accountId,Customer customer) {
		
	 if(!accountrepo.existsById(customer.getAccountId()))
			
	 throw new AccountNotFoundException("Customer with Id : " +customer.getAccountId()+" Not Found");
			
		Customer newAccount=accountrepo.getOne(customer.getAccountId());
		newAccount.setCustomerContact(customer.getCustomerContact());
		     accountrepo.save(newAccount);
		      return newAccount;	
	}

	@Override
	public Customer updateCustomerAddress(long accountId,Customer customer) {
		
		 if(!accountrepo.existsById(customer.getAccountId()))
				
		 throw new AccountNotFoundException("Customer with Id : " +customer.getAccountId()+" Not Found");
					
			Customer newAccount=accountrepo.getOne(customer.getAccountId());
			newAccount.setCustomerAddress(customer.getCustomerAddress());
				     accountrepo.save(newAccount);
				      return newAccount;	

		
	}

	}


