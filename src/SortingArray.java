public class SortingArray {
    public static void main(String[] args) {
        int arr[]=new int []{5,4,6,8,3,2,1,9};
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
            if(arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }


            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
