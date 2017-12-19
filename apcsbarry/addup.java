package ApcsBarry;

import java.util.Scanner;

public class addup {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please insert a number.");
		int n=input.nextInt();
		
		System.out.println(addUp(n));
	}
	public static int addUp(int n) {
//		int sum=0;
		if (n>=1) {
//			sum=sum+n;
			int sum=n;
			n--;
			return sum+addUp(n);
			
		}
		else {
			return n;
		}
			
		
		
		
		
	}

}
