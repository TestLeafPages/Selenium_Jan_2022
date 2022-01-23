package week1.day2;

public class ClassRoom {
public static void main(String[] args) {
		/*
		 * for (int i = 1; i <= 100; i++) { if(i%2==1) System.out.println(i); }
		 */
		/*
		 * for (int i = 59; i >= 38; i--) { if(i%2==0) System.out.println(i+"->"+i*i); }
		 */
	int i = 59;
	while(i >= 38) {
		if(i%2 ==0)
			System.out.println(i+"->"+i*i);
		i--;
	}
		/*
		 * int range = 10; int result = 0; for (int i = 1; i <= range; i++) { result =
		 * result + i; } System.out.println(result);
		 */
}
}
