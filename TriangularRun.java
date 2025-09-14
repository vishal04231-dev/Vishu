package methods;
import java.util.Scanner;

public class TriangularRun {
    public static int roundsForRun(double a, double b, double c, double distanceMeters) {
        double perimeter = a + b + c;
        return (int) Math.ceil(distanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side a (meters): ");
        double a = sc.nextDouble();
        System.out.print("Enter side b (meters): ");
        double b = sc.nextDouble();
        System.out.print("Enter side c (meters): ");
        double c = sc.nextDouble();
        int rounds = roundsForRun(a, b, c, 5000); // 5 km = 5000 meters
        System.out.println("Number of rounds to complete 5 km: " + rounds);
    }
}
