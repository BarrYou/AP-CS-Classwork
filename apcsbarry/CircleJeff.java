package ApcsBarry;


import java.util.Scanner;

public class CircleJeff {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		
		
		final double pi = Math.PI;
		
		double area = Math.pow(radius, 2) * pi;
		double circ = 2 * radius * pi;
		
		System.out.println( );
		
		System.out.println("The area is ");
		System.out.println(area);
		
		System.out.println( );
		
		System.out.println("The circumfence is ");
		System.out.print(circ);
		
	}
}
