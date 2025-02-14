/* Q3. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.*/


import java.util.Scanner;

public class FindMax {
    int arr[];
    void setArray(int a[]){
        this.arr=a;
    }
    int getMax(){
        int max=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum number is " +max);
        return max;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the Array values");
        int ar[]={1,2,4,6,8,9};
        FindMax mx = new FindMax();
        mx.setArray(ar);
        mx.getMax();


    }

}
