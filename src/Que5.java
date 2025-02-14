//Write program to input number and check number is perfect or not?


import java.util.Scanner;

public class Que5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int no= sc.nextInt();
        int count=0;


        for(int i=1;i<no;i++){
            if(no%i==0)
            {
                count=count+i;
            }
        }
        System.out.println(count);
        if(count==no)
            System.out.println("perfect number");
        else
        {
            System.out.println("Not perfect number");
        }

    }
}
