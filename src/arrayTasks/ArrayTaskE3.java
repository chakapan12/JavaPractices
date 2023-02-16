package arrayTasks;

import java.util.Arrays;

public class ArrayTaskE3 {

	public static void main(String[] args) {
		/*
		 * Given 2 int arrays, a and b, of any length, return a new array with the first
		 * element of each array. If either array is length 0, ignore that array.
		 * 
		 * front11([1, 2, 3], [7, 9, 8]) → [1, 7] 
		 * front11([1], [2]) → [1, 2] 
		 * front11([1,7], []) → [1]
		 * front11([], [2, 8]) → [2] 
		 * front11([], []) → []
		 * 
		 */
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 7, 8, 9 };
		System.out.println(Arrays.toString(extractFirstElement(arr1, arr2)));

		int[] arr3 = { 1 };
		int[] arr4 = { 2 };
		System.out.println(Arrays.toString(extractFirstElement(arr3, arr4)));

		int[] arr5 = { 1, 7 };
		int[] arr6 = {};
		System.out.println(Arrays.toString(extractFirstElement(arr5, arr6)));
		
		int[] arr7 = {};
		int[] arr8 = { 2, 8 };
		System.out.println(Arrays.toString(extractFirstElement(arr7, arr8)));
		
		int[] arr9 = {};
		int[] arr10 = {};
		System.out.println(Arrays.toString(extractFirstElement(arr9, arr10)));

	}

	public static int[] extractFirstElement(int[] arr1, int[] arr2) {
//		int[] arr1 = { 1, 2, 3 };
//		int[] arr2 = { 7, 8, 9 };

		if (arr1.length == 0 && arr2.length == 0) {
			int[] outputArr = {};
			return outputArr;
		} else if (arr1.length == 0 && arr2.length > 0) {
			int[] outputArr = new int[1];
			outputArr[0] = arr2[0];
			return outputArr;
		} else if (arr1.length > 0 && arr2.length == 0) {
			int[] outputArr = new int[1];
			outputArr[0] = arr1[0];
			return outputArr;
		} else {
			int[] outputArr = new int[2];
			outputArr[0] = arr1[0];
			outputArr[1] = arr2[0];
			return outputArr;
		}
	}

}
