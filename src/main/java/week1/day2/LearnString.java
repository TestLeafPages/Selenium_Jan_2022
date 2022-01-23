package week1.day2;

public class LearnString {
public static void main(String[] args) {
	String name1 = "Testleaf";	// String literal
	String name = "Always Ahead";
	String name4 = "Testleaf";
	String name2 = new String("Testleaf");	// String Object
	
	int length = name1.length();
	System.out.println(length);
	
	name1 = name1.concat(name);
	System.out.println(name1.concat(name));
	
	String lowerCase = name4.toLowerCase();
	System.out.println(lowerCase);
	
	String upperCase = name4.toUpperCase();
	System.out.println(upperCase);
	
	String txt1 = "         Test   leaf       ";
	String trim = txt1.trim();
	System.out.println(trim);
	
	String txt2 = "Testleaf";
	String txt3 = "testleaf";
	
	boolean equals = txt2.equals(txt3);
	System.out.println(equals);
	
	boolean equalsIgnoreCase = txt2.equalsIgnoreCase(txt3);
	System.out.println(equalsIgnoreCase);
	
	String txt4 = "Testleaf is in Chennai";
	boolean contains = txt4.contains("leaf");
	System.out.println(contains);
	
	char charAt = txt2.charAt(0);
	System.out.println(charAt);
	
	char[] charArray = txt2.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
	String[] split = txt4.split(" ");
	for (int i = 0; i < split.length; i++) {
		System.out.println(split[i]);
	}
	
	String txt5 = "Since 2005";
	String substring = txt5.substring(6);
	System.out.println(substring);
	
	String substring2 = txt5.substring(6, 10);
	System.out.println(substring2);
	
	String replaceAll = txt5.replaceAll("\\D", "");
	System.out.println(replaceAll);
	
	String replace = txt5.replace('S', '$');
	System.out.println(replace);
	
	
	
	
}
}
