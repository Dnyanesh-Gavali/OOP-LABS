package com.CaseBase.Geometry;
import java.util.Scanner;

class Rectangle {

    double x;
    double y;
    double width;
    double height;

    Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

public class twoRectangles {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter r1 center x y width height: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double w1 = sc.nextDouble();
        double h1 = sc.nextDouble();

        System.out.print("Enter r2 center x y width height: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double w2 = sc.nextDouble();
        double h2 = sc.nextDouble();

        Rectangle r1 = new Rectangle(x1, y1, w1, h1);
        Rectangle r2 = new Rectangle(x2, y2, w2, h2);
        
        double r1Left = r1.x - r1.width / 2;
        double r1Right = r1.x + r1.width / 2;
        double r1Top = r1.y + r1.height / 2;
        double r1Bottom = r1.y - r1.height / 2;

        double r2Left = r2.x - r2.width / 2;
        double r2Right = r2.x + r2.width / 2;
        double r2Top = r2.y + r2.height / 2;
        double r2Bottom = r2.y - r2.height / 2;

        if (r2Left >= r1Left && r2Right <= r1Right && r2Top <= r1Top && r2Bottom >= r1Bottom) {
            System.out.println("Rectangle 2 is inside Rectangle 1");
        }
        else if (r2Right >= r1Left && r2Left <= r1Right && r2Top >= r1Bottom && r2Bottom <= r1Top) {
        	System.out.println("Rectangle 2 overlaps Rectangle 1");

        }
        else {
         System.out.println("Rectangle 2 does not overlap Rectangle 1");
        }

        sc.close();
	}
}
	
