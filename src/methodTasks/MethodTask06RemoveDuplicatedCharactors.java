package methodTasks;

public class MethodTask06RemoveDuplicatedCharactors {

	public static void main(String[] args) {
		/*
		 * create a method that can remove duplicated characters from a string and
		 * returns the new value "aaabbcccc" ===> "abc"
		 */

		String input = "aaabbcccc";
		System.out.println(removeDuplicatedCharactors(input));

	}

	public static String removeDuplicatedCharactors(String input) {
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			if (output.indexOf(input.charAt(i)) == -1) {
				output += input.charAt(i);
			}
		}
		return output;

	}

}
