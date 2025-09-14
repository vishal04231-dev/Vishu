package methods;

import java.util.Arrays;

public class NumberChecker2 {
    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        return arraysEqual(digits, reverseArray(digits));
    }

    public static boolean isDuckNumber(int number) {
        String s = String.valueOf(number);
        return s.contains("0") && !s.startsWith("0");
    }

    public static void main(String[] args) {
        int num = 12321;
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Duck Number? " + isDuckNumber(num));
    }
}
