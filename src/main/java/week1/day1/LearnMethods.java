package week1.day1;

public class LearnMethods {
	int number = 54;
	
	// main ctrl+space
	public static void main(String[] args) {
		// Create an object for a class
		// className objectName = new className();
		LearnMethods object = new LearnMethods();
		// syntax to a method: object.methodName(); 
		object.printName();
		object.printGivenName("Balaji");
		int output = object.getCreditCardPin(); // ctrl+2 -> l
		System.out.println(object.getCreditCardPin());
		System.out.println(output);
		int num = object.number;
		System.out.println(num);
		
	}
	
	
	
	
	
	/** syntax: 
		accessModifier returnType methodName(arguments if any){
		} 
	**/
	public void printName() {
	System.out.println("Testleaf");	// syso -> ctrl+space
	}
	private int getCreditCardPin() {
		int pin = 7865;
		return pin;
	}
	
	void printGivenName(String name) {
		System.out.println(name);
	}
}
