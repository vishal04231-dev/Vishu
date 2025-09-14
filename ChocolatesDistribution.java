package methods;
import java.util.Scanner;

public class ChocolatesDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int quotient = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        if(children == 0) {
            System.out.println("Children cannot be zero.");
        } else {
            int[] result = findRemainderAndQuotient(chocolates, children);
            System.out.println("Each child gets: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
        sc.close();
    }
}
