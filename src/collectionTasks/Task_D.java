package collectionTasks;

import java.util.HashMap;
import java.util.Map;

public class Task_D {

	public static void main(String[] args) {
		/*
		 This will come up in interview a lot The classic word-count algorithm: given an array of strings, 
		 return a Map<String, Integer> with a key for each different string, 
		 with the value the number of times that string appears in the array.

		wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
		wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
		wordCount(["c", "c", "c", "c"]) → {"c": 4}
		 */
		

		
		String[] arr = {"a", "b", "a", "c", "b"};
		System.out.println(wordCount(arr));
		
		String[] arr1 = { "c", "b", "a"};
		System.out.println(wordCount(arr1));
		
		String[] arr2 = { "c", "c", "c", "c"};
		System.out.println(wordCount(arr2));

	}
	
	public static Map<String, Integer> wordCount(String[] arr){
		Map<String, Integer> m = new HashMap<>();
		for(String eachStr : arr) {
			m.put(eachStr, 0);
		}
		for(String eachKey : m.keySet()) {
			for(String eachStr : arr) {
				if(eachKey == eachStr) {
					m.put(eachKey, m.get(eachKey)+1);
				}
			}
		}
		return m;	
	}

}
