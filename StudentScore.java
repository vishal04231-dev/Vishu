package methods.string;
import java.util.*;

class StudentScorecardDemo {
    public static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 30 + r.nextInt(70);
            scores[i][1] = 30 + r.nextInt(70);
            scores[i][2] = 30 + r.nextInt(70);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100.0;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double perc = results[i][2];
            if (perc >= 90) grades[i] = "A+";
            else if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B+";
            else if (perc >= 60) grades[i] = "B";
            else if (perc >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void display(int[][] scores, double[][] results, String[] grades) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" + 
                               (int)results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t" + grades[i]);
        }
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);
        display(scores, results, grades);
    }
}
