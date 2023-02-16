package arrayTasks;

import java.util.Arrays;

public class ArrayTaskInterviewQuestion {

	public static void main(String[] args) {
		/*
		 * Interview Question Given an **array of integers** and an **integer target**,
		 * return indices of the **Array of two numbers** such that they add up to
		 * `target`. You may assume that each input would have exactly one solution, and
		 * you may not use the same element twice. You can return the answer in any
		 * order. if no elements can add up to `target`, return [0,0]
		 * 
		 * ```text array = [1,15,23,11,34,7] target = 12 The output should be [0, 3]
		 * 
		 * array = [4,5,6,11,3,17] target = 23 output [2,5]
		 * 
		 * array = [4,5,6,11,3,17] target = 100 output [0,0] ```
		 */

		int[] arr = { 1, 15, 23, 11, 34, 7 };
		int target = 12;
		System.out.println(Arrays.toString(adding2NumberToTargerValue(arr, target)));

		int[] arr1 = { 4, 5, 6, 11, 3, 17 };
		int target1 = 23;
		System.out.println(Arrays.toString(adding2NumberToTargerValue(arr1, target1)));

		int[] arr2 = { 4, 5, 6, 11, 3, 17 };
		int target2 = 100;
		System.out.println(Arrays.toString(adding2NumberToTargerValue(arr2, target2)));

	}

	public static int[] adding2NumberToTargerValue(int[] arr, int target) {

		int[] outputArr = { 0, 0 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					outputArr[0] = i;
					outputArr[1] = j;
				}
			}
		}
		return outputArr;
	}

}
