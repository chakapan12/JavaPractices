package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask07getMaxMinAverage {

	public static void main(String[] args) {
		/*
		 * Write a program that can find the maximum, minimum and average number from an
		 * arrayList of integers
		 */

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

		System.out.println("Max Number: " + getMaxNumber(numbers));

		System.out.println("Min Number: " + getMinNumber(numbers));

		System.out.println("Average Number: " + getAverageNumber(numbers));

	}

	public static int getMaxNumber(ArrayList<Integer> numbers) {
		int maxNumber = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) > maxNumber) {
				maxNumber = numbers.get(i);
			}
		}
		return maxNumber;

	}

	public static int getMinNumber(ArrayList<Integer> numbers) {
		int minNumber = numbers.get(0);
		for (int i = 0; i < numbers.size(); i++) {

			if (numbers.get(i) < minNumber) {
				minNumber = numbers.get(i);
			}
		}
		return minNumber;

	}

	public static int getAverageNumber(ArrayList<Integer> numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum / numbers.size();

	}

}
