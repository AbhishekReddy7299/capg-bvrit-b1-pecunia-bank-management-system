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
import com.capg.pbms.accountmanagement.service.IAccountService;

@RestController
@RequestMapping("/account")
public class AccountRepoController {
	
	@Autowired(required=false)
	IAccountService service;
	@PostMapping("/add")
	public ResponseEntity<Customer> addPassenger(@RequestBody Customer customer)
	{
	   	return new ResponseEntity<Customer>(service.addCustomer(customer),HttpStatus.OK);
	}
	@GetMapping("/id/{customerId}")
	public ResponseEntity<Customer> getCustomer(@PathVariable("customerId") String customerId)
	{	
		return new ResponseEntity<Customer>(service.getCustomer(customerId),HttpStatus.OK); 		
    }
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAllCustomer()
	{
		return new ResponseEntity<List<Customer>>(service.getAllCustomer(),HttpStatus.OK);
	}
	@PutMapping("/update")
	public ResponseEntity<Customer> updatePassenger(@RequestBody Customer customer)
	{
		   return new ResponseEntity<Customer>(service.updateCustomer(customer),HttpStatus.OK);
	}
	@DeleteMapping("/delete/id/{customerId}")
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("customerId") String customerId)
    {
		return new ResponseEntity<Customer>(HttpStatus.OK);
    }
}
