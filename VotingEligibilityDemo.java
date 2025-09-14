package methods.string;
import java.util.*;

class VotingEligibilityDemo {
    public static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = 10 + r.nextInt(90);
        }
        return ages;
    }

    public static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else if (ages[i] >= 18) result[i][1] = "true";
            else result[i][1] = "false";
        }
        return result;
    }

    public static void display(String[][] table) {
        System.out.println("Age\tCan Vote?");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] table = checkVoting(ages);
        display(table);
    }
}
