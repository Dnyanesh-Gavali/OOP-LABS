package FigPackage;
import java.util.Scanner;

abstract class Figure{
    double r, a , v;
    double pi = 3.1420;
    public abstract void calcArea();
    public abstract void calcVol();
    public abstract void DispArea();
    public abstract void Dispvol();
}

class Cone extends Figure {
    double s;
    Cone (double r, double s){
        this.r = r;
        this.s = s;
    }
    public void calcArea() {
        a = pi * r * this.s + pi * r * r;
    }
    public void calcVol() {
        double height = Math.pow((this.s * this.s - r * r), 0.5);
        v = pi * r * r * height / 3.0;
    }
    public void DispArea() {
        System.out.println("The area of cone is " + a);
    }
    public void Dispvol() {
        System.out.println("The volume of cone is " + v);
    }
}

class Sphere extends Figure{

    Sphere(double r){
        this.r = r;
    }
    public void calcArea() {
        a = 4 * pi * r * r;
    }
    public void calcVol() {
        v = 4 * pi * r * r * r / 3.0;
    }
    public void DispArea() {
        System.out.println("The area of sphere is " + a);
    }
    public void Dispvol() {
        System.out.println("The volume of sphere is " + v);
    }
}

class cylinder extends Figure {

    double h;
    cylinder(double r, double h){
        this.r = r;
        this.h = h;
    }
    public void calcArea() {
        a = 2 * pi * r * this.h + 2 * pi * r * r;
    }
    public void calcVol() {
        v = pi * r * r * this.h;
    }
    public void DispArea() {
        System.out.println("The area of cylinder is " + a);
    }
    public void Dispvol() {
        System.out.println("The volume of cylinder is " + v);
    }

}
public class Demo_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r_cone, s_cone, rSphere, rCylinder, hCylinder;

        System.out.println("Enter dimensions of cone: ");
        System.out.println("Enter the raidus of cone");
        r_cone = sc.nextDouble();

        System.out.println("Enter the slant height of cone");
        s_cone = sc.nextDouble();

        Figure cone = new Cone(r_cone, s_cone);

        cone.calcArea();
        cone.calcVol();
        cone.DispArea();
        cone.Dispvol();

        System.out.printf("\n");

        System.out.println("Enter dimensions of Sphere: ");
        System.out.println("Enter the raidus of Sphere");
        rSphere = sc.nextDouble();

        
        Figure sphere = new Sphere(rSphere);
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


        Figure cylinder = new cylinder(rCylinder, hCylinder);
        cylinder.calcArea();
        cylinder.calcVol();
        cylinder.DispArea();
        cylinder.Dispvol();

        sc.close();
    }   
}
