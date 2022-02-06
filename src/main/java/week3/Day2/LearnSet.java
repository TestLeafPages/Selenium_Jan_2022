package week3.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	/***Set is an interface
	Set allows unique values
	Set may/may not maintain the insertion order
	Set -> Implementation class				Properties
			1. HashSet				Provides Random Output
			2. TreeSet				Provides ASCII Sorted Output
			3. LinkedHashSet 		Maintains the insertion order
	***/
	Set<String> names = new TreeSet<String>();
	names.add("Divya");
	boolean add = names.add("Sowmya");
//	System.out.println(add);
	names.add("Hari");
	names.add("Aravind");
	boolean add2 = names.add("Sowmya");
//	System.out.println(add2);
	names.add("John");
	System.out.println(names);
	for (String eachName : names) {
		System.out.println(eachName);
	}
	names.clear();
	names.isEmpty();
	List<String> name = new ArrayList<String>();
	name.addAll(names);
}
}
