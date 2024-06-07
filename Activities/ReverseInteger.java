package javafullstack;
public class ReverseInteger {
    public static void main(String[] args) {
        int number = 2824;
        int reversedNumber = reverseInteger(number);
        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reversedNumber);
    }
    public static int reverseInteger(int number) {
        int reversedNumber = 0;
        for (; number != 0; number /= 10) {
            reversedNumber = reversedNumber * 10 + number % 10;
        }
        return reversedNumber;
    }
}
