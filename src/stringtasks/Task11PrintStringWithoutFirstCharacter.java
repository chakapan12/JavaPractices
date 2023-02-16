package stringtasks;

import java.util.Scanner;

public class Task11PrintStringWithoutFirstCharacter {
	
	public static void main(String[] arge) {

		/*
		 * Ask user to enter a word. If the work starts with x, print the word without
		 * x. Input: xcode Output: code
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word");
		String word = scan.nextLine();

		if (word.indexOf('x') == 0) {
			System.out.println(word.substring(1));
		}
		else {System.out.println(word);
		}

		scan.close();

	}

}
