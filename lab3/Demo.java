import java.lang.Math;
import java.util.Scanner;

abstract class Figure_2{
    double pi = 3.1420;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
}

class Cone_1 extends Figure_2 {
    double n,s;
    double area, volume;

    Cone_1 (double n, double s){
        this.n = n;
        this.s = s;
    }
    public void calcArea() {
        area = pi * this.n * this.s + pi * this.n * this.n;
    }
    public void calcVol() {
        double height = Math.pow((this.s * this.s - this.n * this.n), 0.5);
        volume = pi * this.n * this.n * height / 3.0;
    }
    public void DispArea() {
        System.out.println("The area of cone is " + area);
    }
    public void Dispvol() {
        System.out.println("The volume of cone is " + volume);
    }

}

class Sphere extends Figure_2 {
    double r;
    double area, volume;

    Sphere(double r){
        this.r = r;
    }
    public void calcArea() {
        area = 4 * pi * this.r * this.r;
    }
    public void calcVol() {
        volume = 4 * pi * this.r * this.r * this.r / 3.0;
    }
    public void DispArea() {
        System.out.println("The area of sphere is " + area);
    }
    public void Dispvol() {
        System.out.println("The volume of sphere is " + volume);
    }
}

class cylinder extends Figure_2 {
    double h, r;
    double area, volume;

    cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }
    public void calcArea() {
        area = 2 * pi * this.r * this.h + 2 * pi * this.r *this.r;
    }
    public void calcVol() {
        volume = pi * this.r * this.r * this.h;
    }
    public void DispArea() {
        System.out.println("The area of cylinder is " + area);
    }
    public void Dispvol() {
        System.out.println("The volume of cylinder is " + volume);
    }

}
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r_cone, s_cone, rSphere, rCylinder, hCylinder;

        System.out.println("Enter dimensions of cone: ");
        System.out.println("Enter the raidus of cone");
        r_cone = sc.nextDouble();

        System.out.println("Enter the slant height of cone");
        s_cone = sc.nextDouble();

        Figure_2 cone = new Cone_1(r_cone, s_cone);

        cone.calcArea();
        cone.calcVol();
        cone.DispArea();
        cone.Dispvol();

        System.out.printf("\n");

        System.out.println("Enter dimensions of Sphere: ");
        System.out.println("Enter the raidus of Sphere");
        rSphere = sc.nextDouble();

        
        Figure_2 sphere = new Sphere(rSphere);
        sphere.calcArea();
        sphere.calcVol();
        sphere.DispArea();
        sphere.Dispvol();
        
        System.out.printf("\n");

        System.out.println("Enter dimensions of Cylinder: ");
        System.out.println("Enter the raidus of Cylinder");
        rCylinder = sc.nextDouble();
        System.out.println("Enter the height of Cylinder");
        hCylinder = sc.nextDouble();


        Figure_2 cylinder = new cylinder(rCylinder, hCylinder);
        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.DispArea();
        cylinder.Dispvol();

        sc.close();
    }   
}
