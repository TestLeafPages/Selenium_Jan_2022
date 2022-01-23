package week1.day2;

public class LearnControlStatement3 {
public static void main(String[] args) {
	int i = 6;
	do {
		System.out.println(i);
		i++;
	} while (i <= 5);
	// i =1; i <= 5; loop executed; i -> i+1
	// i= 2; i <= 5; loop executed; i -> i+1
	// i=3; i <= 5; loop executed; i -> i+1
	// i=4; i <= 5; loop executed; i -> i+1
	// i=5; i <= 5; loop executed; i -> i+1	
	// i=6; i <=5 -> condition fails
}
}
