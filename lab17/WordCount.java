package javafullstack;
public class WordCount {
    public static void main(String[] args) {
        String input = "Proving them wrong is kinda better revenge ";

        int wordCount = 0;
        boolean insideWord = false; // Flag to track if we're inside a word

        for (char c : input.toCharArray()) {
            if (c == ' ') {
                // If we encounter a space, check if we were inside a word
                if (insideWord) {
                    wordCount++;
                    insideWord = false; // Reset the flag
                }
            } else {
                // If it's not a space, we're inside a word
                insideWord = true;
            }
        }

        // Check if the last word extends to the end of the string
        if (insideWord) {
            wordCount++;
        }

        System.out.println("Number of words in the string: " + wordCount);
    }
}
