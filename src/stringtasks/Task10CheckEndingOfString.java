package stringtasks;

import java.util.Scanner;

public class Task10CheckEndingOfString {

	public static void main(String[] args) {
		/*
		 * ask the user to enter a word. if the word ends with "ly", print "really???" ,
		 * otherwise, print "never mind"
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word");
		String word = scan.nextLine();

		if (word.substring(word.length() - 2).equals("ly")) {
			System.out.println("really???");
		} else {
			System.out.println("never mind");

		}
		
		scan.close();

	}

}
