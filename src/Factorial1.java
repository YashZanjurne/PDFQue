/* Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate factorial of number and return it. */


import java.util.Scanner;

public class Factorial1 {
    int num;

    void setValue(int num){
        this.num=num;

    }
    int getFactorial() {
        int fact = 0;
        for (int i = 0; i < num; i++) {
            fact = num * i;
        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int no=sc.nextInt();
        Factorial f1= new Factorial();
        f1.setValue(no);
        System.out.println("Factorial of a number is ="+ f1.getFactorial());
    }
}
