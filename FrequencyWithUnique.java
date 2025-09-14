package methods.string;
import java.util.Scanner;

public class FrequencyWithUnique {
    public static char[] findUnique(String text) {
        char[] temp = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[index++] = c;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static String[][] frequency(String text) {
        char[] unique = findUnique(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) if (text.charAt(j) == unique[i]) count++;
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] result = frequency(text);
        for (String[] row : result) System.out.println(row[0] + " -> " + row[1]);
        sc.close();
    }
}
