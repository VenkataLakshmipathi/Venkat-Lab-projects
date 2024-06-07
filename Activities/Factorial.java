package javafullstack;
public class Factorial {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 8; 
        int result = factorial(number);
        System.out.println("Factoraial of " + number + " is: " + result);
    }
}
