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
import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.service.IAccountManagementService;

@RestController
@RequestMapping("/api")
public class AccountRepoController {
	
	@Autowired(required=false)
	IAccountManagementService service;
	@PostMapping("/add")
	public ResponseEntity<Customer> addAccount(@RequestBody Customer customer){
		return new ResponseEntity<Customer>(customer,HttpStatus.CREATED);
	}
	@GetMapping("/id/{accountId}")
	public ResponseEntity<Customer> getAccount(@PathVariable("accountId") long accountId)
	{	
		return new ResponseEntity<Customer>(service.getAccount(accountId),HttpStatus.OK); 		
    }
	
	@PutMapping("/updateName")
	public ResponseEntity<Customer> updateCustomerName(@RequestBody Customer customer)
	{
	  return new ResponseEntity<Customer>(service.updateCustomerName(customer),HttpStatus.OK);
	}
	
	@PutMapping("/updateContact")
	public ResponseEntity<Customer> updateCustomerContact(@RequestBody Customer customer)
	{
	  return new ResponseEntity<Customer>(service.updateCustomerContact(customer),HttpStatus.OK);
	}
	
	@PutMapping("/updateAddress")
	public ResponseEntity<Customer> updateCustomerAddress(@RequestBody Customer customer)
	{
	  return new ResponseEntity<Customer>(service.updateCustomerAddress(customer),HttpStatus.OK);
	}

	@DeleteMapping("/delete/id/{accountId}")
    public boolean deleteAccount(@PathVariable("accountId") long accountId)
    {
		return service.deleteAccount(accountId);
    }
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllAccounts()
	{
		return new ResponseEntity<List<Customer>>(service.getAllAccounts(),HttpStatus.OK);
	}
}
