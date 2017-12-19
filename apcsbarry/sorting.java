/*Barry
 * Daniel
 * This is a selection sorting program
 */
package ApcsBarry;

import java.util.Arrays;

public class sorting {
	public static int[] selectionsorting(int[]arr) {
	int i;
	int j;
	int n=arr.length;
	for (j = 0; j < n-1; j++) {
		int iMin = j;
		for (i = j+1; i < n; i++) {
			 if (arr[i] < arr[iMin]) {
				 int k;
					k=arr[i];
					arr[i]=arr[iMin];
					arr[iMin]=k;
			 }

		}
		
	}
	return arr;

}
	public static int[] insertionsorting(int[]arr) {
		for (int i = 1; i < arr.length; i++)
        {
            if (arr[i - 1] > arr[i])
            {
                int k = arr[i];
                int j = i;
                while (j > 0 && arr[j - 1] > k)
                {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = k;
            }
        }
		return arr;
        }
	
	


	public static void main(String[] args) {
		
		int search[]= {45,61,23,5,4,54,23,465,23,2};

		insertionsorting(search);
	}
}
