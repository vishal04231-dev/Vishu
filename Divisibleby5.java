import java.util.Scanner;
public class Divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean result = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + result);
        sc.close();
    }
}
