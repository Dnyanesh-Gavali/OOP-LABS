package com.Lab4;
import java.lang.String;
import java.util.Scanner;

class count{
	public void character(String st, int k) {
		
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
		
		
		//checking
		for (int i=0; i<26; i++) {
			if (alpha[i] > k) {
				System.out.println((char) (i + 96) + " " + alpha[i]);
			}
		}
	}
}

public class Occurence_3 {
	public static void main(String[] args) {
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//object
		count occurance = new count();
		
		//string input
		System.out.println("Enter the string: ");
		String st = sc.next();
		
		
		//integer input 
		System.out.println("Enter a integer: ");
		int k = sc.nextInt();
		
		//calling
		System.out.println("The letters which exceeds the integer are: ");
		occurance.character(st, k);
		
		sc.close();
	}
}
