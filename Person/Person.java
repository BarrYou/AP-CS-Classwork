package ApcsBarry;

public class Person {
		//instant variable
		private int age;
		private String language;
		private String gender;
		//Constructor 
		public Person(String x, int i, String g) {
			
			this.language=x;
			this.age =i;
			this.gender=g;
			
		}
		
		//method
		/*public void setLanguage(String x) {
			
			this.language=x;
			
		}
		*/
		
		public void grow(int i) {
			
			this.age = this.age+i;
		}
		

		public String getWords() {
			
			return "Here is my words.";
		}
		
		public void sayHello() {
			
			if (age <=3) {
				System.out.println("asdfaeuhqgajsnhwe");
				
			}
			
			else if (this.language.equals("English")) {
			
				System.out.println("Hello");
				
			}
			
			else if (this.language.equals("ÖÐÎÄ")) {
				
			System.out.println("ÄãºÃ");
			
			}
			
		}
		
		public void sayGoodbye() {
			
			System.out.print("Bye");
			
		}
		
	}


