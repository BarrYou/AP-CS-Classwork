package ApcsBarry;
/*
Name: Barry You
 
 Class: S3C8
 Instructor: Daniel
  This program is aimed to use a recursive method to prints "I miss you" n times and signs off "Love me" .
*/



import java.util.Scanner;

public class Forgetme {

	
		
		public static String imissyou(int n) {
			if (n==0) {
				return "Love me.";
			}
			else {
			
			return  "I Miss You. \n"  + imissyou(n-1);
			
			}
		}

		
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Please enter the number of times that you want to repeat:");
			
			int n = input.nextInt();
			System.out.println(imissyou(n));
			
		}
	}



