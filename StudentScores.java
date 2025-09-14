package method;

import java.util.Scanner;

public class StudentScores {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 90 + 10);
            scores[i][1] = (int) (Math.random() * 90 + 10);
            scores[i][2] = (int) (Math.random() * 90 + 10);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, avg, percent
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0;
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    public static void display(int[][] scores, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPercent");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] +
                    "\t" + (int) result[i][0] + "\t" + result[i][1] + "\t" + result[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] result = calculateResults(scores);
        display(scores, result);
    }
}
