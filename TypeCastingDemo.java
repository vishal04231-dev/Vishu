public class TypeCastingDemo {
    public static void main(String[] args) {
        int intVal = 100;
        double doubleVal = intVal;

        System.out.println("Implicit Type Casting:");
        System.out.println("int value: " + intVal);
        System.out.println("Converted to double: " + doubleVal);

        double d = 99.99;
        int i = (int) d;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("double value: " + d);
        System.out.println("Converted to int: " + i);
    }
}
