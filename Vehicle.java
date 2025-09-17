import java.util.*;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1000;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter owner name:");
        String o = sc.nextLine();
        System.out.println("Enter vehicle type:");
        String t = sc.nextLine();

        Vehicle v1 = new Vehicle(o, t);

        System.out.println("Enter new registration fee:");
        double newFee = sc.nextDouble();
        Vehicle.updateRegistrationFee(newFee);

        v1.displayVehicleDetails();
    }
}
