package collectionTasks;

import java.util.HashMap;
import java.util.Map;

public class Task_C {
	public static void main(String[] args) {
		/*
		 Modify and return the given map as follows: if the keys "a" and "b" have values 
		 that have different lengths, then set " c" to have the longer value. 
		 If the values exist and have the same length, change them both to the empty string in the map.

		mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
		mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
		mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
		 */
		
		Map<String, String> m = new HashMap<>();
		m.put("a", "aaa");
		m.put("b", "bb");
		m.put("c", "cake");
		System.out.println(mapAB4(m));
		
		Map<String, String> m1 = new HashMap<>();
		m1.put("a", "aa");
		m1.put("b", "bbb");
		m1.put("c", "cake");
		System.out.println(mapAB4(m1));
		
		Map<String, String> m2 = new HashMap<>();
		m2.put("a", "aa");
		m2.put("b", "bbb");
		System.out.println(mapAB4(m2));	
		
	}
	
	public static Map<String, String> mapAB4(Map<String, String> m){
	
		if(m.containsKey("a") && m.containsKey("b")) {
			if(m.get("a").length() > m.get("b").length()) {
				m.put("c", m.get("a"));
			} else if(m.get("a").length() < m.get("b").length()){
				m.put("c", m.get("b"));
			} else {
				m.put("a", "");
				m.put("b", "");
			}
		}
		return m;
	}	

}
