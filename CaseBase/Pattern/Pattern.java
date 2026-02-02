package com.CaseBase.Pattern;
import java.util.Scanner;
public class Pattern {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) {

	            for (int space = n - i; space > 1; space--) {
	                System.out.print("      ");
	            }

	            for (int j = 0; j <= i; j++) {
	                long val = (long) Math.pow(2, j);
	                System.out.printf("%6d", val);
	            }

	            for (int j = i - 1; j >= 0; j--) {
	                long val = (long) Math.pow(2, j);
	                System.out.printf("%6d", val);
	            }

	            System.out.println();
	        }
	        sc.close();
	    }
}
