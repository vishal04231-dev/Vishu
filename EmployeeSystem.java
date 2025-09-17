import java.util.*;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int id, String dep, double s) {
        employeeID = id;
        department = dep;
        salary = s;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    String team;

    Manager(int id, String dep, double s, String t) {
        super(id, dep, s);
        team = t;
    }

    void showDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department); // protected accessible
        System.out.println("Salary: " + getSalary()); // private via getter
        System.out.println("Team: " + team);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Department:");
        String dep = sc.nextLine();
        System.out.println("Enter Salary:");
        double s = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Team Name:");
        String t = sc.nextLine();

        Manager m = new Manager(id, dep, s, t);
        m.showDetails();
    }
}
