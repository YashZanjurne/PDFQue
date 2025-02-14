//Write program to create array of size 10 and find occurrence of every element in array?
import java.util.Scanner;
public class Que14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,3,4,1,1,2,8,9,8};
        int count=1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count=count+1;
                    System.out.println(+a[i]+" "+count);
                }
            }
        }
    }
}
