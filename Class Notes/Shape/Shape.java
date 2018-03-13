package Shape;

public abstract class Shape {
	public abstract double getArea();
	public abstract double getPerimeter();

	public static void main(String[] args) {
		Circle a=new Circle(11);
		Circle b=new Circle(11);
		a.getArea();
		System.out.println(a.getArea());
		System.out.println(b.equals(a));
	}

}
