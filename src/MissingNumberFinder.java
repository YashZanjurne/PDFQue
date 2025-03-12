import java.util.Scanner;

class MissingNumberFinder {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum; // Missing number
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];
        System.out.println("Enter " + size + " numbers (from 0 to " + size + " with one missing):");

        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = missingNumber(nums);
        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}
