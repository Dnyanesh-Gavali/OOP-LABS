import java.util.Scanner;
public class calculator_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integer: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int product = a * b;
        int diff = a - b;

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Difference = " + diff);

        if (b!=0)
        {
            double divide = (double) a/b;
            System.out.println("Division = " + divide);
        }else {
            System.out.println("The second integer is zero");
        }

        sc.close();
    }
}