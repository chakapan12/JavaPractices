package arrayTasks;

public class ArrayTaskH1 {

	public static void main(String[] args) {
		/*
		 * Given a non-empty array, return true if there is a place to split the array
		 * so that the sum of the numbers on one side is equal to the sum of the numbers
		 * on the other side.
		 * 
		 * canBalance([1, 1, 1, 2, 1]) → true 
		 * canBalance([2, 1, 1, 2, 1]) → false 
		 * canBalance([10, 10]) → true 
		 * canBalance([2, 1, 1, 1, 4]) → false
		 * canBalance([1]) → false 
		 * canBalance([1, 2, 3, 1, 0, 2, 3]) → true
		 */
		
		int[] arr = { 1, 1, 1, 2, 1 };
		System.out.println(canBalance(arr));
		
		int[] arr1 = { 2, 1, 1, 2, 1 };
		System.out.println(canBalance(arr1));
		
		int[] arr2 = { 10, 10 };
		System.out.println(canBalance(arr2));
		
		int[] arr3 = { 2, 1, 1, 1, 4 };
		System.out.println(canBalance(arr3));
		
		int[] arr4 = { 1 };
		System.out.println(canBalance(arr4));

		int[] arr5 = { 1, 2, 3, 1, 0, 2, 3 };
		System.out.println(canBalance(arr5));

	}

	public static boolean canBalance(int[] arr) {
		boolean canBalance = false;
		int sumOfLeftSide = 0;
		int sumOfRightSide = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			sumOfLeftSide = sumOfLeftSide + arr[i];
			
			for (int j = i + 1; j < arr.length; j++) {
				sumOfRightSide = sumOfRightSide + arr[j];
			}

			if (sumOfLeftSide == sumOfRightSide) {
				canBalance = true;

			}
			sumOfRightSide = 0;
		}
		return canBalance;
	}	

}
