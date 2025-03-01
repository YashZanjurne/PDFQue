public class RemoveTriplets {
    public static void main(String[] args) {

        int nums[]={1,2,2,2,3,3,4,4,4,5};
        int n=nums.length;
        int index=0;
        int  count=1;
        nums[index++] = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1; // Reset count when a new number appears
            }

            // Allow at most 2 occurrences
            if (count <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }
        System.out.println();
        for(int i=0;i< index;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
