package com.CaseBase.Science;
import java.util.Scanner;
class AverageEnergy {

    double m;
    double t1;
    double t2;

     AverageEnergy(double m, double t1, double t2) {
        this.m = m;
        this.t1 = t1;
        this.t2 = t2;
    }

    double calculateEnergy() {
        return m * (t2 - t1) * 4184;
    }
}
public class CalculateEnergy {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of water in kilograms: ");
        double m = sc.nextDouble();

        System.out.print("Enter initial temperature: ");
        double t1 = sc.nextDouble();

        System.out.print("Enter final temperature: ");
        double t2 = sc.nextDouble();

        AverageEnergy e = new AverageEnergy(m, t1, t2);
        System.out.println("Energy needed = " + e.calculateEnergy());

        sc.close();
    }
}
