import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Code: ");
        itemCode = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Item Details ---");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item i = new Item();
        i.getDetails();
        i.displayDetails();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        System.out.println("Total Cost for " + qty + " items = " + i.totalCost(qty));
    }
}
