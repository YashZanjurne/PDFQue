/*Write program to create array of size 5 and input search key value and search value in array
and if value found return its index and return -1 */
import java.util.*;
public class Que13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]={1,2,5,4,6,9,8,6,};
        int searchkey;
        System.out.println("Enter the value do you want to find");
        searchkey= sc.nextInt();
        int index = -1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==searchkey) {
                index=i;
                break;
            }

        }
        if(index!=-1) {
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("-1 (Element not found)");
        }


    }
}
