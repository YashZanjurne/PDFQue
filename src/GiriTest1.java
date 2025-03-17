public class GiriTest1 {
    public static void main(String[] args) {
        // Initialize two arrays
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {6, 7, 8, 9, 10};

        // Length of both arrays
        int n = firstArray.length; // Assuming both arrays have the same length

        // Loop through both arrays
        for (int i = 0; i < n; i++) {
            // Print the element from the first array
            System.out.print(firstArray[i] + " ");

            // Print the element from the second array, starting from the end
            System.out.print(secondArray[n - 1 - i] + " ");
        }
    }
}

