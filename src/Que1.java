//1. Write program to input two values using command line argument and perform its swapping?
import java.util.*;
public class Que1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number");
        int a =sc.nextInt();

        System.out.println("Enter a Second number");
        int b =sc.nextInt();

        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Numbers after Swapping" +a+"  " +b);
    }
}
