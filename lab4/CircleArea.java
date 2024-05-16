package javafullstack;
import java.util.Scanner;
public class CircleArea {

	public static void main(String[] args) {
	
Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to find the area of a circle? (YES/NO): ");
            String input = scanner.nextLine().toUpperCase();
            
           
            if (!input.equals("YES")) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
             scanner.nextLine();
        }
        
        
        scanner.close();
    }
}
