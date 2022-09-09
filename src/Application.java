
public class Application {

	public static void main(String[] args) {		
		
		/***********Primitive Data Types*************/
		
		// primitive data types: int, double, float, long, short, byte, char, boolean
		System.out.println("/***********Primitive Data Types*************/");
		int age = 67;
		System.out.println("Age: " + age);
		
		double accountBalance = 34.67;
		System.out.println("Account Blanace: " + accountBalance);
		
		char middleInitial = 'C';
		System.out.println("Middle Initial: " + middleInitial);
		
		boolean isHotOutside = true;
		System.out.println("Is it Hot Outside: " + isHotOutside);
		
		String firstName = "Sean";
		System.out.println("First Name: " + firstName);
		
		
		
		/***********Operations*************/
		age += 1;
		System.out.println("/***********Operations*************/");
		System.out.println("Updated age: " + age);
		
		age = 34 *2;
		System.out.println("Updated age: " + age);
		
		String lastName = "Smith";
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println("Full name: " + fullName);
		System.out.print("True or false operation: ");
		System.out.println(8 == 68);
	}

}
