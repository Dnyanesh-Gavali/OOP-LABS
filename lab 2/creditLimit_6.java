import java.util.Scanner;

class balance {
    private int acc_number;

    public void setaccno(int acc_number) {
        this.acc_number = acc_number;
    }

    int balance_beg;
    int charges;
    int credits;

    int total(int balance_beg, int charges, int credits) {
        return balance_beg + charges - credits;
    }
    
    balance(int balance_beg, int charges, int credits) {
        this.balance_beg = balance_beg;
        this.credits = credits;
        this.charges = charges;
    }
}
public class creditLimit_6 {
    public static void main(String[] args) {
        int credit_score = 50000;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the balance at beginning of month: ");
        int balanceB = sc.nextInt();

        System.out.println("Enter the total charges: ");
        int charges = sc.nextInt();

        System.out.println("Enter the total charges: ");
        int credits = sc.nextInt();

        balance newB = new balance(balanceB, credits, charges);

        System.out.println("Enter the account number");
        int account_no = sc.nextInt();

        newB.setaccno(account_no);

        int total_amt = newB.total(balanceB, charges, credits);

        if (total_amt > credit_score) {
            System.out.println("the credit score with" + account_no+  "has been exceeded");
        }
        else {
            System.out.println("Not exceeded");
        }

        sc.close();
    }
}