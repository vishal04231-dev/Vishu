import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID (integer): ");
        while (!sc.hasNextInt()) {
            System.out.println(" Please enter a number.");
            sc.next();
        }
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary (number): ");
        while (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a valid salary.");
            sc.next();
        }
        salary = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getDetails();
        emp.displayDetails();
    }
}
