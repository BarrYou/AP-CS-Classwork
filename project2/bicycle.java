package ApcsBarry;
import java.util.*;
public class bicycle {
	private int numLevel;
	private int bWeight;
	private String bColor;
	private int bHeight;
	private String bBrand;
	private double wheelRadius;

	public bicycle(){
	numLevel=1;
	bWeight=10;
	bColor="blue";
	bHeight=1;
	bBrand="Giant";
	wheelRadius=0.15;
	}
	
	public bicycle(int a, int b, String c, int d, String e, double f) {
		numLevel=a;
		bWeight=b;
		bColor=c;
		bHeight=d;
		bBrand=e;
		wheelRadius=f;
	}
	
	public int changeSpeedlevel(int lv) {

		numLevel=numLevel+lv;
		return numLevel;	
	}
	
	public int changeHeight(int h) {
		bHeight=bHeight+h;
		return bHeight;
	}
	public int getspeedLevel() {
		return numLevel;
	}
	
	public void setwheelRadius(double r) {
		wheelRadius=r;
	}
	public static void main(String[] args) {
		bicycle a = new bicycle(1,3,"red",2,"Giant",2);
		a.setwheelRadius(1);
		
				
	}

}
