package methods.string;
import java.util.Scanner;

public class BMICalculator {
    public static String[] calculate(double weight, double height) {
        double h = height / 100;
        double bmi = weight / (h * h);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.valueOf(weight), String.valueOf(height), String.format("%.2f", bmi), status};
    }

    public static String[][] process(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) result[i] = calculate(data[i][0], data[i][1]);
        return result;
    }

    public static void display(String[][] arr) {
        System.out.println("Weight\tHeight\tBMI\tStatus");
        for (String[] row : arr) System.out.println(row[0] + "\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }
        sc.close();
        String[][] result = process(data);
        display(result);
    }
}
