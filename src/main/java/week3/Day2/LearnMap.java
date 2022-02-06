package week3.Day2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnMap {
public static void main(String[] args) {
		/*
		 * Map -> Interface -> Two dimensional collection Map -> HashMap, TreeMap,
		 * LinkedHashMap <1345,"Faroq">,<1348,"Faroq">
		 */
	Map<Integer,String> map = new LinkedHashMap<Integer, String>();
	map.put(1200, "Arun");
	map.put(1208, "Priya");
	map.put(1245, "Sarath");
	map.put(1234, "Gopi");
	map.put(1256, "Babu");
	map.put(1288, "Gopi");
	map.put(1200, "Aravind");
	map.remove(1256);
	System.out.println(map.containsKey(1208));
	System.out.println(map.containsKey(1256));
	System.out.println(map.containsValue("Sarath"));
	System.out.println(map);
	// retrieve each entry out of the map -> entrySet()
	Set<Entry<Integer, String>> entrySet = map.entrySet();
	for (Entry<Integer, String> eachEntry: map.entrySet()) {
		// From each Entry we are parsing the key and value out
		System.out.println(eachEntry.getKey()+"->"+eachEntry.getValue());
	}
	
	// retrieve using keyset()
	Set<Integer> keys = map.keySet();
	for (Integer eachKey : keys) {
		String value = map.get(eachKey);
		System.out.println(eachKey + "->" + value);
	}
}
}
