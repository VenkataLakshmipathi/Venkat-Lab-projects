package javafullstack;
import java.util.Scanner;
public class PrimeNumberSeries {

	public static void main(String[] args) {
     Scanner scanner = new Scanner (System.in);
     System.out.println("Enter the  number of prime numbers you want:");
     int a = scanner.nextInt();
    
    	 for (int num = 2; num <= a; num++) {
             if (isPrime(num)) {
                 System.out.print(num + " ");
             }
         }

     }
	
     public static boolean isPrime(int a) {
         if (a<= 1) {
             return false;
         }
         for (int i = 2; i * i <= a; i++) {
             if (a % i == 0) {
                 return false;
             }
         }
         return true;
     }
     
     }

	