package methods.string;
import java.util.Scanner;

public class FrequencyNested {
    public static String[][] frequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                freq[i] = 1;
                for (int j = i + 1; j < len; j++) {
                    if (chars[i] == chars[j]) {
                        freq[i]++;
                        chars[j] = '0';
                    }
                }
            }
        }
        int count = 0;
        for (int f : freq) if (f != 0) count++;
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (freq[i] != 0) {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
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
