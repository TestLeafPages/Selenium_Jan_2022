package week1.day2;

public class LearnControlStatement1 {
public static void main(String[] args) {
	for (int i = 1; i <= 5; i++) {
		System.out.println(i);
	}
	for (int i = 5; i > 0; i--) {
		System.out.println(i);
	}
	// i =1; i <= 5; loop executed; i -> i+1
	// i= 2; i <= 5; loop executed; i -> i+1
	// i=3; i <= 5; loop executed; i -> i+1
	// i=4; i <= 5; loop executed; i -> i+1
	// i=5; i <= 5; loop executed; i -> i+1	
	// i=6; i <=5 -> condition fails
}
}
