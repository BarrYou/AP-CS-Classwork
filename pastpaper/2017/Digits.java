package p2017;

import java.util.ArrayList;

public class Digits {
	
	private ArrayList<Integer> digitList;
	
	public Digits(int num) {
		
		while(num > 0) {
		
		digitList.add(0, num%10);
		
		num = num/10;
		}
	}
	
	public boolean isStrictlyIncreasing() {
		
		for (int i = 0; i < this.digitList.size()-1; i++) {
			
			if (this.digitList.get(i) > this.digitList.get(i+1)) {
				
				return false;
				
			}
			
		
		}
		
		return true;
		
		
		
		
	}
	

}
