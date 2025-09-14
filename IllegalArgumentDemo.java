package methods.string;
import java.util.Scanner;

class IllegalArgumentDemo {
    public static void generateIllegalArgument(String text) {
        System.out.println(text.substring(5, 2)); // start > end
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Handled IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateIllegalArgument(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Generated IllegalArgumentException");
        }

        handleIllegalArgument(text);
    }
}
