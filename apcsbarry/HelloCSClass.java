package ApcsBarry;


import java.util.*;

public class HelloCSClass {

	public static void main(String[] args) {
		
		//Sep.7th, 2017
		
		//String my_Name = "Jeff";
		//System.out.println("My name is " + my_Name);
		
		
		//double radius = 4.5;
		//final double pi = 3.1415926535798;
		//double circ = 2 * pi * radius;
		
		//double area = pi * radius * radius;
		
		//System.out.println("The circumference is "+ circ);
		//System.out.println("The area is "+ area);
		
		//double score = 1.0 - 0.9; 
		//System.out.println("The score is "+ score);
		
		//(3+4x)/5 "- (10*(y-5)(a+b+c))/x + 9(4/x+(9+x)/y);
		
		//int i = 1;
		//int j = 1+ ++i;
		
		//System.out.println("i "+ i);
		//System.out.println("j "+ j);
		
		
		
		
		
		
		//Sep. 12th, 2017
		//byte n = 127; 
		//System.out.println("Before " + n);
		//n++;
		//System.out.println("After " + n);
		
		/*double a = 1.99999999999999999999; 
		System.out.println(a);
		
		char x = (char) 98;//ASCII Number
		System.out.println(x);
		
		boolean lightsOn = (2 > 3 || 3 < 5); 
		if (lightsOn) {
			System.out.println("I can see.");
		}
		else if (1 > 5){
			System.out.println("I can't see.");
		}
		else {
			System.out.println("What the fuck?");
		}*/
		
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		final double pi = 3.1415926535798;
		double area = radius * radius * pi;
		System.out.println("The area is ");
		System.out.print(area);*/
		
		//int i = 1;
		//int a = ++i + i;
		//System.out.println(a);
		
		
		
		
		
		//Sep 14th, 2017
		
		//Math.pow(a, b);
		//Math.PI;
		//Math.abs(a);
		//System.out.println(Math.E);
		
		/*Scanner input = new Scanner(System.in);
		System.out.print("Enter monthly interest rate: ");
		double monthIntRate = input.nextDouble();
		
		System.out.print("Enter numbers of years: ");
		int numYears = input.nextInt();
		
		System.out.print("Enter loan amount: ");
		double numLoan = input.nextDouble();
		
		double monthlyPayment = numLoan * monthIntRate /(1 - (1/Math.pow(1 + monthIntRate, numYears * 12)));
		
		System.out.println("The monthly payment is: " + monthlyPayment);
		System.out.println("The total payment is: " +monthlyPayment * numYears);
		*/
		
		
		
		
		//Sep. 19th, 2017
		
		int a = 7;
		int b = 100;
		
		int temp = b;
		b = a;
		a = temp;
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	
		int x = 1;
		x = 5 + 3*(x++);
		System.out.println(x);
		
	
		x = 5 + 3*(++x);
		System.out.println(x);
		
	}
}
