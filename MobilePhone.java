import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Mobile Phone Details ---");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.getDetails();
        phone.displayDetails();
    }
}
