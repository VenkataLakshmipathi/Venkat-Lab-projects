package javafullstack;
public class StringTransformation {

    public static void main(String[] args) {
        // Original string to be transformed
        String original = "OpenAI is amazing";
        
        // Transform the original string
        String transformed = transformString(original);
        
        // Print the original and transformed strings
        System.out.println("Original string: " + original);
        System.out.println("Transformed string: " + transformed);
    }

    // Method to transform the input string
    public static String transformString(String str) {
        // Use replace method to transform the string directly
        // Replace "OpenAI is amazing" with "amazing is OpenAI"
        return str.replace("OpenAI is amazing", "amazing is OpenAI");
    }
}