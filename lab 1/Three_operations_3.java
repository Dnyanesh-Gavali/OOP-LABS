import java.util.Scanner;

interface input {
    public void operation(int a, int b, int c);
}
class opp implements input {
    public void operation(int a, int b, int c) {
        System.out.println("sum= " + (a+b+c));
        System.out.println("average= " + (a+b+c)/3.0);
        System.out.println("product= " + a*c*b);
        
        if (a>=b && a>=c) {
            System.out.println("largest= " + a);
        }
        else if (b>=a && b>=c) {
            System.out.println("largest= " + b);
        }
        else {
            System.out.println("largest= " + c);
        }

        if (a <= b && a <= c) {
            System.out.println("smallest= " +a);
        }
        else if (b <= a && b <= c) {
            System.out.println("smallest= " +b);
        }
        else {
            System.out.println("smallest= " +c);
        }

    }
    
}

public class Three_operations_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        opp operations = new opp();
        operations.operation(a, b, c);

        sc.close();
    }
}


