package week3.day1;

public class LearnStatic {
public int a = 5;
public static int b = 6;
final int c = 5;
public void incnumber(){
	a = a+5;
}
public void incStatic() {
	LearnStatic.b = LearnStatic.b+5;
}

public static void main(String[] args) {
	LearnStatic obj = new LearnStatic();
	System.out.println(obj.a);
	obj.incnumber();
	System.out.println(obj.a);
	
	System.out.println(b);
	obj.incStatic();
	System.out.println(b);
	LearnStatic obj1 = new LearnStatic();
	System.out.println(obj1.a);
	obj1.incStatic();
	System.out.println(b);


}

}
