import java.util.Scanner;

class mileage {

    double totalMiles = 0;
    double totalGallons = 0;

    void addTrip(double miles, double gallons) {
        double mpg = miles / gallons;
        System.out.println("Miles per gallon for this trip: " + mpg);

        totalMiles += miles;
        totalGallons += gallons;
    }

    public void displayCombinedMPG() {
        if (totalGallons > 0) {
            double combined = totalMiles / totalGallons;
            System.out.println("\nCombined miles per gallon for all trips: " + combined);
        } 
        else {
            System.out.println("No trip data entered.");
        }
    }
}

// Main class
public class Gas_mileage_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        mileage m = new mileage();

        System.out.print("Enter miles driven (or -1 to quit): ");
        double miles = sc.nextDouble();

        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            double gallons = sc.nextDouble();

            m.addTrip(miles, gallons);

            System.out.print("\nEnter miles driven (or -1 to quit): ");
            miles = sc.nextDouble();
        }

        m.displayCombinedMPG();
        sc.close();
    }
}
