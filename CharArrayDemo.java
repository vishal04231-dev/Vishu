package methods.string;

import java.util.Scanner;

class CharArrayDemo {
    public static char[] customToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a1, char[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        char[] customArr = customToCharArray(text);
        char[] builtInArr = text.toCharArray();
        boolean result = compareArrays(customArr, builtInArr);
        System.out.println("Custom char array: " + new String(customArr));
        System.out.println("Built-in char array: " + new String(builtInArr));
        System.out.println("Comparison result: " + result);
        sc.close();
    }
}
