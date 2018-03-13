package Shape;

public class Rectangle extends Shape{
	private double w;
	private double l;
	public double a;
	public double p;
	public Rectangle(double width, double length) {
		w=width;
		l=length;
	}
	public double getArea() {
		a=w*l;
		return a;
	}
	public double getPerimeter() {
		p=2*(w+l);
		return p;
	}
}
