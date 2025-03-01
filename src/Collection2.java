// Q2. WAP to create Vector and store 5 values in it and arrange all values in ascending order without
//using Collections.sort() method?

import java.util.Vector;

public class Collection2 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(10);
        vector.add(40);
        vector.add(50);
        vector.add(30);

        System.out.println("Before Sorting: " + vector);
        // Sorting the Vector using Selection Sort
        for (int i = 0; i < vector.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vector.size(); j++) {
                if (vector.get(j) < vector.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Swap the minimum element with the current element
            int temp = vector.get(i);
            vector.set(i, vector.get(minIndex));
            vector.set(minIndex, temp);
        }

        System.out.println("After Sorting in Ascending Order: " + vector);
    }
}
