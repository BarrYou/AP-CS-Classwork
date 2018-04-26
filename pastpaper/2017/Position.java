package p2017;

public class Position {
	
	public Position (int r, int c) {
		
		
	}
	
	public static Position findPosition(int num, int [][] intArr) {
		
		
		for (int r = 0; r < intArr.length ; r++) {
			
			for (int c = 0; c < intArr[c].length; c++) {
				
				if (intArr[r][c] == num) {
					
					return new Position(r,c);
					
				}
				
			}
			
		}
		
		return null;
	}

	
	public static Position[][] getSuccessorArray(int[][] intArr){
		
		Position[][] result = new Position[intArr.length][intArr[0].length];
		
		for (int r = 0; r < intArr.length ; r++) {
			
			for (int c = 0; c < intArr[c].length; c++) {
				
				result[r][c]= findPosition(intArr[r][c]+1, intArr);
			}
		}
		
		return result; 
		
	}
}
