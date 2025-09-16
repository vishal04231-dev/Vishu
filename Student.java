import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }

    void display() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.getDetails();
        s.display();
    }
}
