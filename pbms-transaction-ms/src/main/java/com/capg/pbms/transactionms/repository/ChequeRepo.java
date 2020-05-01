package com.capg.pbms.transactionms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.pbms.transactionms.model.Cheque;

public interface ChequeRepo extends JpaRepository<Cheque,String>{

}
