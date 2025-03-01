//Q1. WAP to create Vector and store 5 values in it and fetch it using Iterator, ListIterator,
//Enumeration and enhance for loop?

import java.util.*;

public class Collection1 {
    public static void main(String[] args){
        Vector<Integer> Vector = new Vector<>();
        Vector.add(10);
        Vector.add(20);
        Vector.add(30);
        Vector.add(40);
        Vector.add(50);
        System.out.println(" Traverse Using Iterator");
        Iterator<Integer>itr=Vector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("\nUsing ListIterator (Forward):");
        ArrayList<Object> vector;
        ListIterator<Integer> listitr = Vector.listIterator();
        while (listitr.hasNext()) {
            System.out.println(listitr.next());
        }
        
        System.out.println("Iterator Using ListIterator");
        System.out.println("Backword Direction");
       // ListIterator<Integer> listitr = Vector.listIterator();
        while (listitr.hasPrevious()){
            System.out.println(listitr.previous());
        }
        // Using Enhanced For Loop
        System.out.println("\nUsing Enhanced For Loop:");
        for (Integer num : Vector) {
            System.out.println(num);
        }
    }
}
