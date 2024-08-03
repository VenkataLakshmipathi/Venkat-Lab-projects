package javafullstack;
import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListIteration {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Add elements to the LinkedList
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        
        // Create a ListIterator starting from the end of the list
        ListIterator<String> iterator = linkedList.listIterator(linkedList.size());
        
        // Iterate backwards using ListIterator
        System.out.println("Iterating LinkedList in reverse order:");
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            System.out.println(element);
        }
    }
}