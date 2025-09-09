import java.util.Scanner;
public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();

        boolean firstLargest = (n1 >= n2 && n1 >= n3);
        boolean secondLargest = (n2 >= n1 && n2 >= n3);
        boolean thirdLargest = (n3 >= n1 && n3 >= n2);

        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);
        sc.close();
    }
}
