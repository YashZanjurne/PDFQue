//Q5. WAP to create LinkedList and store 10 values in it and search particular value from LinkedList?


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection4 {
    public static void main(String[] args) {
        List<Integer>list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int search = 30;
        for(int i=0;i< list.size();i++){
            if(search== list.get(i)){
                System.out.println("Element Found");
            }
        }


    }
}
