import java.util.*;

class Product {
    String productName;
    double price;
    static int totalProducts = 0;

    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product name:");
        String n1 = sc.nextLine();
        System.out.println("Enter price:");
        double p1 = sc.nextDouble();
        sc.nextLine();  

        Product pr1 = new Product(n1, p1);

        System.out.println("Enter product name:");
        String n2 = sc.nextLine();
        System.out.println("Enter price:");
        double p2 = sc.nextDouble();

        Product pr2 = new Product(n2, p2);

        System.out.println("Product 1 ");
        pr1.displayProductDetails();

        System.out.println("Product 2 ");
        pr2.displayProductDetails();

        Product.displayTotalProducts();
    }
}
