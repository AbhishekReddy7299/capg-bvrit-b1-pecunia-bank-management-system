package com.capg.pbms.transactionms.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="cheque_info")
public class Cheque {
	 
	@Id 
	private String chequeId;
	//@Column(name="chequeno",length=6,nullable=false)
	private int chequeNum;
	//@Column(name="chequeaccountno",length=12,nullable=false)
	private String chequeAccountNo;
	private String chequeHolderName;
	private String chequeBankName;
	//@Column(name="chequeifsc",length=10,nullable=false,unique=true)
	//@Pattern(regexp="^[a-zA-Z0-9]{10}",message="length must be 10")
	private String chequeIFSC;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate chequeIssueDate;
	private String chequeStatus;
	 
	@OneToOne
	@JoinColumn(name="transactionId")
	private Transaction transaction;
	
 	 
	
	public Cheque() {
	super();	
	}
	
	public Cheque(String chequeId, int chequeNum, String chequeAccountNo, String chequeHolderName,
			String chequeBankName, String chequeIFSC, LocalDate chequeIssueDate, String chequeStatus) {
		super();
		this.chequeId = chequeId;
		this.chequeNum = chequeNum;
		this.chequeAccountNo = chequeAccountNo;
		this.chequeHolderName = chequeHolderName;
		this.chequeBankName = chequeBankName;
		this.chequeIFSC = chequeIFSC;
		this.chequeIssueDate = chequeIssueDate;
		this.chequeStatus = chequeStatus;
	}
	 
	 
	@Override
	public String toString() {
		return "Cheque [chequeId=" + chequeId + ", chequeNum=" + chequeNum + ", chequeAccountNo=" + chequeAccountNo
				+ ", chequeHolderName=" + chequeHolderName + ", chequeBankName=" + chequeBankName + ", chequeIFSC="
				+ chequeIFSC + ", chequeIssueDate=" + chequeIssueDate + ", chequeStatus=" + chequeStatus + "]";
	}

	public String getChequeId() {
		return chequeId;
	}
	public void setChequeId(String chequeId) {
		this.chequeId = chequeId;
	}
	public int getChequeNum() {
		return chequeNum;
	}
	public void setChequeNum(int chequeNum) {
		this.chequeNum = chequeNum;
	}
	public String getChequeAccountNo() {
		return chequeAccountNo;
	}
	public void setChequeAccountNo(String chequeAccountNo) {
		this.chequeAccountNo = chequeAccountNo;
	}
	public String getChequeHolderName() {
		return chequeHolderName;
	}
	public void setChequeHolderName(String chequeHolderName) {
		this.chequeHolderName = chequeHolderName;
	}
	public String getChequeBankName() {
		return chequeBankName;
	}
	public void setChequeBankName(String chequeBankName) {
		this.chequeBankName = chequeBankName;
	}
	public String getChequeIFSC() {
		return chequeIFSC;
	}
	public void setChequeIFSC(String chequeIFSC) {
		this.chequeIFSC = chequeIFSC;
	}
	public LocalDate getChequeIssueDate() {
		return chequeIssueDate;
	}
	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public void setChequeIssueDate(LocalDate chequeIssueDate) {
		this.chequeIssueDate = chequeIssueDate;
	}
	public String getChequeStatus() {
		return chequeStatus;
	}
	public void setChequeStatus(String chequeStatus) {
		this.chequeStatus = chequeStatus;
	}
	
}
