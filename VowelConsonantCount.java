package methods.string;
import java.util.Scanner;

class VowelConsonantCount {
    public static boolean isLetter(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isVowel(char ch) {
        ch = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (isLetter(ch)) {
                if (isVowel(ch)) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] count = countVowelsConsonants(text);
        System.out.println("Vowels: " + count[0]);
        System.out.println("Consonants: " + count[1]);
    }
}
