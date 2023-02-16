package collectionTasks;

import java.util.HashMap;
import java.util.Map;

public class Task_B {

	public static void main(String[] args) {
		/*
		 Given a map of food keys and their topping values, modify and return the map as follows: 
		 if the key "ice cream" has a value, set that as the value for the key "yogurt" also. 
		 If the key "spinach" has a value, change that value to "nuts".

		topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"}
		topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
		topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
		 */
		
		Map<String, String> hm = new HashMap<>();
		hm.put("ice cream", "cherry");
		System.out.println(modify(hm));
		
		Map<String, String> hm1 = new HashMap<>();
		hm1.put("spinach", "dirt");
		hm1.put("ice cream", "cheery");
		System.out.println(modify(hm1));
		
		Map<String, String> hm2 = new HashMap<>();
		hm2.put("yogurt", "salt");
		System.out.println(modify(hm2));
	}
	
	public static Map<String, String> modify(Map<String, String> hm) {
		if(hm.containsKey("ice cream")) {
			hm.put("yogurt", hm.get("ice cream"));
		}
		if(hm.containsKey("spinach")) {
			hm.put("spinach", "nut");
		}
		return hm;
	}

}
