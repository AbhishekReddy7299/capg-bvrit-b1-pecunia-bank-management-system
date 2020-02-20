package com.capg.pecunia_banking_management.model;

import java.util.Date;

public class Customer {
	private String customerName;
	private long customerAccountNo;
	private long customerContact;
	private long customerAdhar;
	private String customerPan;
	private Date CustomerDob;
	private String customerGender;
	private Address customerAddress;
	
	public Customer(String customerName, long customerAccountNo, long customerContact, long customerAdhar,
			String customerPan, Date customerDob, String customerGender, Address customerAddress) {
		super();
		this.customerName = customerName;
		this.customerAccountNo = customerAccountNo;
		this.customerContact = customerContact;
		this.customerAdhar = customerAdhar;
		this.customerPan = customerPan;
		CustomerDob = customerDob;
		this.customerGender = customerGender;
		this.customerAddress = customerAddress;
	}

	public long getCustomerAccountNo() {
		return customerAccountNo;
	}

	public void setCustomerAccountNo(long customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}

	public Customer(String cName, Long cAccnt) {
		super();
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public long getCustomerAdhar() {
		return customerAdhar;
	}
	public void setCustomerAdhar(long customerAdhar) {
		this.customerAdhar = customerAdhar;
	}
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	public Date getCustomerDob() {
		return CustomerDob;
	}
	public void setCustomerDob(Date customerDob) {
		CustomerDob = customerDob;
	}
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CustomerDob == null) ? 0 : CustomerDob.hashCode());
		result = prime * result + (int) (customerAccountNo ^ (customerAccountNo >>> 32));
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + (int) (customerAdhar ^ (customerAdhar >>> 32));
		result = prime * result + (int) (customerContact ^ (customerContact >>> 32));
		result = prime * result + ((customerGender == null) ? 0 : customerGender.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPan == null) ? 0 : customerPan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (CustomerDob == null) {
			if (other.CustomerDob != null)
				return false;
		} else if (!CustomerDob.equals(other.CustomerDob))
			return false;
		if (customerAccountNo != other.customerAccountNo)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerAdhar != other.customerAdhar)
			return false;
		if (customerContact != other.customerContact)
			return false;
		if (customerGender == null) {
			if (other.customerGender != null)
				return false;
		} else if (!customerGender.equals(other.customerGender))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPan == null) {
			if (other.customerPan != null)
				return false;
		} else if (!customerPan.equals(other.customerPan))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerAccountNo=" + customerAccountNo
				+ ", customerContact=" + customerContact + ", customerAdhar=" + customerAdhar + ", customerPan="
				+ customerPan + ", CustomerDob=" + CustomerDob + ", customerGender=" + customerGender
				+ ", customerAddress=" + customerAddress + "]";
	}
	
	
	

}
