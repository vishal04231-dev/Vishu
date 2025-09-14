package methods.string;
import java.util.Scanner;

class StringLengthDemo {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        int userDefinedLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("User Defined Length: " + userDefinedLength);
        System.out.println("Built-in Length: " + builtInLength);
    }
}
