import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight(kg) for person " + (i + 1) + ": ");
            double w = sc.nextDouble();
            System.out.print("Enter height(m) for person " + (i + 1) + ": ");
            double h = sc.nextDouble();

            if (w <= 0 || h <= 0) {
                System.out.println("Invalid input, try again!");
                i--;
                continue;
            }

            personData[i][0] = w;
            personData[i][1] = h;
            personData[i][2] = w / (h * h);

            if (personData[i][2] < 18.5) status[i] = "Underweight";
            else if (personData[i][2] < 24.9) status[i] = "Normal";
            else if (personData[i][2] < 29.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "\t" + personData[i][0] + "\t" + personData[i][2] + "\t" + status[i]);
        }

        sc.close();
    }
}
