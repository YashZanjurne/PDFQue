//Write program to check number is prime or not?

import java.util.Scanner;

public class Que9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int no=sc.nextInt();
        int count=0;
        int i,j;
        for( i=1;i<=no;i++)
        {
            count=0;
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==2){
                System.out.println(+i);
            }
        }


    }
}
