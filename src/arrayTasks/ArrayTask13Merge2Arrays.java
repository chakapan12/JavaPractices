package arrayTasks;

import java.util.Arrays;

public class ArrayTask13Merge2Arrays {

	public static void main(String[] args) {
		/*
		 * 13. write a program that can merge two arrays of integers
		 * 
		 * Example: ```text input: arr1 = {1,2,3,4} arr2 = {5,6}
		 * 
		 * output: arr3 = {1,2,3,4,5,6}
		 */

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6 };

		int[] outputArr = new int[arr1.length + arr2.length];

		int index = 0;
		for (int output : arr1) {
			outputArr[index] = output;
			index++;
		}
		for (int output : arr2) {
			outputArr[index] = output;
			index++;
		}

		System.out.println(Arrays.toString(outputArr));

	}

}
