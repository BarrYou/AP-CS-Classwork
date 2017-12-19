package ApcsBarry;

public class reverse {

	public static String reverse(String n) {
		
		if (n.length()==1)
			
			return n.substring(0,1);
		else
			return n.substring(n.length()-1)+reverse(n.substring(0,n.length()-1));
	
	}
	public static int reverse(int n, int d) {
		if (d==1) {
			return n;
			}
		else 
			return (int) ((n%10)*(Math.pow(10.0, (int)d-1.0) + reverse(n/10,d-1)));
	}
	public static void main(String[] args){
		System.out.println(reverse("12345"));
	}
}


