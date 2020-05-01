package com.capg.pbms.transactionms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.transactionms.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,String> {

}
