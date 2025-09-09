import java.util.Scanner;

public class AverageInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        int totalMarks = maths + physics + chemistry;
        double average = totalMarks / 3.0; // use double for decimal result

        System.out.println("Average mark in PCM is " + average);

        sc.close();
    }
}
