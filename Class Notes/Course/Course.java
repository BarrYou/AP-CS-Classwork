package Course;
import java.util.ArrayList;
public class Course {
	public String courseTitle;
	public int maxStudents;
	public int numberOfLessons;
	public Assessment courseAssessment;
	public ArrayList<Lesson> courseLesson;
	
	public Course(String c, int m, int n, Assessment ca, ArrayList<Lesson> cl) {
		courseTitle=c;
		maxStudents=m;
		numberOfLessons=n;
		courseAssessment=ca;
		courseLesson=cl;
	}
	public void addLesson(String l, int d, boolean r) {
		Lesson a=new Lesson(l, d, r);
		courseLesson.add(a);
	}
	public void addAssessment(String a, int m) {
		Assessment b=new Assessment(a, m);
	}
	public void outputCourseDetails() {
		System.out.println(courseTitle);
		System.out.println(maxStudents);
		System.out.println(numberOfLessons);
		System.out.println(courseAssessment.toString());
		for(int i=0;i<courseLesson.size();i++) {
		System.out.println(courseLesson.get(i).toString());
		}
		
	}
	public static void main(String[] args) {
		Assessment s=new Assessment("assessmentTitle", 100);
		Lesson e=new Lesson("lessonTitle", 100, true); 
		ArrayList<Lesson> l=new ArrayList<Lesson>(); 
		l.add(e);
		
		Course a=new Course("courseTitle", 25, 50, s, l);
		a.outputCourseDetails();
	}

}
