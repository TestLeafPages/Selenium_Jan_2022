package week1.day2;

public class LearnConditionalStatments2 {
	public static void main(String[] args) {
		int mark = 99;
		/*
		 * 100-90 -> A 90-80 -> B 80-70 -> C 70-60 -> D 60-35 -> E <35 -> F
		 */
		if ((mark <= 100) && (mark >= 90)) {
			if (mark == 100) {
				System.out.println("You have scored 100");
			} else {
				System.out.println("Grade A");
			}
		} else if ((mark < 90) && (mark >= 80)) {
			System.out.println("Grade B");
		} else if ((mark < 80) && (mark >= 70)) {
			System.out.println("Grade C");
		} else if ((mark < 70) && (mark >= 60)) {
			System.out.println("Grade D");
		} else if ((mark < 60) && (mark >= 35)) {
			System.out.println("Grade E");
		} else {
			System.out.println("Grade F");
		}

	}
}
