/* S3C8 Barry You
	Instructor: Daniel
	This is program which helps you order five numbers and find the median.
	
	*/

package ApcsBarry;

import java.util.Scanner;
 
public class median {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1st number");
        int a=sc.nextInt();
        System.out.println("2nd number");
        int b=sc.nextInt();
        System.out.println("3rd number");
        int c=sc.nextInt();
        System.out.println("4th number");
        int d=sc.nextInt();
        System.out.println("5th number");
        int e=sc.nextInt();
        int []array={a,b,c,d,e};
        for(int i=0;i<(array.length-1);i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]>array[j])
                {
                    int zhong=array[i];
                    array[i]=array[j];
                    array[j]=zhong;
                }
            }
        }
        System.out.println("Order£º"+array[0]+" "+array[1]+" "+array[2]+" "+array[3]+" "+array[4]);
        System.out.println("median is "+array[2]);
    }
}
 
