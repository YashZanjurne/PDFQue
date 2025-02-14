//Write program to input number and check number is Armstrong or not?

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int no = sc.nextInt();
        int temp = no;
        int mul = 0;


        while (no > 0) {
            int digit = no % 10;
            no = no / 10;
            mul= (digit * digit * digit) + mul;
        }
        if (mul== temp) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not palindrome");
        }


    }
}
