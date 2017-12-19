//This program contains the calculation of many functions.
package ApcsBarry;
import java.util.Scanner;
public class mathclassBarry {
	public static void main(String[] argus) {
		Scanner input=new Scanner(System.in);
		//1
		System.out.print("What's the x:");
		double x=input.nextDouble();
		double y1=Math.pow(x, 2)+5*x+7;
		System.out.println("x^2+5x+7=" + y1);
		//2
		double y2=10*Math.pow(x, 3)+5*Math.pow(x, 2)-x+100;
		System.out.println("10x^3+5x^2-x+100=" + y2);
		//3
		double y3=Math.pow(x,1/5)+2*Math.sqrt(x);
		System.out.println("x^1/5+2*x^1/2=" + y3);
		//4
		System.out.println("What's the x-coordinate of A:");
		double x1=input.nextDouble();
		System.out.println("What's the y-coordinate of A:");
		double y4=input.nextDouble();
		System.out.println("What's the x-coordinate of B:");
		double x2=input.nextDouble();
		System.out.println("What's the y-coordinate of B:");
		double y5=input.nextDouble();
		double d=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y4-y5, 2));
		System.out.println("The distance is:"+d);
		//5
		System.out.println("What's the length of A(the right-angle side):");
		double a=input.nextDouble();
		System.out.println("What's the length of B(the right-angle side):");
		double b=input.nextDouble();
		double c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("The hypotaneous is:"+c);
		//6
		System.out.println("What's x:");
		double x3=input.nextDouble();
		System.out.println("What's y:");
		double y6=input.nextDouble();
		double y7=(Math.pow(x3, 2)+Math.pow(y6, 2))/7/x;
		System.out.println("The answer for (x^2+y^x)/7x:"+y7);
		//7
		System.out.println("What's x:");
		double x4=input.nextDouble();
		System.out.println("What's y:");
		double y8=input.nextDouble();
		double y9=Math.sqrt((Math.pow(x4, 2)+3*Math.pow(x4, 3))/x4*2*y8);
		System.out.println("The answer is:"+y9);
		//8
		System.out.println("What's your x:");
		double x5=input.nextDouble();
		double y10=2*x5+Math.sqrt(x/2);
		System.out.println("The answer is:"+y10);

	}

	
	
	
	

}
