package stringtasks;

public class Task15ExtractDigitFromString {
	
	public static void main(String[] arge) {

		/*
		 * Write a program to extract digits from a String: input: ab123c4d56efg
		 * output:123456
		 */

		String str = "ab123c4d56efg";

//		int a = (char)'0';
//		System.out.println(a); //48
//		int b = (char)'9';
//		System.out.println(b); //57

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				System.out.print(str.charAt(i));
			}

		}

	}

}
