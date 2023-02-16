package arrayTasks;

import java.util.Arrays;

public class ArrayTask10Merge3Araays {

	public static void main(String[] args) {
		/*
		 * Write a program that can merge 3 arrays of integers
		 * 
		 * Example: ```text Input: arr1 = {30, 10, 20}; arr2 = {15, 40, 25, 35}; arr3 =
		 * {8, 9, 17, 5, 4, 1}
		 * 
		 * Output: {30,10,20,15,40,25,35,8,9,17,5,4,1} ```
		 */

		int[] arr1 = { 30, 10, 20 };
		int[] arr2 = { 15, 40, 25, 35 };
		int[] arr3 = { 8, 9, 17, 5, 4, 1 };

		int[] outputArr = new int[arr1.length + arr2.length + arr3.length];

		int index = 0;
		for (int output : arr1) {
			outputArr[index] = output;
			index++;
		}
		for (int output : arr2) {
			outputArr[index] = output;
			index++;
		}
		for (int output : arr3) {
			outputArr[index] = output;
			index++;
		}

		System.out.println(Arrays.toString(outputArr));

	}

}
