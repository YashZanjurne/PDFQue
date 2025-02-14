/* Q4. Write program to create class name as SortArr with two functions
 void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform sorting on array and return sorted array .*/

//import java.util.Scanner;

public class SortArray {
    int a[];
    void setArray(int a[]){
        this.a=a;
    }
    int[] getSortArray(){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Display sorted Array");
        for(int i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        return a;


    }

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int arr[]={5,6,8,4,3,2,1,7};
        SortArray sa = new SortArray();
        sa.setArray(arr);
        sa.getSortArray();

    }
}
