package ApcsBarry;

public class coinChange {
	public static void coinChanger(int amount) {
		int h=0;
		int q=0;
		int d=0;
		int n=0;
		int p=0;
		if (amount>50) {
			h=amount/50;
			if (amount-50*h>25) {
				q=amount%50/25;
					if (amount-50*h-25*q>10) {
						d=amount%50%25/10;
						if (amount-50*h-25*q-10*d>5) {
							n=amount%50%25%10/5;
							if (amount-50*h-25*q-10*d-5*n>1) {
								p=amount%50%25%10%5/1;
							}
							else {p=0;}
						
		
						}else {n=0;if (amount-50*h-25*q-10*d-5*n>1) {
							p=amount%50%25%10%5/1;
						}
						else {p=0;}}
							
					}else {d=0;
					if (amount-50*h-25*q-10*d>5) {
						n=amount%50%25%10/5;
						if (amount-50*h-25*q-10*d-5*n>1) {
							p=amount%50%25%10%5/1;
						}
						else {p=0;}
					
	
					}else {n=0;}}
			}else {q=0;
			if (amount-50*h-25*q>10) {
				d=amount%50%25/10;
				if (amount-50*h-25*q-10*d>5) {
					n=amount%50%25%10/5;
					if (amount-50*h-25*q-10*d-5*n>1) {
						p=amount%50%25%10%5/1;
					}
					else {p=0;}
				

				}else {n=0;}
					
			}else {d=0;}}
		}else{h=0;
		if (amount-50*h>25) {
			q=amount%50/25;
				if (amount-50*h-25*q>10) {
					d=amount%50%25/10;
					if (amount-50*h-25*q-10*d>5) {
						n=amount%50%25%10/5;
						if (amount-50*h-25*q-10*d-5*n>1) {
							p=amount%50%25%10%5/1;
						}
						else {p=0;}
					
	
					}else {n=0;}
						
				}else {d=0;}
		}else {q=0;}}
		System.out.println(h+"half dollar");
		System.out.println(q+"quarter");
		System.out.println(d+"dime");
		System.out.println(n+"nickel");
		System.out.println(p+"penny");
		

}
	public static void main(String[] args) {
		coinChange.coinChanger(64);
		
		
		
	}
}
