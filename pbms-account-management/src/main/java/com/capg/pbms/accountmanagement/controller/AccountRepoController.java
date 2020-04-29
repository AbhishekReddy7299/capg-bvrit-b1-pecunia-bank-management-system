package com.capg.pbms.accountmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pbms.accountmanagement.model.AccountManagement;
import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.service.IAccountManagementService;

@RestController
@RequestMapping("/api")
public class AccountRepoController {
	
	@Autowired(required=false)
	IAccountManagementService service;
	@PostMapping("/addcustomer/id/{accountId}")
	public Customer addCustomer(@PathVariable ("accountId") String accountId,@RequestBody Customer customer)
	{
	   	return service.addCustomer(accountId,customer);
	}
	@PostMapping("/account")
	public AccountManagement addAccount(@RequestBody AccountManagement account){
		 return service.addAccount(account);
		//return new ResponseEntity<AccountManagement>(account,HttpStatus.CREATED);
	}
	@GetMapping("/id/{customerId}")
	public Customer getCustomer(@PathVariable("customerId") String customerId)
	{	return service.getCustomer(customerId);
		//return new ResponseEntity<Customer>(service.getCustomer(customerId),HttpStatus.OK); 		
    }
	
//	@GetMapping("/id/{customerId}")
//	public Customer getAddress(@PathVariable("customerId") String customerId)
//	{	return service.getCustomer(customerId);
//		//return new ResponseEntity<Customer>(service.getCustomer(customerId),HttpStatus.OK); 		
//    }
	
	@PutMapping("/updateName")
	public ResponseEntity<Customer> updateCustomerName(@RequestBody Customer customer)
	{
		   return new ResponseEntity<Customer>(service.updateCustomerName(customer),HttpStatus.OK);
	}

	@PutMapping("/updateContact")
	public ResponseEntity<Customer> updateCustomerContact(@RequestBody Customer customer)
	{
		   return new ResponseEntity<Customer>(service.updateCustomerName(customer),HttpStatus.OK);
	}
	@PutMapping("/updateAddress")
	public ResponseEntity<Customer> updateCustomerAddress(@RequestBody Customer customer)
	{
		   return new ResponseEntity<Customer>(service.updateCustomerName(customer),HttpStatus.OK);
	}
	@DeleteMapping("/delete/id/{customerId}")
    public boolean deleteCustomer(@PathVariable("customerId") String customerId)
    {
		return service.deleteCustomer(customerId);
    }
}
