package week3.Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Question1 {
	public static void main(String[] args) {

		// Declare a String as PayPal India => yl Indi
		String txt = "PayPal India";
		// Convert it into a character array
		char[] array = txt.toCharArray();
		// Declare a Set as charSet for Character
		Set<Character> charSet = new LinkedHashSet<Character>();
		// Declare a Set as dupCharSet for duplicate Character
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		// Iterate character array and add it into charSet
		for (int i = 0; i < array.length; i++) {
			// if the character is already in the charSet then, add it to the dupCharSet
			if (charSet.add(array[i])) {

			} else {
				dupCharSet.add(array[i]);
			}
		}

		// Check the dupCharSet elements and remove those in the charSet
		for (Character character : dupCharSet) {
			if (charSet.contains(character)) {
				charSet.remove(character);
			}
		}
		// Iterate using charSet
		for (Character character : charSet) {
			// Check the iterator variable isn't equals to an empty space
			if (character == ' ') {

			} else {
				// print each character for charSet
				System.out.println(character);
			}
		}

	}
}
