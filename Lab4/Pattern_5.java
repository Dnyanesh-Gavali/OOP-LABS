package com.Lab4;

import java.util.Scanner;

class pattern {
	int a;
	int b;
	String p;
	
	//constructor
	pattern(int a, int b, String p) {
		this.a = a;
		this.b = b;
		this.p = p;
	}
		
	int count = 0;
	
	//Method to calculate count of pattern occurred 
	// integer to String => valueOf
	// Pattern check => .contains(p)
	public void countPattern() {
		for(int i =a; i<=b; i++) {
			if (String.valueOf(i).contains(p) == true) {
				count++;
			}
		}
		
		System.out.println("The number of times " + p  + " occurred between " + a + " to " + b + ": " + count);
	}	
	
}

public class Pattern_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting of range: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the end of range: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the Pattern: ");
		sc.nextLine();       
		String pat = sc.nextLine();
		
		
		pattern patternOcc = new pattern(a,b, pat);
		
		patternOcc.countPattern();
		sc.close();
	}
}
