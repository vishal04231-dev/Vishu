package methods.string;
import java.util.Scanner;

class NumberFormatDemo {
    public static void generateNumberFormat(String text) {
        int number = Integer.parseInt(text); 
        System.out.println(number);
    }

    public static void handleNumberFormat(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        try {
            generateNumberFormat(text);
        } catch (NumberFormatException e) {
            System.out.println("Generated NumberFormatException");
        }

        handleNumberFormat(text);
    }
}
