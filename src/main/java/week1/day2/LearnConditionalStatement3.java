package week1.day2;

public class LearnConditionalStatement3 {
	public static void main(String[] args) {
		// Balcony, First class, Second class
		String choice = "Third Class";
		// switch (condition)
		switch (choice) {
		// Case 1 -> Balcony
		case "Balcony":
			System.out.println("Ticket costs Rs. 250");
			break;
			// Case 2 -> First Class
		case "First Class":
			System.out.println("Ticket costs Rs. 200");
			break;
			// Case 3 -> Second Class
		case "Second Class":
			System.out.println("Ticket costs Rs. 150");
			break;
		default:
			System.out.println("Please select a valid input");
			break;
		}
	}
}
