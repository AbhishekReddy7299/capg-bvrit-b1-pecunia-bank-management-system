package com.capg.pbms.accountmanagement.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Customer {
	@Id
	private String customerId;
	private String customerName;
	private Address customerAddress;
	private String customerAadhar;
	private String customerPan;
	private String customerContact;
	private String customerGender;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate CustomerDob;
	public Customer() {
		
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerAadhar() {
		return customerAadhar;
	}
	public void setCustomerAadhar(String customerAadhar) {
		this.customerAadhar = customerAadhar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public LocalDate getCustomerDob() {
		return CustomerDob;
	}
	public void setCustomerDob(LocalDate customerDob) {
		CustomerDob = customerDob;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerAadhar=" + customerAadhar + ", customerPan=" + customerPan
				+ ", customerContact=" + customerContact + ", customerGender=" + customerGender + ", CustomerDob="
				+ CustomerDob + "]";
	}
	public Customer(String customerId, String customerName, Address customerAddress, String customerAadhar,
			String customerPan, String customerContact, String customerGender, LocalDate customerDob) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		CustomerDob = customerDob;
	}

}
