package com.capg.pecunia_banking_management.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capg.pecunia_banking_management.model.Address;
import com.capg.pecunia_banking_management.model.Customer;

public class EmployeeDaoImplementation implements EmployeeDao{
	Scanner scanner=new Scanner(System.in);
	Map<Long, Customer> customerAccounts=new HashMap<>();
	HashMap<String,String> mydata=new HashMap<>();
	mydata.put("abhishek@pecunia.com", "12345");
	mydata.put("prameela@pecunia.com", "54321");
	mydata.put("rebecca@pecunia.com", "987654");
	public EmployeeDaoImplementation() {
		addSomeCustomerAccount();
	}

	public void addSomeCustomerAccount() {
	Address a1=new Address("h.no:1234","h.no:4567","Hyderabad","Telangana","India",502121);
	Customer ac1=new Customer("akhila",123456789123L,9515189083L,463786866610L,"bcdef1234a",new Date(1998,10,31),"female",a1);
	Address a2=new Address("h.no:4321","h.no:7654","Gajwel","Telangana","India",502278);
	Customer ac2=new Customer("abhishek",987654321987L,9989765432L,314263954567L,"bcdaf1534g",new Date(1997,05,17),"male",a2);
	Address a3=new Address("h.no:1290","h.no:4789","Rangareddy","Telangana","India",502270);
	Customer ac3=new Customer("sowjanya",198765432123L,8121345690L,325476981234L,"abcde4567f",new Date(1999,04,12),"female",a3);
	

//	customerAccounts.put(ac1.getCustomerName(),ac1);
//	customerAccounts.put(ac1.getCustomerName(),ac2);
		
	}

	@Override
	public boolean addCustomer(Customer customer) {
		
	customerAccounts.put(customer.getCustomerAdhar(), customer);
	return true;
	}

	public boolean deleteCustomer(int customerAadhar) {
		
		return false;
	}
	@Override
	public boolean updateCustomerName(Customer customer)) {
		if(customerAccounts.containsKey(customerAccntNo))
		{
			
			customer.setCustomerName(in.next());
		}
		return true;
	}

	@Override
	public boolean updateCustomerContact(Customer customer) {
		if(customerAccounts.containsKey(customerAccntNo))
		{
			
			customer.setCustomerName(in.nextLong());
		}
		return false;
	}

	@Override
	public boolean updateCustomerAddress(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}


}
