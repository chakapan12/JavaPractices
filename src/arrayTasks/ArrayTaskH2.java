package arrayTasks;

public class ArrayTaskH2 {

	public static void main(String[] args) {
		/*
		 * Order the sentence by the length of the word in `ascending order` _without_
		 * special character.
		 * 
		 * text Input: is a sequence of characters that specifies a search pattern in
		 * text. Usually such patterns are used by string-searching algorithms for find
		 * or find and replace operations on strings.
		 * 
		 * Expected: a a is of in are .... algorithms operations
		 */
		String sentence = "is a sequence of characters that specifies a search pattern in text. "
				+ "Usually such patterns are used by string-searching algorithms for find or "
				+ "find and replace operations on strings.";

		System.out.println(ascendingOrder(sentence));

		String sentence1 = "is a sequence of characters that specifies a search pattern in text.";
		System.out.println(ascendingOrder(sentence1));

	}

	public static String ascendingOrder(String sentence) {
//		String sentence = "is a sequence of characters that specifies a search pattern in text. "
//				+ "Usually such patterns are used by string-searching algorithms for find or "
//				+ "find and replace operations on strings.";

		String[] sentenceArr = sentence.split(" ");

		// System.out.println(Arrays.toString(sentenceArr));

		// find longest words
		int maxLength = 0;
		for (String eachWords : sentenceArr) {
			if (eachWords.length() > maxLength) {
				maxLength = eachWords.length();
			}
		}
		// System.out.println(maxLength);
		String outputStr = "";
		for (int i = 0; i <= maxLength; i++) {
			for (String eachWords : sentenceArr) {
				if (eachWords.length() == i) {
					outputStr += eachWords + ", ";
				}
			}
		}
		return outputStr;

	}

}
