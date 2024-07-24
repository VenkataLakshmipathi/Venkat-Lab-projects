package javafullstack;
import java.util.StringTokenizer;

public class TokenizeString {

    public static void main(String[] args) {
        // Input string containing programming languages separated by commas
        String input = "Java,Python,C++,JavaScript";

        // Create a StringTokenizer with comma (",") as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(input, ",");

        // Iterate through the tokens and print each token
        while (tokenizer.hasMoreTokens()) {
            // Get the next token
            String token = tokenizer.nextToken();
            // Print the token
            System.out.println(token);
        }
    }
}