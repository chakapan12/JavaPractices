package arrayTasks;

import java.util.Arrays;

public class ArrayTask14FindShortestWord {

	public static void main(String[] args) {
		/*
		 * rite a program that will find out the shortest words in the given string str.
		 * If there are few words that are evenly short, print them all. Use the split
		 * method in order to split the str string variable and create an array of
		 * strings. Print array with Arrays.toString() method. Sort array before
		 * printing.
		 * 
		 * Example: ```text input: olive, fish, pursuit, old, warning, python, java,
		 * coffee, cat, ray
		 * 
		 * output: cat, old, ray
		 */

		String input = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";

		String[] inputArr = input.split(", ");

		// System.out.println(Arrays.toString(inputArr));


		int shortestLength = inputArr[0].length();
		for (String words : inputArr) {
			if (words.length() < shortestLength) {
				shortestLength = words.length();
			}
		}
		// System.out.println(shortestLength);

		String shortedWords = "";
		for (String words : inputArr) {
			if (words.length() == shortestLength) {
				shortedWords += words + ", ";
			}
		}
		
		//System.out.println(shortedWords);
		
		String[] outputArr = shortedWords.split(", ");
		Arrays.sort(outputArr);
		System.out.println(Arrays.toString(outputArr));

	}

}
