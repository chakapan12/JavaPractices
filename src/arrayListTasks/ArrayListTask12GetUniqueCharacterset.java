package arrayListTasks;

import java.util.Arrays;

public class ArrayListTask12GetUniqueCharacterset {

	public static void main(String[] args) {
		/*
		 * Write a program to get unique characterset from a string. String str =
		 * "aaaaabbbccccdeeeef"; output : [a,b,c,d,e,f]
		 */

		String str = "aaaaabbbccccdeeeef";

		String newStr = "";

		for (int i = 0; i < str.length() - 1; i++) {
			if (newStr.indexOf(str.charAt(i)) == -1) {
				newStr += str.charAt(i) + ", ";
			}
		}
		String[] outputArr = newStr.split(", ");

		System.out.println(Arrays.toString(outputArr));

	}

}
