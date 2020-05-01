package com.capg.pbms.transactionms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pbms.transactionms.exception.AccountException;
import com.capg.pbms.transactionms.model.AccountManagement;
import com.capg.pbms.transactionms.model.Transaction;
import com.capg.pbms.transactionms.repository.AccountManagementRepo;
import com.capg.pbms.transactionms.repository.TransactionRepo;

import java.util.List;

import javax.transaction.Transactional;

@Service
public class TransactionServiceImpl implements  TransactionService {
 	@Autowired
	AccountManagementRepo accountRepo;
	@Autowired
	TransactionRepo transactionRepo;
	 
	
	public List<AccountManagement> getAllAccounts(){
		return accountRepo.findAll();
	}
	
	
 	public List<Transaction> getAllTransactions(){
		return transactionRepo.findAll();
	}
	
	
	@Transactional
	public AccountManagement addAccount(AccountManagement account) {
		if(accountRepo.existsById(account.getAccountId())) {
			throw new AccountException("Account Already Exists");
		}
		return accountRepo.save(account);
	}

	
	@Transactional
	public double getBalanceById(String accountId) {
		AccountManagement account=accountRepo.getOne(accountId);
         /*	if(!accountRepo.existsById(accountId) ) {
				throw new AccountException("Invalid Account Details");
			}*/
		return account.getAccountBalance();
		 
	}
	 
 	
	
	@Transactional
	public Transaction creditUsingCheque(String accountId,double amount,Transaction transaction) {
	 	 
		if(!accountRepo.existsById(accountId) ) {
			
			throw new AccountException("Account Does not exists");
		}
		else if(amount<100 || amount>200000) {
			throw new AccountException("please Enter the amount with in 100 - 200000");
		}
 		AccountManagement account=accountRepo.getOne(accountId);
		
		double currentBalance=getBalanceById(accountId)+amount;
		 account.setAccountBalance(currentBalance);
		 accountRepo.save(account);
		return transactionRepo.save(transaction);

	}

	
	@Transactional
	public Transaction debitUsingCheque(String accountId,double amount,Transaction transaction) {
		if(!accountRepo.existsById(accountId) ) {
			
			throw new AccountException("Account Does not exists");
		}
		else if(amount<100 || amount>200000) {
			throw new AccountException("please Enter the amount with in 100 - 200000");
		}
		else if(amount>getBalanceById(accountId)) {
			throw new AccountException("Insufficient balance");
		}
 		AccountManagement account=accountRepo.getOne(accountId);
		double currentBalance=getBalanceById(accountId)-amount;
		 account.setAccountBalance(currentBalance);
		 accountRepo.save(account);
		return transactionRepo.save(transaction);
 
	}
	
	
	@Transactional
	public Transaction creditUsingSlip(String accountId,double amount,Transaction transaction) {
	 	 if(!accountRepo.existsById(accountId) ) {
			
			throw new AccountException("Account Does not exists");
		}
		AccountManagement account=accountRepo.getOne(accountId);
		
		double currentBalance=getBalanceById(accountId)+amount;
		 account.setAccountBalance(currentBalance);
		 accountRepo.save(account);
	 	return transactionRepo.save(transaction);
	}

	
	@Transactional
	public Transaction debitUsingSlip(String accountId,double amount,Transaction transaction) {
  		if(!accountRepo.existsById(accountId) ) {
			
			throw new AccountException("Account Does not exists");
		}
  		AccountManagement account=accountRepo.getOne(accountId);
		
		double currentBalance=getBalanceById(accountId)-amount;
		 account.setAccountBalance(currentBalance);
		 accountRepo.save(account);
 		return transactionRepo.save(transaction);
	}

  	 

}
