package com.capg.pbms.transactionms.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Account_info")
public class AccountManagement {
	@Id
	
	//@Column(name="account_id",length=12,nullable=false,unique=true)
	private String accountId;
	private String accountHolderId;
	private String accountBranchId;
	private String accountType;
	private String accountStatus;
	//@Column(name="accountbal" ,nullable=false)
	private double accountBalance;
	private double accountIntrest;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate lastUpdated;
	
	 
	public AccountManagement() {
		super();
	}
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderId() {
		return accountHolderId;
	}

	public void setAccountHolderId(String accountHolderId) {
		this.accountHolderId = accountHolderId;
	}

	public String getAccountBranchId() {
		return accountBranchId;
	}

	public void setAccountBranchId(String accountBranchId) {
		this.accountBranchId = accountBranchId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double getAccountIntrest() {
		return accountIntrest;
	}

	public void setAccountIntrest(double accountIntrest) {
		this.accountIntrest = accountIntrest;
	}

	public LocalDate getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(LocalDate lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	 
	public AccountManagement(String accountId, String accountHolderId, String accountBranchId, String accountType,
			String accountStatus, double accountBalance, double accountIntrest, LocalDate lastUpdated) {
		super();
		this.accountId = accountId;
		this.accountHolderId = accountHolderId;
		this.accountBranchId = accountBranchId;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountBalance = accountBalance;
		this.accountIntrest = accountIntrest;
		this.lastUpdated = lastUpdated;
	 }

	@Override
	public String toString() {
		return "AccountManagement [accountId=" + accountId + ", accountHolderId=" + accountHolderId
				+ ", accountBranchId=" + accountBranchId + ", accountType=" + accountType + ", accountStatus="
				+ accountStatus + ", accountBalance=" + accountBalance + ", accountIntrest=" + accountIntrest
				+ ", lastUpdated=" + lastUpdated +  "]";
	}
	
	
	 
 	
}
