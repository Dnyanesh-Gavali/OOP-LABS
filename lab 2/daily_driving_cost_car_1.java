import java.util.Scanner;

class DailyCost {
    int total_miles;
    int cost_gallon;
    int avg_fees;
    int tolls;
    DailyCost(int total_miles, int cost_gallon, int avg_fees, int tolls) {
        this.total_miles = total_miles;
        this.tolls = tolls;
        this.avg_fees = avg_fees;
        this.cost_gallon = cost_gallon;
    }

    double TotalCost() {
        return (total_miles * cost_gallon / 20.0f) + avg_fees + tolls;
    }
}

public class daily_driving_cost_car_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the parameters: ");

        System.out.printf("Enter the miles_day: ");
        int miles_day = sc.nextInt();

        System.out.printf("Enter the cost of gallon per day: ");
        int cost_gallon_day = sc.nextInt();

        System.out.printf("Enter the cost of average fees: ");
        int avg_fees_day = sc.nextInt();

        System.out.printf("Enter the cost of tolls per day: ");
        int tolls_day = sc.nextInt();

        DailyCost cost = new DailyCost(miles_day, cost_gallon_day, avg_fees_day, tolls_day);

        double total_cost = cost.TotalCost();

        System.out.println("The total cost is " + total_cost + "Rs.");
        sc.close();
    }
}
