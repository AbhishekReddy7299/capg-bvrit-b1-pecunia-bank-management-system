package com.capg.pbms.transactionms.service;

import java.util.List;

import javax.transaction.Transactional;

import com.capg.pbms.transactionms.exception.AccountException;
import com.capg.pbms.transactionms.model.AccountManagement;
import com.capg.pbms.transactionms.model.Cheque;
import com.capg.pbms.transactionms.model.Transaction;
 
public interface TransactionService {

	 List<AccountManagement> getAllAccounts();
 	
	 List<Transaction> getAllTransactions();
 	
	 AccountManagement addAccount(AccountManagement account) ;
 	
	 double getBalanceById(String accountId) ;
 
	 Transaction creditUsingCheque(String accountId,double amount,Transaction transaction) ;
	 	 
	 Transaction debitUsingCheque(String accountId,double amount,Transaction transaction) ;
 	
	 Transaction creditUsingSlip(String accountId,double amount,Transaction transaction) ;
 	
	 Transaction debitUsingSlip(String accountId,double amount,Transaction transaction) ;
  		 
	 
}
