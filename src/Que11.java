//Write program to create array of size 5 and find max value?
import java.util.*;
public class Que11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("Enter the Array Values");
        for(int i=0;i<6;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display the Array Values");
        for(int i=0;i<6;i++)
        {
            System.out.print(+a[i]+ " ");
        }
        int max=a[0];
        for(int i=0;i<6;i++){
            if(a[i]>max)
            {
                max=a[i];
            }

        }
        System.out.println();
        System.out.println("Maximum is "+max);

    }
}
