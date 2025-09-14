package methods;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double si = calculateSimpleInterest(principal, rate, time);

        System.out.println("The Simple Interest is " + si + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);
        
        sc.close();
    }
}
//   int[] arr = new int[n];
//   System.out.println("Enter " + n + " elements:");
//   for (int i = 0; i < n; i++) {
//       arr[i] = sc.nextInt();
//   }
//
//   int largest = arr[0];
//   int smallest = arr[0];
//
//   for (int i = 1; i < arr.length; i++) {
//       if (arr[i] > largest) {
//           largest = arr[i];
//       }
//       if (arr[i] < smallest) {
//           smallest = arr[i];
//       }
//   }
//
//   System.out.println("Largest element: " + largest);
//   System.out.println("Smallest element: " + smallest);
//
//   sc.close();
// }
//}