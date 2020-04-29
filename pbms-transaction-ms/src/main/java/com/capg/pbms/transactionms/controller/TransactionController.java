package com.capg.pbms.transactionms.controller;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pbms.transactionms.model.AccountManagement;
import com.capg.pbms.transactionms.model.Cheque;
import com.capg.pbms.transactionms.model.Transaction;
import com.capg.pbms.transactionms.service.TransactionServiceImpl;

@RestController
@RequestMapping("/api")
public class TransactionController {
	 
	
	@Autowired
	TransactionServiceImpl transactionservice;
	
	@GetMapping("/accounts")
	public ResponseEntity<List<AccountManagement>> getAllAccounts(){
		List<AccountManagement> allaccounts=transactionservice.getAllAccounts();
		return new ResponseEntity<List<AccountManagement>>(allaccounts,HttpStatus.OK);
	}
	
	@GetMapping("/transactions")
	public ResponseEntity<List<Transaction>> getAllTransactions(){
		List<Transaction> alltransactions=transactionservice.getAllTransactions();
		return new ResponseEntity<List<Transaction>>(alltransactions,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public AccountManagement addAccount(@RequestBody AccountManagement account){
		return transactionservice.addAccount(account);
		 
	}
	
	@GetMapping("/getbalance/id/{id}")
	public double getBalanceById(@PathVariable("id") String accountId) {
		return transactionservice.getBalanceById(accountId); 
		 
	}
 	
	@PostMapping("/creditcheque/id/{id}/{amount}")
	public String creditUsingCheque(@PathVariable("id") String accountId ,@PathVariable("amount") double amount,@RequestBody Transaction transaction) {
		 Random random=new Random();
		  //transactionservice.creditUsingCheque(accountId,amount,transaction);
		return "Transaction details-------\n\n\n "+
		  	transactionservice.creditUsingCheque(accountId,amount,transaction)+" \n\n"
		  		+ "  TRANSACTION_ID :  "+ random.nextInt(100000000)+" deposited using cheque "+ amount+
				" .Rs to account number "+accountId+" succussful total account balance = "+
				transactionservice.getBalanceById(accountId)+" \n\n           - Pecunia Bank       ";
	}
	
	@PostMapping("/debitcheque/id/{id}/{amount}")
	 public String debitUsingCheque(@PathVariable("id") String accountId,@PathVariable("amount") double amount,@RequestBody Transaction transaction ) {
		Random random=new Random();
		//transactionservice.debitUsingCheque(accountId,amount,transaction);
		 return "transaction details------\n\n\n "
		 	+transactionservice.debitUsingCheque(accountId,amount,transaction)+"\n\n "
				+ "TRANSACTION ID: "+ random.nextInt(100000000)+" withdraw using cheque amount "
		 	+ amount+ " .Rs through account number "+accountId+" succussful total account balance = "
		 	+transactionservice.getBalanceById(accountId)+"  \n\n               - Pecunia Bank       ";
 
	}
  
	@PostMapping("/creditslip/id/{id}/{amount}")
	public String creditUsingSlip(@PathVariable("id") String accountId ,@PathVariable("amount") double amount,@RequestBody Transaction transaction) {
		 
		Random random=new Random();
		//transactionservice.creditUsingSlip(accountId,amount,transaction);	
		return "transaction Details----\n\n\n "+
			transactionservice.creditUsingSlip(accountId,amount,transaction)+
			"\n\n TRANSACTION ID: "+ random.nextInt(100000000)+" deposited using slip "+ amount+
				" .Rs to account number "+accountId+" succussful total account balance = "+
				transactionservice.getBalanceById(accountId)+"\n\n                - Pecunia Bank       ";

	}
	
	@PostMapping("/debitslip/id/{id}/{amount}")
	 public String debitUsingSlip(@PathVariable("id") String accountId,@PathVariable("amount") double amount,@RequestBody Transaction transaction ) {
		Random random=new Random();
		//transactionservice.debitUsingSlip(accountId,amount,transaction);
		 return "transaction details---- \n\n\n"+
		 	transactionservice.debitUsingSlip(accountId,amount,transaction)+
		 	"\n\n TRANSACTION ID: "+ random.nextInt(100000000)+" withdraw using slip "+ amount+
				 " .Rs through account number "+accountId+" succussful total account balance = "
				 +transactionservice.getBalanceById(accountId)+" \n\n            - Pecunia Bank       ";
 
	}

	 

}
