package arrayTasks;

public class ArrayTask02CoundEvenOrOddNumber {

	public static void main(String[] args) {
		/*
		 * Write a program that can count the even and odd number from an array of
		 * integers _Note: MUST use for each loop_
		 */

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };

		int evenNumberCount = 0;
		int oddNumberCount = 0;

		for (int num : numbers) {
			if (num % 2 == 0) {
				evenNumberCount += 1;
			} else {
				oddNumberCount += 1;
			}
		}

		System.out.println("Even Number Count = " + evenNumberCount);
		System.out.println("Odd Number Count = " + oddNumberCount);

	}

}
