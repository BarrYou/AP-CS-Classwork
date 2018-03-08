package Library;

public class Borrower{
	private String b;
	private String e;
	private int i;
	private int l;
	public Borrower(String borrowerName, String emailAddress, int borrowerID) {
		b=borrowerName;
		e=emailAddress;
		i=borrowerID;
		l=0;
	}
	public String getBorrowerName() {
		return b;
	}
	public String getEmailAddress() {
		return e;
	}
	public int getBorrowerID() {
		return i;
	}
	public int getItemsOnLoan() {
		return l;
	}
	public void updateItemsOnLoan() {
		l++;
	}
	public void printDetails() {
		System.out.println(getBorrowerName());
		System.out.println(getEmailAddress());
		System.out.println(getBorrowerID());
		System.out.println(getItemsOnLoan());
		
	}

}
