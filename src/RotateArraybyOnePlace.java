import java.util.Arrays;

public class RotateArraybyOnePlace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int temp=arr[0];
        for(int i=1;i< arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;

        System.out.print("Display Rotated Array");
        for(int i=0;i< arr.length;i++){
            System.out.print(" " +arr[i]);
        }
    }
}

