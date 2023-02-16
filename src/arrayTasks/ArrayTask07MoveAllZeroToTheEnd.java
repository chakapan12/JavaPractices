package arrayTasks;

import java.util.Arrays;

public class ArrayTask07MoveAllZeroToTheEnd {

	public static void main(String[] args) {
		/*
		 * write a program that can move all the zeros to the end of the array
		 * 
		 * Example: ```text input: array = {10, 0, 5, 0, 1, 0};
		 * 
		 * output: {10, 5, 1, 0, 0, 0}
		 */
		int[] inputArray = { 10, 0, 5, 0, 1, 0 };

		int[] outputArray = new int[inputArray.length];

		Arrays.sort(inputArray);

		// System.out.println(Arrays.toString(inputArray));

		int index = 0;

		for (int i = inputArray.length - 1; i >= 0; i--) {
			outputArray[index] = inputArray[i];
			index++;
		}
		System.out.println(Arrays.toString(outputArray));

	}

}
