package methods.string;
import java.util.Scanner;

public class TrimSpaces {
    public static int[] findStartEnd(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String mySubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean myCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();
        int[] pos = findStartEnd(text);
        String trimmedManual = mySubstring(text, pos[0], pos[1]);
        String trimmedBuiltIn = text.trim();
        System.out.println("Manual Trimmed: " + trimmedManual);
        System.out.println("Built-in Trimmed: " + trimmedBuiltIn);
        System.out.println("Both Same? " + myCompare(trimmedManual, trimmedBuiltIn));
    }
}
