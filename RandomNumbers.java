package methods;

public class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (1000 + Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        double[] result = findAverageMinMax(arr);
        System.out.println("Numbers:");
        for (int n : arr) System.out.print(n + " ");
        System.out.println("\nAverage: " + result[0]);
        System.out.println("Min: " + result[1]);
        System.out.println("Max: " + result[2]);
    }
}
