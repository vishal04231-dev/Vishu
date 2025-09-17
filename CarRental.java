class CarRental {
    String cust;
    String car;
    int days;
    double rate = 1500;

    CarRental(String c, String m, int d) {
        cust = c;
        car = m;
        days = d;
    }

    double total() {
        return days * rate;
    }

    void show() {
        System.out.println("Customer: " + cust);
        System.out.println("Car: " + car);
        System.out.println("Days: " + days);
        System.out.println("Total Cost: " + total());
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Rahul", "Honda City", 5);
        r.show();
    }
}
