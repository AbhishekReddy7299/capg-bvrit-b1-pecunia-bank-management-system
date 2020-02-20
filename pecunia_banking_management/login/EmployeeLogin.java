package com.capg.pecunia_banking_management.login;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class EmployeeLogin {
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the email_id");
	String email_id=sc.next();
	System.out.println("Enter the password");
	String password=sc.next();
	HashMap<String,String> mydata=new HashMap<>();
	mydata.put("abhishek@pecunia.com", "12345");
	mydata.put("prameela@pecunia.com", "54321");
	mydata.put("rebecca@pecunia.com", "987654");
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
	    break;
	    case 0:
	    str= "Login failed";
	    System.out.println("CLICK ON FORGOT PASSWORD");
	        System.out.println("Enter the new password");
	        pswrd=sc.next();
	        mydata.replace(email_id, pswrd);
	        System.out.println("Password changed successfully");
	       System.out.println(email_id);
	   
	    }
//	    System.out.println(mydata);
	 
	}
}	

