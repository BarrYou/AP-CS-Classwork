/*Barry You 
  S3C8
  Instructor: Daniel
  This program helps teachers to calculate the average scores of students.
  version 2222222
 */
package ApcsBarry;
import java.util.Scanner;
public class studentscore {
	public static void main(String[] argus) {
		Scanner input=new Scanner(System.in);
		System.out.println("What's the number of students? ");
		int n = input.nextInt();
		System.out.println("What's the number of assignments? ");
		int m = input.nextInt();
		int i = 1;
		int j = 1;
		float sum = 0;
		for (i=1;i<=n;i++) {
			for (j=1;j<=m;j++) {
			System.out.println("What's the score for the assignment? ");
			while(true){
				float s = input.nextFloat();

					if (s<=100) {
				
						sum = sum + s;
						break;
					}
					else {
						System.out.println("invalid");
					}
			}

			}
			System.out.println("The average is "+ (sum/m));
			System.out.println("Student" + (i+1));

			
			}

		}
	}




