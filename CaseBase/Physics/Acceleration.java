package com.CaseBase.Physics;
import java.util.Scanner;

class AvgAcceleration {

    double v0;
    double v1;
    double t;

    AvgAcceleration(double v0, double v1, double t) {
        this.v0 = v0;
        this.v1 = v1;
        this.t = t;
    }

    double calculate() {
        return (v1 - v0) / t;
    }
}

public class Acceleration {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting velocity (v0) in m/s: ");
        double v0 = sc.nextDouble();

        System.out.print("Enter ending velocity (v1) in m/s: ");
        double v1 = sc.nextDouble();

        System.out.print("Enter time (t) in seconds: ");
        double t = sc.nextDouble();

        AvgAcceleration a = new AvgAcceleration(v0, v1, t);
        System.out.println(a.calculate());

        sc.close();
    }
}
