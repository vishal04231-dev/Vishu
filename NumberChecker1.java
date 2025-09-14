package methods;

import java.util.Arrays;

public class NumberChecker1 {
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] getDigits(int number) {
        String s = String.valueOf(number);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static int sumOfSquares(int number) {
        int[] digits = getDigits(number);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int number) {
        int[] digits = get
