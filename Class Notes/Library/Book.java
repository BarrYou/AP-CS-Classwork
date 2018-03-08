package Library;
import java.util.Date;
public class Book extends LibraryItem{
	private boolean r;
	public Book(String title, String author_artist, int itemID, boolean onLoan, Date dueDate, boolean isRequested) {
		super(title,author_artist,itemID,onLoan,dueDate);
		r=isRequested;
	}
	public void printDetails() {
		super.printDetails();
		System.out.println(r);
	}


}
