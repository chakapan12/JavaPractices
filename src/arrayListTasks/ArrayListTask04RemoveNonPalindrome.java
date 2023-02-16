package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask04RemoveNonPalindrome {

	public static void main(String[] args) {
		/*
		 * In the list below remove all the that's not a palindrome "Anna", "Racecar",
		 * "Level", "Eye", "Java", "Python", "TechCircle"
		 */

		ArrayList<String> words = new ArrayList<>(
				Arrays.asList("Anna", "Racecar", "Level", "Eye", "Java", "Python", "TechCircle"));

		for (int i = words.size() - 1; i >= 0 ; i--) {
			if (!palindromeCheck(words.get(i))) {
				words.remove(i);
			}
		}
		System.out.println(words);

	}

	public static boolean palindromeCheck(String words) {

		boolean isPalindrome = false;
		String reverse = "";
		for (int i = words.length() - 1; i >= 0; i--) {
			reverse += words.toLowerCase().charAt(i);
		}
		if (reverse.equals(words.toLowerCase())) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

}
