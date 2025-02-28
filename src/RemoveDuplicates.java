public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,4,5,5};
        int arr2[] = new int[arr1.length]; // Initialize with correct size
        int j=0;
        for(int i=0;i< arr1.length-1;i++){
            if(arr1[i]!=arr1[i+1]){
                arr2[j++]=arr1[i];
            }
        }
        arr2[j++] = arr1[arr1.length - 1];

        System.out.print("Unique elements: ");
        for (int i = 0; i < j; i++) {

            System.out.print(arr2[i] + " ");
        }
        System.out.println();
      int count=0;
        for(int i=0;i<j;i++){
            count++;
        }
        System.out.println(+count);

    }
}
