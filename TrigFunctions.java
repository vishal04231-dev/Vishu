package methods;
import java.util.Scanner;

public class TrigFunctions {
    public static void calculateTrig(double degrees) {
        double radians = Math.toRadians(degrees);
        System.out.println("Sine: " + Math.sin(radians));
        System.out.println("Cosine: " + Math.cos(radians));
        System.out.println("Tangent: " + Math.tan(radians));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double degrees = sc.nextDouble();
        calculateTrig(degrees);
    }
}
