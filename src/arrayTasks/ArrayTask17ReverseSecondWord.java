package arrayTasks;

public class ArrayTask17ReverseSecondWord {

	public static void main(String[] args) {
		/*
		 * Write a program that can reverse the second word of the sentence Example:
		 * 
		 * input: sentence = "I Love Java";
		 * 
		 * output: I evoL Java ```
		 * 
		 * input: sentence = "find all the palindrome string";
		 * 
		 * output: find lla the emordnilap string
		 */

		String sentence = "find all the palindrome string";

		String[] strArr = sentence.split(" ");

		// System.out.println(Arrays.toString(strArr));

		for (int i = 0; i < strArr.length; i++) {

			String str = strArr[i];

			if (i % 2 == 1) {

				String strRevrse = "";
				for (int j = str.length() - 1; j >= 0; j--) {
					strRevrse += str.charAt(j);
				}
				System.out.print(strRevrse + " ");

			} else {
				System.out.print(str + " ");

			}
		}

	}

}
