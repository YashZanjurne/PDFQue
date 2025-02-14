//Write program to input number using Scanner class and reverse it?
import java.util.*;
public class Que2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number do you want to reverse");
        int no=sc.nextInt();
        int rev =0;
        while(no>0)
    {
        int digit = no%10;
        rev=rev*10+digit;
        no=no/10;

        }
        System.out.println("Reversed number = " +rev);




    }
}
