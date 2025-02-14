// Write program to input number and check number is duck or not?

import java.util.Scanner;

public class Que6 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Check");
        int no=sc.nextInt();
        int a;
        while(no>0){
            a=no%10;
            no=no/10;
            if(a==0){
                System.out.println("Duck number");
            }


           // break;


        }
        System.out.println("Not Duck");

    }
}
