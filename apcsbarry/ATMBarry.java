// This is an atm machine program
package ApcsBarry;
import java.util.Scanner;
public class ATMBarry {
	public static void main(String[] argus) {
	Scanner input = new Scanner(System.in);
	double deposit=2500.25;
	System.out.println("Please enter the number for your transaction(1.withdraw cash 2.make a deposit 3.check your balance 4.exit):");
	int choice=input.nextInt();
	if (choice==1) {
		System.out.println("How much money do you want to withdraw:");
		double n=input.nextDouble();
		if (n>deposit) {
			System.out.println("Sorry, you don't have that much money");
		}
		else {
		System.out.println("Now you have " + n + " cash" );
		deposit=deposit-n;
		System.out.println("Your deposit is " + deposit + " now");
		}
	}
	else if (choice==2) {
		System.out.println("How much money do you want to make deposit:");
		double s=input.nextDouble();
		deposit=deposit+s;
		System.out.println("Your deposit is " + deposit + " now");
	}
	else if (choice==3) {
		System.out.println("Your deposit is " + deposit + " now");
	}
	else {
		System.exit(0);
	}
	}
}

		
