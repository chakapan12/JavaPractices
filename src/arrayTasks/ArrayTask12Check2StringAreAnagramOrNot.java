package arrayTasks;

import java.util.Arrays;

public class ArrayTask12Check2StringAreAnagramOrNot {

	public static void main(String[] args) {
		/*
		 * Write a program to check if two string are Anagram ```java String str1 =
		 * "acdb"; String str2 = "dbca";
		 */

		String str1 = "acdb";
		String str2 = "dbca";

		char[] str1Arr = str1.toCharArray();

		char[] str2Arr = str2.toCharArray();

		// System.out.println(Arrays.toString(str1Arr));
		Arrays.sort(str1Arr);
		// System.out.println(Arrays.toString(str1Arr));

		// System.out.println(Arrays.toString(str2Arr));
		Arrays.sort(str2Arr);
		// System.out.println(Arrays.toString(str2Arr));

		if (Arrays.equals(str1Arr, str2Arr)) {
			System.out.println(str1 + " and " + str2 + " are Anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not Anagram");

		}

	}

}
