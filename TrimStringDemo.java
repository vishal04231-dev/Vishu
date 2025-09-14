package methods.string;
import java.util.Scanner;

class TrimStringDemo {
    public static int[] findTrimPoints(String text) {
        int start = 0, end = text.length() - 1;
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();

        int[] points = findTrimPoints(text);
        String customTrim = customSubstring(text, points[0], points[1]);
        String builtInTrim = text.trim();

        boolean isSame = compareStrings(customTrim, builtInTrim);

        System.out.println("Custom Trim: " + customTrim);
        System.out.println("Built-in Trim: " + builtInTrim);
        System.out.println("Are both same? " + isSame);
        sc.close();
    }
}
