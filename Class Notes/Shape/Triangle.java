package Shape;

public class Triangle extends Shape{
	private double w1;
	private double w2;
	private double w3;
	public double a;
	public double p;
	public Triangle(double side1, double side2, double side3) {
		w1=side1;
		w2=side2;
		w3=side3;
	}
	public double getArea() {
		double s=(w1+w2+w3)/2;
		a=Math.sqrt(s*(s-w1)*(s-w2)*(s-w3));
		return a;
	}
	public double getPerimeter() {
		p=w1+w2+w3;
		return p;
	}

}
