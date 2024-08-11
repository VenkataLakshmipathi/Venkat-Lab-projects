package javafullstack;
import java.util.HashMap;
import java.util.Map;

public class CubeHashMap {
    public static void main(String[] args) {
        // Create a HashMap to store the key-value pairs
        Map<Integer, Integer> hashMap = new HashMap<>();

        // Populate the HashMap with keys from 1 to 15 and their cubes as values
        for (int key = 1; key <= 15; key++) {
            hashMap.put(key, key * key * key);
        }

        // Print the resulting HashMap
        System.out.println(hashMap); 
    }
}
