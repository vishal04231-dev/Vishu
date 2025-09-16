import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        itemName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
    }

    void removeItem() {
        itemName = null;
        price = 0;
        quantity = 0;
        System.out.println("Item removed from cart.");
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem item = new CartItem();
        item.addItem();
        item.displayTotalCost();
        System.out.print("Do you want to remove the item? (yes/no): ");
        String ans = sc.next();
        if (ans.equalsIgnoreCase("yes")) {
            item.removeItem();
        }
    }
}
