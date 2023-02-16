package arrayTasks;

public class ArrayTask08PrintCommonElement2Arrays {

	public static void main(String[] args) {
		/*
		 * Write a program that can print out the common elements from two integer array
		 * 
		 * Example: ```text input: arr1: {1,2,3,4,5} arr2: {4,5,6,7,8}
		 * 
		 * output: 4 5
		 */

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 5, 6, 7, 8 };

		for (int arr3 : arr1) {
			for (int arr4 : arr2) {
				if (arr3 == arr4) {
					System.out.print(arr3 + " ");
				}
			}
		}

	}

}
