/* •	Q1. Write a program to create class name as Cube with two methods
void setValue(int x): this function accept number as parameter
int getCube(): this function can calculate cube of number and return it.*/


import java.util.Scanner;

public class Cube1 {
    int x;
    void setValue(int x){
        this .x =x;
    }
    int getCube(){
        int result = (x*x*x);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
       int y=sc.nextInt();
        Cube1 c1 = new Cube1();
        c1.setValue(y);
        System.out.println("Cube of number is " + c1.getCube());
    }

}
