package com.capg.pbms.accountmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pbms.accountmanagement.model.Customer;
import com.capg.pbms.accountmanagement.service.IAccountService;

@RestController
@RequestMapping("/account")
public class AccountRepoController {
	
	@Autowired
	IAccountService service;
	@PostMapping("/add")
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}
	@GetMapping("/id/{customerId}")
	public Customer getCustomer(@PathVariable String customerId)
	{
		return service.getCustomer(customerId);
}
}
