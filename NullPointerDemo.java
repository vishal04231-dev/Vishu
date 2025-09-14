package methods.string;
import java.util.Scanner;

class NullPointerDemo {
    public static void generateNullPointer() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNullPointer() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException");
        }
    }

    public static void main(String[] args) {
        try {
            generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Generated NullPointerException");
        }
        handleNullPointer();
    }
}
