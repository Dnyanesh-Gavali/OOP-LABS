import java.util.Scanner;
import java.lang.Math;
class Figure {
    double r, a ,v;
    public void dispArea(double a) {
        System.out.println("The are is " + a);
    }
     public void dispVolume(double v) {
        System.out.println("The volume is " + v);
     }
}

class Cone extends Figure {
    double h, s;
    Cone(double r, double s, double h) {
        this.r = r;
        this.s = s;
        this.h = h;
    }
    public void calcArea() {
        dispArea(Math.PI * r * s + Math.PI * r *r);
    }
    public void calcVolume() {
        dispVolume(Math.PI * r *r *h / 3);
    };
}
public class figure_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius, height, slant;
        System.out.println("Enter the radius");
        radius = sc.nextDouble();

        System.out.println("Enter the height");
        height = sc.nextDouble();

        System.out.println("Enter the slant");
        slant = sc.nextDouble();

        Cone conedShape = new Cone(radius, slant, height);

        conedShape.calcArea();
        conedShape.calcVolume();;
        sc.close();
    }
}