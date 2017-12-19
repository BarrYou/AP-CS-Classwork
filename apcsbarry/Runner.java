package ApcsBarry;
/*Barry You
  Daniel
  Random sized.
*/
import java.util.Random;

public class Runner {
	
	public static void main(String[] args) {
		
		Random rng = new Random();
		
		Circle circle = new Circle(rng.nextInt());
		Circle circle1 = new Circle(rng.nextInt());
		
		System.out.println(circle.getArea());
		System.out.println(circle.getCircumference());
		
		System.out.println(circle1.getArea());
		System.out.println(circle1.getCircumference());
		
			
		
		Rectangle rectangle = new Rectangle(rng.nextInt(),rng.nextInt());
		Rectangle rectangle1 = new Rectangle(rng.nextInt(),rng.nextInt());
		
		
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());	
		
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getPerimeter());	
	}

}

