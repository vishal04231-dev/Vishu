import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        movieName = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        seatNumber = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket();
        t.display();
    }
}
