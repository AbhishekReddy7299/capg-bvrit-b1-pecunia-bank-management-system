package com.capg.pbms.transactionusingcheque.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.transactionusingcheque.model.AccountManagement;
import com.capg.pbms.transactionusingcheque.model.Transaction;


public interface IChequeRepo extends JpaRepository<Transaction,String> {
	@Autowired 
	AccountManagement accountManagement;
	
	

	AccountManagement getBalanceById(String accountId);

}
