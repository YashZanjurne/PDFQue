public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 3, 4, 5, 7};
        int target = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) { // Checking all pairs
                if (arr[i] + arr[j] == target) {
                    System.out.println("Indexes: " + i + ", " + j);
                }
            }
        }
    }
}
