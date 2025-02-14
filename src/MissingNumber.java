public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6};
        int flag=0;
        for(int i=0;i<arr.length;i++){
            flag=0;
            for(int j=0;j< arr.length;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }

        if(flag==0) {
            System.out.println(+i);
        }
        }
    }
}
