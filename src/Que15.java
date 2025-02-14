//Write program to create array of size 5 and reverse it?
import java.util.*;
public class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={5,4,3,2,1};
       int left=0;
       int rigtht=a.length-1;
       while(left<rigtht)
       {
           int temp=a[left];
           a[left]=a[rigtht];
           a[rigtht]=temp;
           left++;
           rigtht--;
       }
       for(int i=0;i<a.length;i++)
       {
           System.out.print(" " +a[i]);
       }
    }
}
