package Course;

public class Lesson {
	private String lessonTitle;
	private int durationMinutes;
	private boolean requiresLab;
	
	public Lesson(String l, int d, boolean r) {
		lessonTitle=l;
		durationMinutes=d;
		requiresLab=r;
	}
	public void outputLessonDetails() {
		System.out.println(lessonTitle);
		System.out.println(durationMinutes);
		System.out.println(requiresLab);
		
	}
	public String toString() {
		return lessonTitle+durationMinutes+requiresLab;
	}

}
