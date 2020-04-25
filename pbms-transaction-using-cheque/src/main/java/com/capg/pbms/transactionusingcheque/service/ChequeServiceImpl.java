package com.capg.pbms.transactionusingcheque.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pbms.transactionusingcheque.model.AccountManagement;
import com.capg.pbms.transactionusingcheque.model.Cheque;
import com.capg.pbms.transactionusingcheque.model.Transaction;
import com.capg.pbms.transactionusingcheque.repository.IChequeRepo;
@Service
public class ChequeServiceImpl implements ChequeService {

	@Autowired
	IChequeRepo repo;
	@Autowired
	AccountManagement accountManagement;
	@Autowired
	Cheque cheques;
	@Override
	public AccountManagement getBalanceById(String accountId) {
	
		return repo.getBalanceById(accountId);
	}
	@Override
	public AccountManagement updateBalance(AccountManagement account) {
		 accountManagement.setAccountBalance(account.getAccountBalance());
		
	}
	@Override
	public int creditUsingCheque(Transaction transaction, Cheque cheque) {

		return 0;
	}
	@Override
	public int debitUsingCheque(Transaction transaction, Cheque cheque) {

		return 0;
	}
	
}
