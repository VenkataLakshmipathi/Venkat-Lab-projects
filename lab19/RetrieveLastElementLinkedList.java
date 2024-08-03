package javafullstack;
import java.util.LinkedList;

public class RetrieveLastElementLinkedList {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
       
        // Retrieve the last element (without removing it)
        String lastElement = linkedList.getLast();

        // Print the last element
        System.out.println("Last element in the LinkedList: " + lastElement);
        
        // Print the LinkedList to verify elements are intact
        System.out.println("LinkedList after retrieval: " + linkedList);
    }
}