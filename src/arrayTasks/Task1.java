package arrayTasks;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * 1. Write a program that can count the even and odd number from an array of
		 * integers Note: MUST use for each loop
		 * 
		 * 'input = {1,2,3,4,5,6,7} output: evenNumberCount = 3, OddNumberCount = 4'
		 */

		int[] input = { 1, 2, 3, 4, 5, 6, 7 };
		int evenNumberCount = 0;
		int oddNumberCount = 0;

		for (int oddOrEven : input) {
			if (oddOrEven % 2 == 0) {
				evenNumberCount += 1;
			} else {
				oddNumberCount += 1;
			}
		}
		System.out.println("Even Number Count = " + evenNumberCount);
		System.out.println("Odd Number Count = " + oddNumberCount);

	}

}
