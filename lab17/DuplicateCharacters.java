package javafullstack;
public class DuplicateCharacters {

    public static void main(String[] args) {
        // Input string to check for duplicate characters
        String place = "kanyakumari";
        
        // Array to count occurrences of each character (assuming ASCII characters)
        int[] charCount = new int[256]; // ASCII has 256 characters
        
        // Count occurrences of each character in the input string
        for (char c : place.toCharArray()) {
            charCount[c]++;
        }

        // Print duplicate characters along with their count
        System.out.println("Duplicate characters in the string:");
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > 1) {
                System.out.println((char) i + ": " + charCount[i]);
            }
        }
    }
}