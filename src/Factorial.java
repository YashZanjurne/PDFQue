/* Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate factorial of number and return it. */


import java.util.Scanner;

public class Factorial {
    int a;
    void setValue(int x){
        this.a=x;
    }
    int getFactorial(){
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i; // Multiply fact by i
        }
        System.out.println("Factorial " +fact);
            return fact;
        }
        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Number");
            int number=sc.nextInt();
            Factorial f = new Factorial();
            f.setValue(number);
            f.getFactorial();
        }

}

