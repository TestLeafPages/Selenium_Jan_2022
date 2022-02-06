package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
// Learn Collections
	String[] name = new String[10];
	List<String> list = new ArrayList<>();   //<String> Generic of the list
	list.add("John");
	list.add("Aravind");
	list.add("Divya");
	list.add("Eshwar");
	list.add("Archana");
	list.add("Divya");
	list.add(1, "Hari");
	list.set(4, "Gobi");
	list.remove("Archana");
	list.remove("Divya");
	System.out.println(list);
	System.out.println(list.get(0));
	System.out.println(list.contains("Hari")); // helps us to find a particular value is available in the list
	System.out.println(list.size());
//	list.clear();
//	System.out.println(list.size());
	System.out.println(list.isEmpty());
	for (int i = 0; i < list.size(); i++) {
		System.out.println(list.get(i));
	}
	Collections.sort(list);
	Collections.reverse(list);     // Mandatory to Sort Before reversing
	for(String eachName:list) {
		System.out.println(eachName);
	}
	
}
}
