package Interface;

import java.util.ArrayList;

import java.util.List;

public class IntegerSet implements Mergeable {
	
	private ArrayList<Integer> numList;
	
	public IntegerSet(ArrayList<Integer> b) {
		
		
		this.numList= b;
	}
	
	
	
	public Object merge(Object a) {
		
		List<Integer> result = new ArrayList<Integer>();
		result.addAll(this.numList);
		result.addAll((ArrayList<Integer>) a);
		
		
		return result;
	}
	
	public void printElements() {
		
		System.out.println(this.numList);
		
	}
	
	public int size() {
		
		return this.numList.size();
		
	}
	
	public boolean elementOf(int x) {
		
		for (int i =0; i < this.numList.size(); i++) {
			
			if(this.numList.get(i) == x) {
				
				return true;
			}
			
			
		}
		
		return false;
	}
	
	
}
