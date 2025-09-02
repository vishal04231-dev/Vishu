public class StaticVsInstance {
    int instanceVar = 10;      
    static int staticVar = 20;  

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        StaticVsInstance obj2 = new StaticVsInstance();

        System.out.println("Initial values:");
        System.out.println("obj1.instanceVar = " + obj1.instanceVar);
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);
        System.out.println("Static variable = " + StaticVsInstance.staticVar);

        obj1.instanceVar = 50;
        StaticVsInstance.staticVar = 100;

        System.out.println("\nAfter changes:");
        System.out.println("obj1.instanceVar = " + obj1.instanceVar);
        System.out.println("obj2.instanceVar = " + obj2.instanceVar);
        System.out.println("Static variable = " + StaticVsInstance.staticVar);
    }
}
