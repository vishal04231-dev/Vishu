public class ConstantDemo {
    static final double PI = 3.14159;

    public static void main(String[] args) {
        double radius = 7.0;
        double area = PI * radius * radius;

        System.out.println("Radius of circle: " + radius);
        System.out.println("Area of circle using constant PI: " + area);
    }
}
