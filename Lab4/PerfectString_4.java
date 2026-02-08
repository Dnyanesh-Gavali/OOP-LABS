package com.Lab4;
import java.util.Scanner;

class pString {
	String st;
	
	pString(String st) {
		this.st  = st;
	}
	public void character(String st) {
		//converting string to array
		char all[] = st.toCharArray();
				
		//Making an integer array for 26 alphabets
		int alpha[] = new int[26];
				
		//setting every elem to zero
		for (int i=0; i<26; i++) {
			alpha[i] = 0;
		}
				
		//counting
		for(int i =0; i<all.length; i++) {
			alpha[(int) all[i] - 96]++;
		}
		
		int flag=0;
		
		//checking
		for (int i = 0;i<26 && flag==0; i++) {
			if (alpha[i] > 1) {
				flag=1;
			}
		}
		
		//printing
		if (flag==1) {
			System.out.println("The entered string is not perfect");
		}
		else {
			System.out.println("The entered string is perfect");
		}
	}
}
public class PerfectString_4 {
	public static void main(String[] args) {
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//string input
		System.out.println("Enter the string: ");
		String st = sc.next();
				
		//object
		pString perfect  = new pString(st);
		
		perfect.character(st);
		sc.close();
				
	}
}
