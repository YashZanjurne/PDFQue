public class RemoveDuplicate {

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {  // Fixed condition
                nums[index] = nums[i];
                index++;
            }
        }
        return index; // Return the count of elements after removal
    }

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();
        int[] nums = {3, 2, 2, 3, 4, 3, 5};
        int val = 3;

        int newLength = rd.removeElement(nums, val);
        System.out.println("New length: " + newLength);

        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
