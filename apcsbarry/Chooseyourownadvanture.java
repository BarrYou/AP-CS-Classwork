/*Barry You S3C8

	instructor: Daniel
	This is an adventure game version2
 */
package ApcsBarry;
import java.util.Scanner;
public class Chooseyourownadvanture {
	public static void enter(String enter) {
		
		if (enter.equals("yes")==true) {
			System.out.println("You are on your way to school now.");
			System.out.println("After 10 minutes ride, you see an elder walking across the street.");
			System.out.println("You can stop riding and go help her.");
			System.out.println("It needs 10 minutes.");
			System.out.println("You may be late to school.");
			System.out.println("Do you want to help her?");}
		else {
			System.exit(0);
			
		}
		
		
	}
	public static void help(String help) {
		
		if (help.equals("yes")==true) {
			System.out.println("After helping her, you begin riding again.");
			System.out.println("You will be 10 minutes late.");
			System.out.println("......");
			System.out.println("After 10 minutes ride, you see two ways.");
			System.out.println("The first way is a short way to school.");
			System.out.println("But it's narrow and there are many cars.");
			System.out.println("The second way is a long way but safe.");
			System.out.println("You may get to school on time if you choose the first way.");
			System.out.println("Now choose your way (1 or 2): ");}
		else if (help.equals("no")==true){
			System.out.println("You ignore the elder and keep riding.");
			System.out.println("Your bike suddenly breaks.");
			System.out.println("You need to walk to school with your bike.");
			System.out.println("......");
			System.out.println("You get to your school later than 8 am.");
			System.out.println("End.");
				
			}
		
		
	}
	public static void n(int n) {
		
		if (n==1) {
			System.out.println("You are crashed by a car.");
			System.out.println("You are sent to the hospital.");
			System.out.println("End.");
		}
		else {
			System.out.println("You are riding on the long way.");
			System.out.println("A car catches up with you.");
			System.out.println("You see the elder you helped through the window.");
			System.out.println("She wants to drive you to your school.");
			System.out.println("But there may be a traffic jam.");
			System.out.println("Do you want to get on the car? ");
		
	}}
	public static void choice(String choice) {
		
		if (choice.equals("yes")==true) {
		System.out.println("......");
		System.out.println("Fortunatly, there is no traffic jam.");
		System.out.println("You get to school at 7:50, on time.");
		System.out.println("End.");
		}
		else {
			System.out.println("You get to your school later than 8 am.");
			System.out.println("End.");
			
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the way to your school.");
		System.out.println("You are a high school student.");
		System.out.println("on the way, you will face many choices.");
		System.out.println("Carefully make selection.");
		System.out.println("Because you need to get to school at 8 am.");
		System.out.println("It's 7:30 am now.");
		System.out.println("You need half an hour to ride to school.");
		System.out.println("Now begin your school-way adventure.");
		System.out.println("Enter yes to begin: ");

		Scanner input=new Scanner(System.in);
		String enter= input.nextLine();
		Chooseyourownadvanture.enter(enter);
		String help= input.nextLine();
		Chooseyourownadvanture.help(help);
		int n=input.nextInt();
		Chooseyourownadvanture.n(n);
		String choice =input.next();
		Chooseyourownadvanture.choice(choice);
		
		
		
	}
	
}
	
	