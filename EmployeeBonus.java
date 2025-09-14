package method;

public class EmployeeBonus {
    public static int[][] generateEmployeeData(int n) {
        int[][] data = new int[n][2]; // salary, years of service
        for (int i = 0; i < n; i++) {
            data[i][0] = (int) (Math.random() * 90000 + 10000);
            data[i][1] = (int) (Math.random() * 11);
        }
        return data;
    }

    public static double[][] calculateBonus(int[][] data) {
        double[][] result = new double[data.length][3]; // old salary, bonus, new salary
        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = years > 5 ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    public static void display(double[][] result, int[][] data) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;
        System.out.println("Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < result.length; i++) {
            System.out.println((int) result[i][0] + "\t" + data[i][1] + "\t" +
                    (int) result[i][1] + "\t" + (int) result[i][2]);
            totalOld += result[i][0];
            totalBonus += result[i][1];
            totalNew += result[i][2];
        }
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total New Salary: " + totalNew);
    }

    public static void main(String[] args) {
        int[][] employees = generateEmployeeData(10);
        double[][] result = calculateBonus(employees);
        display(result, employees);
    }
}
