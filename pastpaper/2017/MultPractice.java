package p2017;

public class MultPractice implements StudyPractice{
	
	private int firstInt;
	private int secInt;
	
	public MultPractice(int a, int b) {
		
		this.firstInt=a;
		this.secInt=b;
		
		
		
	}
	
	public String getProblem() {
		
		
		return this.firstInt + "TIMES" + this.secInt;
		
		
	}
	
	public void nextProblem() {
		
		this.secInt = this.secInt+1;
		
		
		
	}
	
	
	
	

}
