package methods.string;
import java.util.Scanner;

class StringIndexOutOfBoundsDemo {
    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println(text.charAt(text.length())); // beyond range
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println(text.charAt(text.length())); // beyond range
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Handled StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateStringIndexOutOfBounds(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Generated StringIndexOutOfBoundsException");
        }

        handleStringIndexOutOfBounds(text);
    }
}
