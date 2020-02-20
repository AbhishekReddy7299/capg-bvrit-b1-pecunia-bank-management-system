package com.capg.pecunia_banking_management.ui;
import com.capg.pecunia_banking_management.dao.EmployeeDao;
import com.capg.pecunia_banking_management.dao.EmployeeDaoImplementation;
import com.capg.pecunia_banking_management.model.Address;
import com.capg.pecunia_banking_management.model.Customer;
import com.capg.pecunia_banking_management.service.EmployeeService;
import com.capg.pecunia_banking_management.service.EmployeeServiceImplementation;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PbmsUi {
	static EmployeeService es=new EmployeeServiceImplementation();
	EmployeeDaoImplementation reference=new EmployeeDao();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the email_id");
		String email_id=in.next();
		System.out.println("Enter the password");
		String password=in.next();
		
		//mydata.put("rebecca@pecunia.com", "987654");
		Collection<String> keys = mydata.keySet();
		Collection<String> values= mydata.values();
		String str = null;
		String pswrd;
		 boolean  a = (keys.contains(email_id)&& (values.contains(password)));
		 int val = (a)?1:0;
		    switch(val) {
		    case 1:
		    str="LOGIN SUCCESFUL";
		    System.out.println(str);
		    System.out.println("choose service label");
		    int option=in.nextInt();
		    
				switch(option) {
				case 1:
					System.out.println("Create a new Account ");
					try
					{
					  System.out.println("Enter customer name");
					  String cName=in.nextLine();
					  System.out.println("Enter customer Account number");
						Long cAccnt=in.nextLong();
						Long length2=(long) String.valueOf(cAccnt).length();
						if(length2==12)
						{
							
						}
						else
						{
							throw new Exception("Invalid Account number");
						}
					  System.out.println("Enter contact number");
					  Long cContact=in.nextLong();
					  Long length=(long) String.valueOf(cContact).length();
					  if(length==10)
					  {
						  
					  }
					  else
					  {
						  throw new Exception("Invalid contact number");
					  }
					  System.out.println("Enter Aadhar number");
					  Long cAadhar=in.nextLong();
					  Long length1=(long) String.valueOf(cAadhar).length();
					  if(length1==12)
					  {
						  
					  }
					  else
					  {
						 throw new Exception("Invalid Adhar number");
					  }
					  System.out.println("Enter PAN ");
					  String cPan=in.nextLine();
					  if(cPan.matches("[a-z]{5}[0-9]{4}[a-z]{1}"))
					  {
						  
					  }
					  else
					  {
						  throw new Exception("invalid PAN");
					  }
					  System.out.println("Enter DoB (eg 1995-02-25)");
					  String date=in.next()+in.nextLine();
					  SimpleDateFormat smf=new SimpleDateFormat("yyyy-MM-dd");
					  Date cDoB=smf.parse(date);
					  System.out.println("Enter gender");
					  String cGender=in.nextLine();
					  if(cGender.equals("female")||cGender.equals("male"))
					  {
						  
					  }
					  else
					  {
						  throw new Exception("Invalid");
					  }
					  System.out.println("Enter addressline1");
					  String ad1=in.nextLine();
					  System.out.println("Enter addressline2");
					  String ad2=in.nextLine();
					  System.out.println("Enter city");
					  String cityName=in.nextLine();
					  System.out.println("Enter State");
					  String stateName=in.nextLine();
					  System.out.println("Enter country");
					  String countryName=in.nextLine();
					  System.out.println("Enter zipcode");
					  int zipCode=in.nextInt();
					  int length3=String.valueOf(zipCode).length();
					  if(length3==6)
					  {
						  
					  }
					  else
					  {
						  throw new Exception("invalid zipcode");
					  }
					  Address ac=new Address();
					  ac.setAddressline1(ad1);
					  ac.setAddressline2(ad2);
					  ac.setCity(cityName);
					  ac.setState(stateName);
					  ac.setCountry(countryName);
					  ac.setZipcode(zipCode); 
					  
					  Customer ca=new Customer(cName,cAccnt,cContact,cAadhar, cPan,cDoB,cGender,ac);
				  }
					catch(Exception e)
					{
						System.out.println(e);
					}
//					EmployeeService cs;
//
//					//Customer cd1=new Customer();
//					cs.addCustomer(cd1);	
					break;
		    case 2:
		    	System.out.println("Update customer name");
		    	try
				{
				  System.out.println("Enter customer name");
				  String cName=in.nextLine();
				  System.out.println("Enter customer Account number");
				Long cAccnt=in.nextLong();
				Long length=(long) String.valueOf(cAccnt).length();
				if(length==12)
				{
					
				}
				else
				{
					throw new Exception("Invalid Account number");
				}
				Customer ca1=new Customer(cName,cAccnt);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
		    	break;
		    	
		    case 3:
		    	System.out.println("update customer contact");
		    	
				try
				{
				System.out.println("Enter contact number");
				  Long cContact=in.nextLong();
				  Long length=(long) String.valueOf(cContact).length();
				  if(length==10)
				  {
					  
				  }
				  else
				  {
					  
						throw new Exception("Invalid contact number");
					} 
				  System.out.println("Enter customer Account number");
					Long cAccnt=in.nextLong();
					Long length1=(long) String.valueOf(cAccnt).length();
					if(length1==12)
					{
						
					}
					else
					{
						throw new Exception("Invalid Account number");
					}
				}
					catch(Exception e)
					{
						System.out.println(e);
					}
				break;
		    case 4:
		    	System.out.println("update customer address");
		    	try
				{
				System.out.println("Enter customer Account number");
				Long cAccnt=in.nextLong();
				Long length1=(long) String.valueOf(cAccnt).length();
				if(length1==12)
				{
					
				}
				else
				{
					throw new Exception("Invalid Account number");
				}
				 System.out.println("Enter addressline1");
				  String ad1=in.nextLine();
				  System.out.println("Enter addressline2");
				  String ad2=in.nextLine();
				  System.out.println("Enter city");
				  String cityName=in.nextLine();
				  System.out.println("Enter State");
				  String stateName=in.nextLine();
				  System.out.println("Enter country");
				  String countryName=in.nextLine();
				  System.out.println("Enter zipcode");
				  int zipCode=in.nextInt();
				  int length3=String.valueOf(zipCode).length();
				  if(length3==6)
				  {
					  
				  }
				  else
				  {
					  throw new Exception("invalid zipcode");
				  }
				  System.out.println("Enter customer Account number");
					Long cAccnt1=in.nextLong();
					Long length11=(long) String.valueOf(cAccnt1).length();
					if(length11==12)
					{
						
					}
					else
					{
						throw new Exception("Invalid Account number");
					}
				}
			catch(Exception e)
			{
				System.out.println(e);
			}
		    	break;
		    case 5:
		    	System.out.println("delete customer account");
		    	System.out.println("Enter customer Account number");
				Long cAccnt=in.nextLong();
				Long length1=(long) String.valueOf(cAccnt).length();
				try
				{
				if(length1==12)
				{
					
				}
				else
				{
					throw new Exception("Invalid Account number");
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				break;
		    case 0:
		    str= "Login failed";
		    System.out.println("CLICK ON FORGOT PASSWORD");
		        System.out.println("Enter the new password");
		        pswrd=in.next();
		        mydata.replace(email_id, pswrd);
		        System.out.println("Password changed successfully");
		       System.out.println(email_id);
		   
		    }

		 
		}
}	
	public static void main(String args[]) {
		PbmsUi main=new PbmsUi();
		main.c
	}
}


