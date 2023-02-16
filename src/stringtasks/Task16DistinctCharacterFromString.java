package stringtasks;

public class Task16DistinctCharacterFromString {
	
	public static void main(String[] arge) {

		/*
		 * Write a program to extract distinct character from a string input:
		 * abcabcabcabc output:abc
		 */

		String input = "abcabcabcabc";

		for (int i = 97; i <= 122; i++) {
			if (input.indexOf(i) > -1) {
				System.out.print((char)i);

			}
		}

	}

}
