package collectionTasks;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestionCommonKey {

	public static void main(String[] args) {
		/*
		Find the common keys. Once you find the common keys, print out its respective values from each map.

		Example 1
		
		Input: 
		HM1 = { 1="x", 2="y", 3="z"};
		HM2 = { 3="A", 4="B", 5="C", 6="D"};
		
		Output:
		3z 3A
		Example 2
		
		Input:
		HM1 = { 0="apple", 100="orange", 50="banana"};
		HM2 = { 0="dog",1="cat",15="tiger",50="bear"};
		
		Output:
		0apple 0dog 50banana 50bear 
				 
		 */
		
		Map<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "x");
		hm1.put(2, "y");
		hm1.put(3, "z");	

		Map<Integer, String> hm2 = new HashMap<>();
		hm2.put(3, "A");
		hm2.put(4, "B");
		hm2.put(5, "C");
		hm2.put(6, "D");
		
		commonKey(hm1, hm2);
		
		System.out.println();
		
		Map<Integer, String> hm3 = new HashMap<>();
		hm3.put(0, "apple");
		hm3.put(100, "orange");
		hm3.put(50, "banana");

		Map<Integer, String> hm4 = new HashMap<>();
		hm4.put(0, "dog");
		hm4.put(1, "cat");
		hm4.put(15, "tiger");
		hm4.put(50, "bear");
		
		commonKey(hm3, hm4);

	}
	
	public static void commonKey(Map<Integer, String> hm1, Map<Integer, String> hm2) {
		for(int eachHM1 : hm1.keySet()) {
			for (int eachHM2 : hm2.keySet()){
				if (eachHM1 == eachHM2) {
					System.out.print(eachHM1 + hm1.get(eachHM1) + " " + eachHM2 + hm2.get(eachHM2) + " ");
				}
				
			}
		}
	}

}
