public class LongToFloatCheck {
    public static void main(String[] args) {
        long longValue1 = 123456789L;
        long longValue2 = 123456789123456789L;

        float floatValue1 = longValue1;
        float floatValue2 = longValue2;

        System.out.println("Long value: " + longValue1);
        System.out.println("Stored in float: " + floatValue1);
        System.out.println("Is exact? " + (longValue1 == (long) floatValue1));

        System.out.println("\nLong value: " + longValue2);
        System.out.println("Stored in float: " + floatValue2);
        System.out.println("Is exact? " + (longValue2 == (long) floatValue2));
    }
}
