package week1.day1;

public class LearnAccessModifer {
	public static void main(String[] args) {
		LearnAccessModifer obj = new LearnAccessModifer();
		int a2 = obj.a;
		obj.method1();
		// Access Private members
		int b2 = obj.b;
		obj.method2();
		// Access default members
		int c2 = obj.c;
		obj.method3();
	}
	public int a = 5;	// public variable
	private int b = 6;	// private variable
	int c = 7;		// default variable
	// public method
	public void method1() {
		System.out.println("Public method");
	}
	// private method
	private void method2() {
		System.out.println("Private method");
	}
	// default method
	void method3() {
		System.out.println("default method");
	}
}
