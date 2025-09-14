package methods;

import java.util.HashSet;

public class OTPGenerator {
    public static int generateOTP() {
        return 100000 + (int)(Math.random() * 900000);
    }

    public static boolean validateUnique() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(generateOTP());
        }
        return set.size() == 10;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) System.out.println(generateOTP());
        System.out.println("All unique? " + validateUnique());
    }
}
