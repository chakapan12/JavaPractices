package arrayTasks;

import java.util.Arrays;

public class ArrayTask15Reverse2DArray {

	public static void main(String[] args) {

		/*
		 * Write a program that can reverse a two dimensional array (return new array)
		 * 
		 * Example:
		 * 
		 * input: array = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12,13}};
		 * 
		 * output: reverse = {{13,12,11,10,9,8}, {7,6,5,4}, {3,2,1},}; ```
		 */

		int[][] input = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11, 12, 13 } };

		int[][] inputReverse = new int[input.length][];

		int[][] outputReverse = new int[input.length][];

		int firstIndex = 0;
		int secondIndex = 0;

		for (int i = input.length - 1; i >= 0; i--) {
			inputReverse[firstIndex] = input[i];
			firstIndex++;
		}
		//System.out.println(Arrays.deepToString(inputReverse));
		firstIndex = 0;
		secondIndex = 0;
		for (int[] numbers : inputReverse) {

			 //System.out.println(Arrays.toString(numbers));

			int[] firstArr = numbers;
			int[] outputArr = new int[firstArr.length];
			for (int i = numbers.length - 1; i >= 0; i--) {
				outputArr[secondIndex] = firstArr[i];
				secondIndex++;
				outputReverse[firstIndex] = outputArr;
			}
			secondIndex = 0;
			firstIndex++;

		}
		System.out.println(Arrays.deepToString(outputReverse));

	}

}
