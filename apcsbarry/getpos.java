package ApcsBarry;
import java.util.Scanner;
public class getpos {
	public static void main(String[] args) {
		System.out.println(getPos());
	}
	public static int getPos() {
		Scanner input=new Scanner(System.in);
		int number;
		System.out.println("Please insert a positive number.");
		number=input.nextInt();
		if (number>0)
			return number;
		else 
			return getPos();
	}
	

}
