package stringtasks;

import java.util.Scanner;

public class Task07CheckLengthOfString {

	public static void main(String[] args) {
		/*
		 * Write a method that asks user to enter a string. if the string is empty,
		 * print: string is empty if the string has more than 3 characters, print the
		 * last three characters if the string has less than or equal 3 characters,
		 * print the string itself
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string");
		String str = scan.nextLine();

		int lengthOfstr = str.length();

		if (str.isEmpty()) {
			System.out.println("String is empty");
		} else if (lengthOfstr > 3) {
			System.out.println(str.substring(lengthOfstr - 3));
		} else {
			System.out.println(str);
		}

		scan.close();
	}

}
