import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.getDetails();
        b.displayDetails();
    }
}
