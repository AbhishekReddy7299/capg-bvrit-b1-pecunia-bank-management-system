package com.capg.pbms.accountmanagement.model;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "Cus_info")
public class Customer {
	@Id
	private String customerId;
	private String customerName;
	private String customerAadhar;
	private String customerPan;
	private String customerContact;
	private String customerGender;
	@DateTimeFormat(pattern="yyyy/MM/dd")
	private LocalDate CustomerDob;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Address.class)
	@JoinColumn(name="address",referencedColumnName = "customerId")
	private Address customerAddress;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerId, String customerName, String customerAadhar, String customerPan,
			String customerContact, String customerGender, LocalDate customerDob, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		CustomerDob = customerDob;
		this.customerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAadhar="
				+ customerAadhar + ", customerPan=" + customerPan + ", customerContact=" + customerContact
				+ ", customerGender=" + customerGender + ", CustomerDob=" + CustomerDob + ", customerAddress="
				+ customerAddress + "]";
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
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
		 
}
