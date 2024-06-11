package javafullstack;
import java.util.Scanner;
abstract class Shape {
	public abstract double calculation();
	}

	class Rectanglee extends Shape {
	    public double length;
	    public double  breadth;

	    public Rectanglee(double length, double breadth) {
	        this.length = length;
	        this. breadth =  breadth;
	    }

	    
	    public double calculation() {
	        return length *  breadth;
	    }
	}

	class Circlee extends Shape {
		public double radius;
		public final double PI = 3.14159; 

	    public Circlee(double radius) {
	        this.radius = radius;
	    }

	    
	    public double calculation() {
	        return PI * radius * radius;
	    }
	}
	public class ShapeCircleRectangle{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Rectanglee rectangle = new Rectanglee (length,breadth);
        System.out.println("Area of Rectangle: " + rectangle.calculation());

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Circlee circle = new Circlee(radius);
        System.out.println("Area of Circle: " + circle.calculation());
    }
}
