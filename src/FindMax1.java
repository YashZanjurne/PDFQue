/* Q3. Write program to create class name as FindMax with two functions
 void setArray(int a[]): this function is used for accept array as parameter
 int getMax(): this function can find the max value from array and return it.*/


import java.util.Scanner;

public class FindMax1 {
    int a[];
    void setArray(int a[]){
        this.a=a;
    }
    int getMax(){
        int max=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,4,7,4,9};
        FindMax1 f1=new FindMax1();
        f1.setArray(arr);
        System.out.println("Maximum number is "+ f1.getMax());
    }
}
