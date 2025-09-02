public class AutoBoxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;

        System.out.println("Autoboxing:");
        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer object: " + obj);

        Integer b = 20;
        int num = b;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper Integer object: " + b);
        System.out.println("Primitive int: " + num);
    }
}
