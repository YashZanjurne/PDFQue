import java.util.*;
public class Que10 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int [] a  = new int[5];
        System.out.println("Enter the Array Values");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display the Array Values");
        for( int i=0;i<5;i++)
        {
            System.out.println(+a[i]);
        }

    }
}
