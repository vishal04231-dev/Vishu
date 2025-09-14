package methods.string;
import java.util.Scanner;

class ArrayIndexOutOfBoundsDemo {
    public static void generateArrayIndexOutOfBounds(String[] names) {
        System.out.println(names[names.length]); // invalid index
    }

    public static void handleArrayIndexOutOfBounds(String[] names) {
        try {
            System.out.println(names[names.length]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Handled RuntimeException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        try {
            generateArrayIndexOutOfBounds(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Generated ArrayIndexOutOfBoundsException");
        }

        handleArrayIndexOutOfBounds(names);
    }
}
