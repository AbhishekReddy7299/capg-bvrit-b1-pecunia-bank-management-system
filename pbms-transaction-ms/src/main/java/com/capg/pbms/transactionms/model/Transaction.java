package com.capg.pbms.transactionms.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="transaction_info")
public class Transaction {
	
	@Id
	//@Column(name="transaccount_id",length=12,nullable=false)
	private String transAccountId;
	private String transType;
	//@Column(name="transamount",nullable=false)
	private double transAmount;
	private String transOption;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate transDate;
	private String transChequeId;
	private String transFrom;
	private String transTo;
	private double transClosingBalance;

	@OneToMany(cascade = CascadeType.ALL,mappedBy="transaction")
	private List<Cheque> chequeList;
	
	 
	public Transaction() {
		super();
	}


	public String getTransAccountId() {
		return transAccountId;
	}


	public void setTransAccountId(String transAccountId) {
		this.transAccountId = transAccountId;
	}


	public String getTransType() {
		return transType;
	}


	public void setTransType(String transType) {
		this.transType = transType;
	}


	public double getTransAmount() {
		return transAmount;
	}


	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}


	public String getTransOption() {
		return transOption;
	}


	public void setTransOption(String transOption) {
		this.transOption = transOption;
	}


	public LocalDate getTransDate() {
		return transDate;
	}


	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}


	public String getTransChequeId() {
		return transChequeId;
	}


	public void setTransChequeId(String transChequeId) {
		this.transChequeId = transChequeId;
	}


	public String getTransFrom() {
		return transFrom;
	}


	public void setTransFrom(String transFrom) {
		this.transFrom = transFrom;
	}


	public String getTransTo() {
		return transTo;
	}


	public void setTransTo(String transTo) {
		this.transTo = transTo;
	}


	public double getTransClosingBalance() {
		return transClosingBalance;
	}


	public void setTransClosingBalance(double transClosingBalance) {
		this.transClosingBalance = transClosingBalance;
	}


	public List<Cheque> getChequeList() {
		return chequeList;
	}


	public void setChequeList(List<Cheque> chequeList) {
		this.chequeList = chequeList;
	}


	public Transaction(String transAccountId, String transType, double transAmount, String transOption,
			LocalDate transDate, String transChequeId, String transFrom, String transTo, double transClosingBalance,
			List<Cheque> chequeList) {
		super();
		this.transAccountId = transAccountId;
		this.transType = transType;
		this.transAmount = transAmount;
		this.transOption = transOption;
		this.transDate = transDate;
		this.transChequeId = transChequeId;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.transClosingBalance = transClosingBalance;
		this.chequeList = chequeList;
	}


	@Override
	public String toString() {
		return "Transaction [transAccountId=" + transAccountId + ", transType=" + transType + ", transAmount="
				+ transAmount + ", transOption=" + transOption + ", transDate=" + transDate + ", transChequeId="
				+ transChequeId + ", transFrom=" + transFrom + ", transTo=" + transTo + ", transClosingBalance="
				+ transClosingBalance + ", chequeList=" + chequeList + "]";
	}
	
 }
