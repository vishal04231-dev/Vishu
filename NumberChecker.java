package methods;

import java.util.Scanner;

public class NumberChecker {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int n : numbers) {
            if (isPositive(n)) {
                if (isEven(n)) System.out.println(n + " Positive Even");
                else System.out.println(n + " Positive Odd");
            } else {
                System.out.println(n + " Negative");
            }
        }
        int result = compare(numbers[0], numbers[4]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result == 1) System.out.println("First is Greater");
        else System.out.println("Last is Greater");
    }
}
