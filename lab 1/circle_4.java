import java.lang.Math;
import java.util.Scanner;
public class circle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();

        int diameter = 2*r;
        double perimeter = 2* Math.PI * r;
        double area = Math.PI * r * r;

        System.out.println("diameter= " + diameter);
        System.out.println("perimeter= " + perimeter);
        System.out.println("area= " + area);
        
        sc.close();
    }
}