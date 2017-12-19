/*Barry You S3C8
	instructor: Daniel
	This is a battle game
 */
package ApcsBarry;
import java.util.Scanner;
public class BarryGame {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome to 'Barry Land'.");
		System.out.println("Barry is the lord of this world.");
		System.out.println("Everyone should follow and serve to him.");
		System.out.println("Now");
		System.out.println("Begin your advanture now.");
		System.out.println();
		System.out.println("Please enter your english name: ");
		String character= input.nextLine();
		int att=(int) (Math.random()*10+1);
		int def=(int) (Math.random()*10+1);
		int hp=(int) (Math.random()*10+10);
		System.out.println("Here is your properties");
		System.out.println("Your attack is " + att);
		System.out.println("Your defence is " + def);
		System.out.println("Your Hip Point is " + hp);
		System.out.println();
		System.out.println("Now select your first enemy.");
		System.out.println("1.Pig");
		System.out.println("2.Daniel");
		System.out.println("3.Barry");
		System.out.println("Your choice: ");
		int s=input.nextInt();
		for (;s!=1&&s!=2&&s!=3;) {
			System.out.println("You should enter an integer from 1 to 3.");
			s=input.nextInt();
			}
		String m;
		int n=1;
		while (n==1)
			{
			switch (s) {
			case 1:
			m="pig";
			System.out.println(character + " is fighting with a " + m);
			int matt=(int) (Math.random()*20+7.5);
			int mdef=(int) (Math.random()*10+5);
			int mhp=(int) (Math.random()*10+5);
			System.out.println("Here are the pig's properties");
			System.out.println("Its attack is " + matt);
			System.out.println("Its defence is " + mdef);
			System.out.println("Its Hip Point is " + mhp);
			if (hp>matt) {
				System.out.println("You win! Do you want to continue? ");
				String c=input.next();
				for (;c.equals("yes")==false&&c.equals("no")==false;) {
					System.out.println("You should enter 'yes' or 'no'.");
					c=input.next();
				}
					
				if (c.equals("yes")==true) {
					System.out.println("Now select your next enemy.");
					System.out.println("1.Pig");
					System.out.println("2.Daniel");
					System.out.println("3.Barry");
					System.out.println("Your choice: ");
					s=input.nextInt();
					for (;s!=1&&s!=2&&s!=3;) {
						System.out.println("You should enter an integer from 1 to 3.");
						s=input.nextInt();
					}
				}
	
				else {
					System.exit(0);
				}
			}
			else {
				System.out.println(character + " is beaten by the " + m);
				n=n+1;
				
			}break;
		case 2:
			System.out.println("What? You want to fight with your teacher?");
			System.out.println("Good student.");
			m="Daniel";
			System.out.println(character + " is fighting with a " + m);
			matt=(int) (Math.random()*10+100);
			mdef=(int) (Math.random()*10+100);
			mhp=(int) (Math.random()*10+10);
			System.out.println("Here are Daniel's properties");
			System.out.println("Its attack is " + matt);
			System.out.println("Its defence is " + mdef);
			System.out.println("Its Hip Point is " + mhp);
			if (hp>matt) {
				System.out.println("You win! Do you want to continue? ");
				String c=input.next();
				for (;c.equals("yes")==false&&c.equals("no")==false;) {
					System.out.println("You should enter 'yes' or 'no'.");
					c=input.next();
				}
					
				if (c.equals("yes")==true) {
					System.out.println("Now select your next enemy.");
					System.out.println("1.Pig");
					System.out.println("2.Daniel");
					System.out.println("3.Barry");
					System.out.println("Your choice: ");
					s=input.nextInt();
					for (;s!=1&&s!=2&&s!=3;) {
						System.out.println("You should enter an integer from 1 to 3.");
						s=input.nextInt();
					}
				}
				else {
					System.exit(0);
				}
			}
			else {
				System.out.println("You should have expected. How can a sttudent beat a teacher?");
				System.out.println("You are beaten by " + m);
				System.out.println("and you will get F for your grade.");
				System.out.println("Congratulations!");
				n=n+1;
			}break;
		case 3:
			m="Barry";
			System.out.println("How dare you!");
			System.out.println("You are fighting with " + m + "!");
			System.out.println("Your lord!");
			System.out.println("Do you need me to tell you your battle result?");
			System.out.println("You are beaten by " + m + " without uncertainty!");
			System.out.println("Loser, don't try to challenge " + m+ "!");
			n=n+1;
			break;
		}
	}
}
}

