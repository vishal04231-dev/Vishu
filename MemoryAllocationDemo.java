public class MemoryAllocationDemo {
    int instanceVar = 10;

    public static void main(String[] args) {
        int a = 5;
        int b = a;

        System.out.println("Primitive Variables:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("After changing b:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        MemoryAllocationDemo obj1 = new MemoryAllocationDemo();
        MemoryAllocationDemo obj2 = obj1;

        System.out.println("\nReference Variables:");
        System.out.println("obj1.instanceVar = " + obj1.instanceVar);
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);

        obj2.instanceVar = 50;
        System.out.println("After changing obj2.instanceVar:");
        System.out.println("obj1.instanceVar = " + obj1.instanceVar);
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);
    }
}
