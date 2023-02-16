package arrayTasks;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask09AverageNumber {

	public static void main(String[] args) {
		/*
		 * AverageNumber: 
		 * 1. Ask the user how many numbers user want to enter 
		 * 2. get all the inputs from the user and store them into an array 
		 * 3. Iterate the array & return the average number
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many numbers user want to enter?");
		int numbers = scan.nextInt();
		
		int[] inputArray = new int[numbers];
		
		for (int i = 0; i < numbers; i++ ) {
			System.out.println("Enter your number (" + (i + 1) + ")");
			inputArray[i] = scan.nextInt();
		}
		
		System.out.println(Arrays.toString(inputArray));
		
		int sum = 0;
		for (int sums : inputArray) {
			sum += sums;
		}
		
		int average = sum / inputArray.length;
		
		System.out.println("Average of inputArray is " + average);
		
		scan.close();

	}

}
