package com.CaseBase.Physics;
import java.util.Scanner;

class Runway {

    double v;
    double a;

    Runway(double v, double a) {
        this.v = v;
        this.a = a;
    }

    double calculateLength() {
        return (v * v) / (2 * a);
    }
}

public class RunwayLength {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter take-off speed (m/s): ");
	        double v = sc.nextDouble();

	        System.out.print("Enter acceleration (m/s^2): ");
	        double a = sc.nextDouble();

	        Runway r = new Runway(v, a);
	        System.out.println("Minimum runway length = " + r.calculateLength());

	        sc.close();
	    }
}
