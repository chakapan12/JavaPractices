package arrayTasks;

public class ArrayTask03CountPalindromes {

	public static void main(String[] args) {
		/*
		 * write a program that can count how many palindromes in an array of string
		 * 
		 * Example: ```text input: {"anna", "level", "Java"};
		 * 
		 * output: 2
		 */

		String[] input = { "anna", "level", "Java",};
		int numberOfPalindromes = 0;
		for (String str : input) {
			String reverse = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			if (reverse.equals(str)) {
				numberOfPalindromes += 1;
			}
		}
		System.out.println("Number Of Palindromes = " + numberOfPalindromes);

	}

}
