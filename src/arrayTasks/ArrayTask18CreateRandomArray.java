package arrayTasks;

import java.util.Arrays;
import java.util.Random;

public class ArrayTask18CreateRandomArray {

	public static void main(String[] args) {
		/*
		 * Write a program to add random 100 number to an integer array
    	1. how many even numbers in the array?
    	2. how many odd numbers in the array?
    	3. how many numbers can be evenly divisible by 3?
    	4. how many numbers can be evenly divisible by 5?
		 */
		
		Random random = new Random();
		
		int[] numbers = new int[100];
		
		for(int i = 0; i < numbers.length; i++) {
			
			numbers[i] = random.nextInt(100);
			
		}
		
		//System.out.println(Arrays.toString(numbers));
		
		int evenNumberCount = 0;
		int oddNumberCount = 0;
		int divisibleBy3Count = 0;
		int divisibleBy5Count = 0;
		
		for (int eachNumber : numbers) {
			if (eachNumber % 2 == 0) {
				evenNumberCount += 1;
			}
			if (eachNumber % 2 != 0) {
				oddNumberCount += 1;
			}
			if (eachNumber % 3 == 0) {
				divisibleBy3Count += 1;
			}
			if (eachNumber % 5 == 0) {
				divisibleBy5Count += 1;
			}
		}
		
		System.out.println(Arrays.toString(numbers));
		System.out.println("Even Number = " + evenNumberCount);
		System.out.println("Odd Number = " + oddNumberCount);
		System.out.println("Devisible by 3 number = " + divisibleBy3Count);
		System.out.println("Devisible by 5 number = " + divisibleBy5Count);
	
	}

}
