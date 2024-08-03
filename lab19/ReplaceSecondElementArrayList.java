package javafullstack;
import java.util.ArrayList;

public class ReplaceSecondElementArrayList {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Add elements to the ArrayList
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        
        // Print the ArrayList before replacement
        System.out.println("ArrayList before replacement: " + arrayList);
        
        // Specify the new element to replace with
        String newElement = "4";
        
        // Replace the second element with the new element
        if (arrayList.size() >= 2) {
            arrayList.set(1, newElement);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }
        
        // Print the ArrayList after replacement
        System.out.println("ArrayList after replacement: " + arrayList);
    }
}