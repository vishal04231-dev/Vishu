import java.util.*;

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int r, String n, double c) {
        rollNumber = r;
        name = n;
        CGPA = c;
    }

    public void setCGPA(double c) {
        CGPA = c;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {
    String specialization;

    PostgraduateStudent(int r, String n, double c, String sp) {
        super(r, n, c);
        specialization = sp;
    }

    void showDetails() {
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Name: " + name); // protected accessible
        System.out.println("Specialization: " + specialization);
        System.out.println("CGPA: " + getCGPA()); // private via getter
    }
}

public class University {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number:");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name:");
        String n = sc.nextLine();
        System.out.println("Enter CGPA:");
        double c = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter Specialization:");
        String sp = sc.nextLine();

        PostgraduateStudent pg = new PostgraduateStudent(r, n, c, sp);
        pg.showDetails();
    }
}
