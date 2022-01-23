package week1.day2;

import java.util.Arrays;

public class LearnArray {
public static void main(String[] args) {
	String name1 = "Aravind";
	String name2 = "Dhivya";
	String name3 = "Ram";
	String name4 = "Pricila";
	String name5 = "Hari";
//	[] -> Single dimensional array [][] -> Two dimensional array
	
	// Type 1 Literal way
	String[] names = {"Aravind","Dhivya","Ram","Pricila","Hari"};
	int lengthOfArray = names.length;
	System.out.println(lengthOfArray);
	for (int i = 0; i < lengthOfArray; i++) {
		System.out.println(names[i]);
	}
	// Type 2 Object
	String[] names1 = new String[5];
	names1[0] = "Aravind";
	names1[1] = "Dhivya";
	names1[2] = "Ram";
	names1[3] = "Pricila";
	names1[4] = "Hari";
	Arrays.sort(names1);	// To sort the values inside the array
	for (int i = 0; i < names1.length; i++) {
		System.out.println(names1[i]);
	}
	
	
	System.out.println(names1[5]);
	
}
}
