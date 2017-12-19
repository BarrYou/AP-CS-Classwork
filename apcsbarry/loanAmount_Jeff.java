package ApcsBarry;


import java.util.Scanner;

public class loanAmount_Jeff {

	public static void main(String[] argus) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter monthly interest rate: ");
		double monthIntRate = input.nextDouble();
		
		System.out.print("Enter numbers of years: ");
		int numYears = input.nextInt();
		
		System.out.print("Enter loan amount: ");
		double numLoan = input.nextDouble();
		
		double monthlyPayment = numLoan * monthIntRate /(1 - (1/Math.pow(1 + monthIntRate, numYears * 12)));
		
		System.out.println("The monthly payment is: " + monthlyPayment);
		System.out.println("The total payment is: " +monthlyPayment * numYears * 12);
		
		
	}
	
}
