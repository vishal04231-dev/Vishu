public class TypePromotionDemo {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        int result1 = a + b;
        System.out.println("Result of byte + byte (promoted to int): " + result1);

        char c = 'A';
        int result2 = a + c;
        System.out.println("Result of byte + char (promoted to int): " + result2);

        int x = 1000;
        long y = 2000;
        long result3 = x + y;
        System.out.println("Result of int + long (promoted to long): " + result3);

        float f = 3.5f;
        double d = 2.5;
        double result4 = f + d;
        System.out.println("Result of float + double (promoted to double): " + result4);
    }
}
