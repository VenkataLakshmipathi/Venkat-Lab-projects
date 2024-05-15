package javafullstack;

public class Swapandaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10;
	     int b = 20;
	             // Print the swapped values
	        System.out.println("before swapping" );
	        System.out.println("a:"+a);
	        System.out.println("b:"+b);
	        int c=a;
	        a=b;
	        b=c;

	        System.out.println("after swapping");
	        System.out.println(" a: " + a);
	        System.out.println(" b: " +b);

	        // Addition of the swapped numbers
	        int sum = a + b;
	        System.out.println("Sum of a and b: " + sum);
	    }
	}
