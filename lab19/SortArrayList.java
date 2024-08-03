package javafullstack;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Add elements to the ArrayList
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(3);
        
        // Print the ArrayList before sorting
        System.out.println("ArrayList before sorting: " + arrayList);
        
        // Sort the ArrayList using Collections.sort() method
        Collections.sort(arrayList);
        
        // Print the sorted ArrayList
        System.out.println("ArrayList after sorting: " + arrayList);
    }
}