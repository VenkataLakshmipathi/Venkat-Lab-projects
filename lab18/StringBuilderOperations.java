package javafullstack;
public class StringBuilderOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
      
        // Append " World"
        System.out.println("Before append(\" World\"): " + sb);
        sb.append(" World");
        System.out.println("After append(\" World\"): " + sb);

        // Insert "," at index 5
        System.out.println("Before insert(5, \",\"): " + sb);
        sb.insert(5, ",");
        System.out.println("After insert(5, \",\"): " + sb);

        // Replace substring " World" with " Java" (indexes 6 to 11)
        System.out.println("Before replace(6, 12, \" Java\"): " + sb);
        sb.replace(6, 12, " Java");
        System.out.println("After replace(6, 12, \" Java\"): " + sb);

        // Delete character at index 5 (which is ",")
        System.out.println("Before deleteCharAt(5): " + sb);
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt(5): " + sb);

        // Reverse the StringBuilder
        System.out.println("Before reverse(): " + sb);
        sb.reverse();
        System.out.println("After reverse(): " + sb);
    }
}
