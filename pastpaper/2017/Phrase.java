package p2017;

public class Phrase {
	
	private String currentPhrase; 
	
	public Phrase(String p) {
		
		this.currentPhrase = p;
		
	}
	
	public int findNthOccurrence(String str, int n) {
		
		
		//implementation not shown
		return 0;
	}
	
	public void replaceNthOccurrence(String str, int n, String repl) {
		
		String temp = this.currentPhrase;
		
		int i = findNthOccurrence(str, n);
		while (i > 0) {
		this.currentPhrase = temp.substring(0, i) + 
				repl + temp.substring(i+str.length(),temp.length());
		}
	}
	
	public int findLastOccurrence(String str) {
		
		int max = 0;
		
		for (int i = 0; i< this.currentPhrase.length(); i++) {
			
			if (findNthOccurrence(str,i) > max) {
				
				max = findNthOccurrence(str,i);
				
			}
			
		}
		
		
		return max;
	}
	
	public String toString() {
		
		return currentPhrase;
	}

}
