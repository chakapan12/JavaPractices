package stringtasks;

import java.util.Scanner;

public class Task09ModificationString {
	
	public static void main(String[] args) {
		/*
		 * Ask user to enter two words. Print first word without its first character
		 * then print the second word without its first character. Input: apple banana
		 * Output: ppleanana
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first word");
		String firstWord = scan.nextLine();

		System.out.println("Enter second word");
		String secondWord = scan.nextLine();

		System.out.println(firstWord.substring(1) + secondWord.substring(1));

		scan.close();

	}

}
