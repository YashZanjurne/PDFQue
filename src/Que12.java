//Write program to create array of size and arrange all values in ascending order?
import java.util.*;
public class Que12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,5,6,5,4,9};
        System.out.println("Array of ascending order");
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }

        }
        for(int i=0;i<a.length;i++){
            System.out.print(" " +a[i]);
        }
    }
}
