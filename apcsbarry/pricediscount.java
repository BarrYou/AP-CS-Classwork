package ApcsBarry;

public class pricediscount {
	public static double cost(double price, double discount) {
		double cost=price*(1-discount);
		return cost;
	}
	public static double cost(double price, int discount) {
		double cost=price*(1-discount/100.0);
		return cost;
	}
	public static void main(String[] args) {

		System.out.println(pricediscount.cost(50.0, 4));
	}
	
	
	}


