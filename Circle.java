class Circle {
    double r;

    Circle() {
        this(1.0);
    }

    Circle(double rad) {
        r = rad;
    }

    void show() {
        System.out.println("Radius: " + r);
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);
        c1.show();
        c2.show();
    }
}
