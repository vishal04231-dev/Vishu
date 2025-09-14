package method;

import java.util.Scanner;

public class EuclideanLine {
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double distance = calculateDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
    }
}
