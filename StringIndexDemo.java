package methods.string;

import java.util.Scanner;

class StringIndexDemo {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length() + 1));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();
        handleException(text);
        sc.close();
    }
}
