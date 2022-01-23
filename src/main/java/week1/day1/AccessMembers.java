package week1.day1;

public class AccessMembers {
	public static void main(String[] args) {
		// Created an object
		LearnAccessModifer obj = new LearnAccessModifer();
		// Access Public members
		int a2 = obj.a;
		obj.method1();
		// Access Private members
		int b2 = obj.b;
		obj.method2();
		// Access default members
		int c2 = obj.c;
		obj.method3();
	}
}
