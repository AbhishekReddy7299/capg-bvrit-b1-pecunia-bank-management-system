package com.capg.pbms.accountmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capg.pbms.accountmanagement.model.Customer;

@Repository
public interface IAccountManagementRepo extends JpaRepository<Customer , Long> {

}
