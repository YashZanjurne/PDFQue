public class Conse {
    public static void main(String[] args) {
        int arr[] = new int[]{1,1,0,0,1,1,1,2,3,0};
        int max=1;
        int count=1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]==arr[i-1]){
                count++;

            }
            else{
                count=1;

            }
            if(count>max){
                max=count;
            }


        }
        System.out.println(+max);

    }
}
