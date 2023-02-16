package arrayTasks;

public class ArrayTaskM3 {

	public static void main(String[] args) {
		/*
Given a string and an int n, return a string made of the first n characters of the string, followed
by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the
length of the string.

```text
repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
repeatFront("Ice Cream", 1) → "I"
repeatFront("Ice Cream", 0) → ""
repeatFront("Java", 4) → "JavaJavJaJ"
		 */
		System.out.println(repeatFront("Chocolate", 4));
		System.out.println(repeatFront("Chocolate", 3));
		System.out.println(repeatFront("Ice Cream", 2));
		System.out.println(repeatFront("Ice Cream", 1));
		System.out.println(repeatFront("Ice Cream", 0));
		System.out.println(repeatFront("Java", 4));
		
	}
	
	public static String repeatFront(String words, int number) {
//		String words = "Chocolate";
//		int number = 4;
		
		String outputStr = "";
		for(int i = 0; i < number; i ++) {
			String repeatFrount = words.substring(0, number - i);
			outputStr += repeatFrount;	
		}
		return outputStr;
		
	}

}
