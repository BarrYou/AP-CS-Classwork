//This program is a game for Rock, Scissors and Paper.
package ApcsBarry;
import java.util.Scanner;
public class RockBarry {
	public static void main(String[] argus) {
		Scanner input=new Scanner(System.in);
		System.out.print("What's your choice?(Rock,Paper or Scissors):");
		String type=input.nextLine();
		int n;
		if (type.equals("Rock")) {
			n=1;
		}else if (type == ("Scissors")) {
			n=2;
		}else {
			n=3;
		}
		int number=(int)(1+3*Math.random());
		if (n==number) {
			System.out.print("It's a tie");
		}else if (n==1) {
			if (number==3) {
				System.out.print("You lose");
			}else if (number==2) {
				System.out.print("You win");
			}
		}else if (n==2) {
			if (number==1) {
				System.out.print("You lose");
			}else if (number==3) {
				System.out.print("You win");
			}
		}else {
			if (number==2) {
				System.out.print("You lose");
			}else if (number==1) {
				System.out.print("You win");
			}
		}
	}
}

		
		
