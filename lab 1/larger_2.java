import java.util.Scanner;
public class larger_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a<b) {
            System.out.println("The second int is bigger: " + b);
        }
        else if (a>b) {
            System.out.println("The first int is bigger: " + a);
        }
        else {
            System.out.println("Both numbers are equal: " + a + "=" + b);
        }
        sc.close();
    }
}