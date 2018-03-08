package Library;
import java.util.Date;
public class Library{
	public static void main(String[] args) {
        LibraryItem b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        LibraryItem cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), "Metal");
        cd.printDetails();
    }    


}
