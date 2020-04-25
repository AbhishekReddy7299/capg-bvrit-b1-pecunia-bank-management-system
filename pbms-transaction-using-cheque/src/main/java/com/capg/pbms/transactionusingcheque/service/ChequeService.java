package com.capg.pbms.transactionusingcheque.service;


import com.capg.pbms.transactionusingcheque.model.AccountManagement;
import com.capg.pbms.transactionusingcheque.model.Cheque;
import com.capg.pbms.transactionusingcheque.model.Transaction;

public interface ChequeService {
	public AccountManagement getBalanceById(String accountId);
	public AccountManagement updateBalance(AccountManagement account); 
	public int creditUsingCheque(Transaction transaction,Cheque cheque);
	public int debitUsingCheque(Transaction transaction,Cheque cheque);
	
}
