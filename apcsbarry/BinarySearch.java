package ApcsBarry;

public class BinarySearch {
	public static int[] list= {1,4,7,8,10,15};
	
	public static int binsearch(int target, int lowerindex, int upperindex) {
		int middleindex=(upperindex+lowerindex)/2;
		if (target<list[middleindex]) {
			return binsearch(target, lowerindex, middleindex);
		}
		else if (target==list[middleindex]) {
			return middleindex;
		}
		else if (target>list[middleindex]) {
			return binsearch(target, middleindex, upperindex);
		}
		else
			return -1;
		
		
		
	}
	public static void main(String[] args) {
		System.out.println(binsearch(10,0,5));
		
	}
	

}
