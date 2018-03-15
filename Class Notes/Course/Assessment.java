package Course;

public class Assessment {
	private String assessmentTitle;
	private int maxMarks;
	
	public Assessment(String a, int m) {
		assessmentTitle=a;
		maxMarks=m;
	}
	public void outputAssessmentDetails() {
		System.out.println(assessmentTitle);
		System.out.println(maxMarks);
		
	}
	public String toString() {
		return "assessmentTitle:" + assessmentTitle + "maxMarkes:" + maxMarks;
	}

}
