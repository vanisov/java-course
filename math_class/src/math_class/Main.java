package math_class;
import java.util.Scanner;

public class Main {

	//Program that finds the hypotenuse of a triangle
	public static void main(String[] args) {

		double x;
		double y;
		double z;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter side x: ");
			x = sc.nextDouble();
			System.out.println("Enter side y: ");
			y = sc.nextDouble();
		}
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The hypotenuse is: " + z);
		
	}

}
