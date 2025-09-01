public class DuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2, 5, 3, 6, 7};

        System.out.println("Duplicate numbers in array are:");

        // Outer loop
        for (int i = 0; i < arr.length; i++) {
            // Inner loop
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
