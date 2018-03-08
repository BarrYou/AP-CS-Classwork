package Library;

import java.util.Date;

public class CD extends LibraryItem{
	private String g;
	public CD(String title, String author_artist, int itemID, boolean onLoan, Date dueDate, String genre) {
		super(title,author_artist,itemID,onLoan,dueDate);
		g=genre;
	}
	public void printDetails() {
		super.printDetails();
		System.out.println(g);
	}

}
