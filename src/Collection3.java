//Q3. WAP to create Vector and store 5 values in it and find max and min value from collection
//without using any inbuilt method?

import java.util.Vector;

public class Collection3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(30);
        vector.add(40);
        vector.add(20);
        vector.add(50);

        int max= vector.get(0);
        int min = vector.get(0);
        for(int i=0;i<vector.size();i++){
            if(max<vector.get(i)){
                max= vector.get(i);
            }
        }
        System.out.println(+max);

        for(int i=0;i<vector.size();i++){
            if(min>vector.get(i)){
                min=vector.get(i);
            }
        }
        System.out.println(+min);
    }
}
