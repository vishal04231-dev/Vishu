import java.util.Scanner;

class PalindromeChecker {
    String text;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        text = sc.nextLine();
    }

    boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    void display() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome.");
        else
            System.out.println(text + " is not a Palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker();
        pc.getInput();
        pc.display();
    }
}
