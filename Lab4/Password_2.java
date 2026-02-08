package com.Lab4;

import java.util.Scanner;

class PasswordValid{
	String pass;
	PasswordValid(String pass) {
		this.pass  =pass;
	}
	
	public boolean validator(String password) {
		
		 //length should be b/w 5-12.
		 if (password.length() < 5 || password.length() > 12) {
	            return false;
		 }
		 
		 boolean hasLower = false;
	     boolean hasDigit = false;
		 
		 for (int i = 0; i < password.length(); i++) {
	            char ch = password.charAt(i);
	            
	            //No uppercase
	            if (Character.isUpperCase(ch) == true)
	                return false;   

	            //No special character
	            if (!Character.isLetterOrDigit(ch) == true)
	                return false;   
	            
	            //Yes Lower case
	            if (Character.isLowerCase(ch) == true)
	                hasLower = true;

	            //Yes upper case
	            if (Character.isDigit(ch) == true)
	                hasDigit = true;
	     }
		 
		 //If no lower case or no digit
		 if (!hasLower || !hasDigit) {
	            return false;
		 }
		 
		 //no immediate repeated pattern
	     for (int i = 0; i < password.length() - 1; i++) {
	    	 if (password.charAt(i) == password.charAt(i + 1)) {
	              return false;
	         }
	     }
	     
	    return true; 

	}
}


public class Password_2 {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the password: ");
		 String password = sc.nextLine();
		 
		 PasswordValid pv = new PasswordValid(password);
		 
		 
		 if (pv.validator(password) == true) {
			 System.out.println("Password is ACCEPTABLE");
		 }
		 
		 else {
			 System.out.println("Password is NOT ACCEPTABLE");
		 }
		 sc.close();
	 }
}
