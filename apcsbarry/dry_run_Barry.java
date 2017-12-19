/*Barry
 * Daniel
 * This is a binary search program
 * 
 */
package ApcsBarry;

import java.util.Arrays;

public class dry_run_Barry {
	public static void main(String[] args) {
		Integer array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println(binarySearch1(array, 5));


}
	public static int binarySearch1(Integer array[], int key) {
		int left = 0, right = array.length-1;
		int mid = -1;
		while (left <= right) {
			mid = left + ((right - left) >> 1);
			if (key == array[mid]) {
				return mid;
			} else if (key < array[mid]) {
				right = mid-1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
	}
