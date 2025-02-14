/* Q4. Write program to create class name as SortArr1 with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array.*/


class SortArr1 {
    int a[];

    // Method to accept an array
    void setArray(int a[]) {
        this.a = a;
    }

    // Method to sort the array manually (Bubble Sort)
    int[] getSortArray() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {  // Swap if current element is greater than next
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 9, 2, 4, 7}; // Input array

        SortArr1 sa = new SortArr1();
        sa.setArray(arr);
        int sortedArray[] = sa.getSortArray(); // Get sorted array

        System.out.print("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " "); // Display using for loop
        }
    }
}


