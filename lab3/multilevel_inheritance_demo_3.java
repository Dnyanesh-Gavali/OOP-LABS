import java.util.Scanner;

class X {
    int i, j;
    X(int i, int j) {
        this.i = i;
        this.j = j;
    }

    int final_sum(int i, int j) {
        return i+j;
    }
}

class Y extends X{
    Y(int i, int j) {
        super(i, j);
    }

    int findProduct(int i, int j) {
        return i*j;
    }
}

class Z extends Y {
    Z(int i, int j) {
        super(i, j);
    }

    int findDiff(int i, int j) {
        return i-j;
    }
}

public class multilevel_inheritance_demo_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of i: ");;
        int i = sc.nextInt();

        System.out.println("Enter the value of j: ");
        int j = sc.nextInt();

        Z z = new Z(i, j);

        System.out.println("The sum is : " + z.final_sum(i, j));
        System.out.println("The product is : " +z.findProduct(i, j));
        System.out.println("The difference is : " + z.findDiff(i, j));

        sc.close();
    }
}
