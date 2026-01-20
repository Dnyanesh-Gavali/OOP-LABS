import java.util.Scanner;
public class seperate_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a five digit number");
        int a = sc.nextInt();
        int r=0, temp =a;

        while (temp > 0) {
            r = r*10 + temp% 10;
            temp = temp/10;
        }

        while (r > 0) {
            System.out.print(r%10 + "   ");
            r = r/10;
        }

        sc.close();        
    }
}