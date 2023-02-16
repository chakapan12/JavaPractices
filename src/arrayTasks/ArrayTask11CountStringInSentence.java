package arrayTasks;

public class ArrayTask11CountStringInSentence {

	public static void main(String[] args) {
		/*
		 * Write a program that can return the number of appearances of “java” and
		 * “python” anywhere in the sentence.
		 */

		String sentence = "Write a program that can return the number of appearances of java and python";

		String[] sentenceArr = sentence.split(" ");

		//System.out.println(Arrays.toString(sentenceArr));

		int countjavaWord = 0;
		int countphython = 0;

		for (String findWords : sentenceArr) {
			if (findWords.toLowerCase().equals("java")) {
				countjavaWord += 1;
			}
			if (findWords.toLowerCase().equals("python")) {
				countphython += 1;
			}
		}
		System.out.println("Number of \"java\" in the sentence = " + countjavaWord);
		System.out.println("Number of \"python\" in the sentence = " + countphython);
	}

}