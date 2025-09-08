import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("The volume of the cylinder is: " + volume);

        sc.close();
    }
}
