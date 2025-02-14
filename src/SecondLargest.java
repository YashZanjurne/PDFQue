import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,3,4,2,4,6,7,};
        System.out.println("Sorted Array");
        for(int i=0;i<a.length;i++){
            for(int j=0;j< a.length;j++){
                if(a[j]>a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]= temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" " +a[i]);
        }
        int largest = a[a.length-1];
        int slargest=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]>slargest && a[i]!=largest)
                slargest=a[i];
        }
        System.out.println("Second largest " +slargest);
    }
}
