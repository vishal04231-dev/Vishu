public class NumericOverflowDemo {
    public static void main(String[] args) {
        byte a = 127;
        System.out.println("Original byte value: " + a);

        a++;
        System.out.println("After overflow (a + 1): " + a);

        int maxInt = Integer.MAX_VALUE;
        System.out.println("\nOriginal int value: " + maxInt);

        maxInt++;
        System.out.println("After overflow (maxInt + 1): " + maxInt);
    }
}
