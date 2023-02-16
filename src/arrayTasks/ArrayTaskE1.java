package arrayTasks;

import java.util.Arrays;

public class ArrayTaskE1 {

	public static void main(String[] args) {
		/*
		 * Given an array of ints, swap the first and last elements in the array. Return
		 * the modified array. The array length will be at least 1.
		 * 
		 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1] swapEnds([1, 2, 3]) → [3, 2, 1]
		 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
		 * 
		 */
		
		int[] a = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(swapEnds(a)));

		int[] b = { 1, 2, 3 };
		System.out.println(Arrays.toString(swapEnds(b)));

		int[] c = { 8, 6, 7, 9, 5 };
		System.out.println(Arrays.toString(swapEnds(c)));

	}

	public static int[] swapEnds(int[] inputArr) {
		// int[] inputArr = { 1, 2, 3, 4 };

		int temp = inputArr[inputArr.length - 1];
		inputArr[inputArr.length - 1] = inputArr[0];
		inputArr[0] = temp;

		return inputArr;

	}
}
