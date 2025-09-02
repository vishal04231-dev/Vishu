public class NumberConversion {
    public static void main(String[] args) {
        int num = 25;

        String binary = Integer.toBinaryString(num);
        String hex = Integer.toHexString(num);

        System.out.println("Number: " + num);
        System.out.println("Binary representation: " + binary);
        System.out.println("Hexadecimal representation: " + hex);
    }
}
