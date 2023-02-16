package arrayTasks;

import java.util.Arrays;

public class ArrayTask01CreateArray {

	public static void main(String[] arge) {

		/*
		 * create an array that has the numbers 100 to 1
		 */

		int[] numbers = new int[100];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length - i;
		}

		System.out.println(Arrays.toString(numbers));

	}

}
