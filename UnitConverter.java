package methods;
import java.util.Scanner;

public class UnitConverter {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("10 yards = " + convertYardsToFeet(10) + " feet");
        System.out.println("30 feet = " + convertFeetToYards(30) + " yards");
        System.out.println("5 meters = " + convertMetersToInches(5) + " inches");
        System.out.println("100 inches = " + convertInchesToMeters(100) + " meters");
        System.out.println("10 inches = " + convertInchesToCentimeters(10) + " cm");
        System.out.println("98 F = " + convertFarhenheitToCelsius(98) + " C");
        System.out.println("37 C = " + convertCelsiusToFarhenheit(37) + " F");
        System.out.println("150 pounds = " + convertPoundsToKilograms(150) + " kg");
        System.out.println("70 kg = " + convertKilogramsToPounds(70) + " pounds");
        System.out.println("10 gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("20 liters = " + convertLitersToGallons(20) + " gallons");
        sc.close();
    }
}
