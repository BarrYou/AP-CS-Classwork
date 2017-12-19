package ApcsBarry;

public class Rectangle {
	
	private int length;
	private int width; 
	
	public Rectangle(int a, int b) {
		
		this.length = a ;
		this.width = b;
		
		
	}
	
	public int getArea() {
		
		return Math.abs(this.length*this.width);
		
	}
	
	
	public int getPerimeter() {
		
		return Math.abs(2* (this.length + this.width));
		
	}

}
