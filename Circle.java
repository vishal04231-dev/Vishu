import java.util.Scanner;

class Circle {
    double radius;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        radius = sc.nextDouble();
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("\n--- Circle Details ---");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.getInput();
        c.display();
    }
}
