/*Barry You
 * Daniel
 * This is a linear search program.
 */
package ApcsBarry;

import java.util.Arrays;

public class linearsearch {
	public static int[] linear_search(int[][]arr, int value) {
		int x=arr.length;
		int y=arr[0].length;
		int[] result= {0,0};
		for(int i=0;i<x;i++) {
			for(int j=0;j<arr[i].length;j++) {
			if (arr[i][j]==value) {
				result[0]=i;
				result[1]=j;
				
			}
			
		}
	}
		return result;
	}
	public static void main(String[] args) {
	int search[][]= {{1,5},{2,3,22,4,7}};
	int result[]=linear_search(search,4);
	System.out.print(Arrays.toString(result));
	}
}
