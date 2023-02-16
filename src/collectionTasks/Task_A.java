package collectionTasks;

import java.util.HashMap;
import java.util.Map;

public class Task_A {

	public static void main(String[] args) {
		/*
		 Modify and return the given map as follows: if the key "a" has a value, 
		 set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.

		mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
		mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
		mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
		 */
		
		Map<String, String> hm = new HashMap<>();
		hm.put("a", "aaa");
		hm.put("b", "bbb");
		hm.put("c", "ccc");
		System.out.println(setAndRemove(hm));
		
		
		Map<String, String> hm1 = new HashMap<>();
		hm1.put("b", "xyz");
		hm1.put("c", "ccc");
		System.out.println(setAndRemove(hm1));
		
		Map<String, String> hm2 = new HashMap<>();
		hm2.put("a", "aaa");
		hm2.put("c", "meh");
		hm2.put("d", "hi");	
		System.out.println(setAndRemove(hm2));

	}
	
	public static Map<String, String>  setAndRemove(Map<String, String> hm) {
		hm.remove("c");
		if(hm.containsKey("a")) {
			hm.put("b", hm.get("a"));
		}
		return hm;
		
	}

}
