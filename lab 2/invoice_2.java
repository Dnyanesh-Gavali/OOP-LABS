import java.util.Scanner;

class Invoice {
    String part_no;
    String part_desc;
    int quantity;
    double price_item;

    String number() {
        return part_no;
    }

    void setPartNo(String part_no) {
        this.part_no = part_no;
    }

    String description() {
        return part_desc;
    }

    void description(String part_desc) {
        this.part_desc = part_desc;
    }

    int quantity() {
        return quantity;
    }

    void description(int quantity) {
        this.quantity = quantity;
    }

    double price_item() {
        return price_item;
    }

    void price_item(double price_item) {
        this.price_item = price_item;
    }

    Invoice(String part_no, String part_desc, int quantity, double price_item) {
        this.part_no = part_no;
        this.part_desc = part_desc;
        this.quantity = quantity;
        this.price_item = price_item;
    }
    double getInvoiceAmount() {
        if (quantity <= 0) return 0;
        else if (price_item <= 0) return 0;
        else return quantity * price_item;
    }
}

public class invoice_2 {
    static {
        System.out.println("Enter every parameter: ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the part number of item 1");
        String part_no_1 = sc.nextLine();
        System.out.println("Enter the part description of item 1");
        String part_desc_1 = sc.nextLine();
        System.out.println("Enter the number of items 1");
        int quantity_1 = sc.nextInt();
        System.out.println("Enter the price of item 1");
        double price_1 = sc.nextDouble();

        Invoice inv_1 = new Invoice(part_no_1, part_desc_1, quantity_1, price_1);

        double total_price_1 = inv_1.getInvoiceAmount();

        sc.nextLine(); 

        System.out.println("Enter the part number of item 2");
        String part_no_2 = sc.nextLine();
        System.out.println("Enter the part description of item 2");
        String part_desc_2 = sc.nextLine();
        System.out.println("Enter the number of items 2");
        int quantity_2 = sc.nextInt();
        System.out.println("Enter the price of item 2");
        double price_2 = sc.nextDouble();

        Invoice inv_2 = new Invoice(part_no_2, part_desc_2, quantity_2, price_2);

        double total_price_2 = inv_2.getInvoiceAmount();

        System.out.println("--------The Invoice--------");
        System.out.printf("\n");
        System.out.println("--------Item 1--------");
        System.out.println("Part Number = " + part_no_1);
        System.out.println("Part description = " + part_desc_1);
        System.out.println("Quantity = " + quantity_1);
        System.out.println("Price per item = " + price_1);
        System.out.println("Total price for item 1 = " + total_price_1);

        System.out.printf("\n");
        System.out.println("--------Item 2--------");
        System.out.println("Part Number = " + part_no_2);
        System.out.println("Part description = " + part_desc_2);
        System.out.println("Quantity = " + quantity_2);
        System.out.println("Price per item = " + price_2);
        System.out.println("Total price for item 1 = " + total_price_2);

        System.out.println("\n");
        System.out.println("The total price is = " + (total_price_1 + total_price_2));
        sc.close();
    }

}
