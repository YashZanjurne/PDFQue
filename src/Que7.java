//Write a program to input number and check number is palindrome or not?

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no=sc.nextInt();
        int temp;
        temp=no;
        int rev=0;
        while(no>0){
            int digit=no%10;
            rev=rev*10+digit;
            no=no/10;
        }
        System.out.println("Reversed number = " +rev);
        if(rev==temp){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
