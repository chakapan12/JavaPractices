package arrayTasks;

import java.util.Arrays;

public class ArrayTaskH3 {

	public static void main(String[] args) {
		/*
		 * Sort these String Array in to ascending order via the word length.
		 * 
		 * ```text input: array = ['pink','orange','yellow','violet','red','magenta']
		 * 
		 * output: array = ['red','pink','yellow','violet','orange','magenta']
		 */

		String[] colorArr = { "pink", "orange", "yellow", "violet", "red", "megenta" };

		System.out.println(Arrays.toString(sortingStringArrayByLength(colorArr)));

	}

	public static String[] sortingStringArrayByLength(String[] arr) {
		int maxLength = 0;
		for (String eachElement : arr) {
			if (eachElement.length() > maxLength) {
				maxLength = eachElement.length();
			}
		}

		String outputStr = "";
		for (int i = 0; i <= maxLength; i++) {
			for (String eachElement : arr) {
				if (eachElement.length() == i) {
					outputStr += eachElement + ", ";
				}
			}
		}
		String[] outputArr = outputStr.split(", ");
		return outputArr;
	}

}
