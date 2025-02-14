public class MoveZeros {
    public static void main(String[] args) {
        int arr[]={1,2,3,0,4,0,5};
       int j=0;
        for(int i=0;i< arr.length;i++){
           //for(int j=1;j< arr.length-1;j++){
                if(arr[i]!= 0){
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    j++;

                }
           // }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(+arr[i]+ " ");
        }
    }
}
