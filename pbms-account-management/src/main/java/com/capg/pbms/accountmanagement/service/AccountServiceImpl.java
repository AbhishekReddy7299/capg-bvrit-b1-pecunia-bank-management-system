package com.capg.pbms.accountmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.repository.IAccountRepo;
@Service
public class AccountServiceImpl implements IAccountService {
	
	@Autowired
	IAccountRepo repo;

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.saveAndFlush(customer);
	}

	@Override
	public Customer getCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(String customerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
