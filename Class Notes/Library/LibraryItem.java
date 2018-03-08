package Library;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class LibraryItem {
	public String t;
	public String a;
	public int i;
	public boolean o;
	public Date d;
	public int b;

	
	public LibraryItem(String title, String author_artist, int itemID, boolean onLoan, Date dueDate){
		t=title;
		a=author_artist;
		i=itemID;
		o=onLoan;
		d=dueDate;
	}
	
	public String getTitle() {
		return t;
	}
	public String getAuthor_Artist() {
	    return a;
	}
	public int getItemID() {
		return i;
	}
	public boolean getOnLoan() {
		return o;
	}
	public Date getDueDate() {
		return d;
	}
	private static Date addDays(Date date, int days) {
		GregorianCalendar cal=new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE,  days);
		return cal.getTime();
	}
	
	
	public void borrowing() {
		o=true;
		Date today=new Date();
		d=addDays(today, 14);

	}
	public void returning() {
		this.o=false;
	}
	public void printDetails() {
		System.out.println(t);
		System.out.println(a);
		System.out.println(i);
		System.out.println(o);
		System.out.println(d);
	}

}

