package ApcsBarry;

import java.util.Scanner;

public class FuturePartnerBarry {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int myAge = 17;
		int myHeight = 120;
		
		System.out.print("Please enter your age: ");
		int age = input.nextInt();
		
		System.out.print("Please enter your height in centimeters: ");
		int height = input.nextInt();
		
		
		System.out.println("Please rate your appearance in a scale form 1 to 10: ");
		int rate = input.nextInt();
		
		System.out.println("Would you feel uncomfortable while talking to me?");
		String answer1 = input.next();
		
			
		Boolean a = answer1.compareToIgnoreCase("No") == 0 &&	
				Math.abs(myAge - age) <= 3 && 
				myHeight - height <= 25 &&
				rate >= 7;
		
		if ( a ) {
			
			System.out.println("You are my ideal partner.");
			
			
			System.out.println("Would you merry me? ");
			String answer = input.next();
			if (answer.compareToIgnoreCase("Yes") == 0) {
				System.out.print("You are my wife.");
			}
			else {
				System.out.println("Have fun.");
			}
			
		}
		else {
			
			System.out.println("Have fun.");
			

			
		}
		
	}
	
}
