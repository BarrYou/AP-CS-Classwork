package ApcsBarry;
// This program helps you to calculate the average of five integers.

import java.util.Scanner;

public class IntegerAverage {
	public static void main(String[] argus) {
		Scanner input = new Scanner(System.in);
		System.out.print(System.in);
		System.out.print("Enter your first number:");
		int sum = input.nextInt();
		System.out.print("Enter your second number:");
		sum = sum + input.nextInt();
		System.out.print("Enter your third number:");
		sum = sum + input.nextInt();
		System.out.print("Enter your forth number:");
		sum = sum + input.nextInt();
		System.out.print("Enter your fifth number:");
		sum = sum + input.nextInt();
		double average = (double)sum/5.0;
		System.out.println("The average is: " + average);
		
		
		
		
		
		
	}

}
