/*Barry You

  s3c8
  teacher:Daniel
  Version 4
  This program helps you to create a pyramid with the final line having the number of stars your entered.
*/
package ApcsBarry;
import java.util.Scanner;
public class version4pyramidstarBarry {
	public static void main(String[] argus) {
		Scanner input=new Scanner(System.in);
		System.out.print("How many stars do you want in the last row?");
		int n=input.nextInt();
		int i;
		if (n%2==1) {
			for (i =1;i<=(n+1)/2;i++){

		   for (int j=1;j<=(n-1)/2-i+1 ;j++ )
		    {
		     System.out.print(" ");
		    }
		   for (int k=1;k<=(i-1)*2+1 ;k++ )
		    {
		    System.out.print("*");
		   }
		  System.out.println();
		  }
		}
		else {
	System.out.println("Please enter again");

	}


}
}




