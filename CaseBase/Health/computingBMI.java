package com.CaseBase.Health;
import java.util.Scanner;
class BMI {

    double weightPounds;
    double heightInches;

    BMI(double weightPounds, double heightInches) {
        this.weightPounds = weightPounds;
        this.heightInches = heightInches;
    }

    double calculateBMI() {
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;
        return weightKg / (heightMeters * heightMeters);
    }
}
public class computingBMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = sc.nextDouble();

        BMI b = new BMI(weight, height);
        System.out.println("BMI is " + b.calculateBMI());

        sc.close();
    }
}
