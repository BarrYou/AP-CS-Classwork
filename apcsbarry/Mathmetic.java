/*Barry
  Instructor: Daniel
  This program helps you solve mathmetic problems*/


package ApcsBarry;

import java.util.Scanner;

public class Mathmetic {
	public static int factorial(int n) {
		if (n>1) {
			int pro=n;
			n--;
			return pro*factorial(n);
		}
		else {
			return n;
		}
	}
	
	
	
	
	public static int feb(int n) {
		if (n>2) {
			int sum=n;
			n--;
			return sum+feb(n);}
		else if (n==1) {
			return 0;}
		else
			return 1;}
	
	
	
	
	
	public static int zeros(int n) {
		if (n>9) {
			if (n%10==0) {
				int count=zeros(n/10)+1;
				n=n/10;
				return count;
			}
			else {
				int count=zeros(n/10)+0;
				n=n/10;
				return count;
			}
		}
		else 
			return 0;
	}
	
	
	
	public static String engNum(int i) {
		if (i == 0){
		return "";
		
		}
		if (i%10 == 1) {
			return engNum(i/10)+ "One";
		}
		
		else if (i%10 == 2) {
			return engNum(i/10)+ "Two";
		}

		else if (i%10 == 3) {
			return engNum(i/10)+"Three";
		}
		
		else if (i%10 == 4) {
			return engNum(i/10)+ "Four";
		}
		else if (i%10 == 5) {
			return engNum(i/10)+ "Five";
		}
		else if (i%10 == 6) {
			return engNum(i/10)+"Six";
		}
		else if (i%10 == 7) {
			return engNum(i/10)+ "Seven";
		}
		else if (i%10 == 8) {
			return engNum(i/10)+ "Eight";
		}
		else if (i%10 == 9) {
			return engNum(i/10)+ "Nine";
		}
		else if (i%10 == 0) {
			return engNum(i/10)+ "zero";
		}
		
		else {
			return "";
		}
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please insert a number.");
		int n=input.nextInt();
		System.out.println(engNum(n));
	}

}
