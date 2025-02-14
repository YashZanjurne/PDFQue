//Write a program to input number and print its table?
import java.util.Scanner;

public class Que4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number do you want to print table");
        int no=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(no*i);
        }


    }
}
