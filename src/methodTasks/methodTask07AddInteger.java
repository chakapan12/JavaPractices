package methodTasks;

import java.util.Arrays;

public class methodTask07AddInteger {

	public static void main(String[] args) {
		/*
		 * create a return method called addInteger that can add an Integer after the
		 * last index of an integer array
		 */
		int[] inputArr = { 1, 2, 3, 4, 5 };
		int newElement = 6;
		System.out.println(Arrays.toString(addInteger(inputArr, newElement)));

	}

	public static int[] addInteger(int[] inputArr, int newElement) {

		int[] outputArr = new int[inputArr.length + 1];

		for (int i = 0; i < outputArr.length; i++) {
			if (i == outputArr.length - 1) {
				outputArr[outputArr.length - 1] = newElement;
			} else {
				outputArr[i] = inputArr[i];
			}
		}
		return outputArr;

	}

}
