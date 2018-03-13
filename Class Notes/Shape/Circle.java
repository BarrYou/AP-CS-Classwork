package Shape;

public class Circle extends Shape{
	private double r;
	public double a;
	public double p;
	public Circle(double radius) {
		r=radius;
	}
	public double getArea() {
		a=3.14*r*r;
		return a;
	}
	public double getPerimeter() {
		p=2*3.14*r;
		return p;
	}
	public boolean equals(Circle obj) {
		return (this.r==obj.r);

	}
	
	

}
