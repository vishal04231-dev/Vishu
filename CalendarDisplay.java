package methods;

import java.util.Scanner;

public class CalendarDisplay {
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void displayCalendar(int m, int y) {
        if (m == 2 && isLeapYear(y)) days[m] = 29;

        System.out.println("   " + months[m] + " " + y);
        System.out.println(" S  M Tu  W Th  F  S");

        int d = dayOfWeek(1, m, y);
        for (int i = 0; i < d; i++) System.out.print("   ");

        for (int i = 1; i <= days[m]; i++) {
            System.out.printf("%3d", i);
            if (((i + d) % 7 == 0) || (i == days[m])) System.out.println();
        }
    }

    public static int dayOfWeek(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + (31 * m0) / 12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year (MM YYYY): ");
        int m = sc.nextInt();
        int y = sc.nextInt();
        displayCalendar(m, y);
    }
}
