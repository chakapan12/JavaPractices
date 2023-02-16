package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask05RemoveElementByLength {

	public static void main(String[] args) {
		/*
		 * Tasks 5.1 Create an Array of string called countries 5.2 Write a program that
		 * can remove all the country names that have length of 10 or greater
		 */

		ArrayList<String> countries = new ArrayList<>(Arrays.asList("Thailand", "Philippines", "England", "Barzil", "Italy",
				"United States", "Switzerland", "South Africa"));

		System.out.println(countries);
		int limitLength = 10;
		
		// call remove method
		removeElementByItsLength(countries, limitLength);
	
		System.out.println(countries);

	}
	
	public static ArrayList<String> removeElementByItsLength(ArrayList<String> countries, int limitLength) {
		//int limitLength = 10;
		for (int i = countries.size() - 1; i >= 0; i--) {
			if (countries.get(i).length() >= limitLength) {
				countries.remove(i);
			}
		}
		return countries;
	}

}
