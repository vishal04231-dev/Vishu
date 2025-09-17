import java.util.*;

class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    Course(String name, int d, double f) {
        courseName = name;
        duration = d;
        fee = f;
    }

    void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
    }

    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter course name:");
        String c1 = sc.nextLine();
        System.out.println("Enter duration in months:");
        int d1 = sc.nextInt();
        System.out.println("Enter fee:");
        double f1 = sc.nextDouble();
        sc.nextLine();

        Course course1 = new Course(c1, d1, f1);

        System.out.println("Enter new institute name (to update):");
        String newInst = sc.nextLine();
        Course.updateInstituteName(newInst);

        course1.displayCourseDetails();
    }
}
