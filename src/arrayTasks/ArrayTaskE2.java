package arrayTasks;

public class ArrayTaskE2 {

	public static void main(String[] args) {
		/*
		 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
		 * Return true if the given array contains an unlucky 1 in the first 2 or last 2
		 * positions in the array.
		 * 
		 * unlucky1([1, 3, 4, 5]) → true unlucky1([2, 1, 3, 4, 5]) → true unlucky1([1,
		 * 1, 1]) → false
		 * 
		 */

		int[] arr1 = { 1, 3, 4, 5 };
		System.out.println(unlucky1(arr1));
		
		int[] arr2 = { 2, 1, 3, 4, 5 };
		System.out.println(unlucky1(arr2));
		
		int[] arr3 = { 1, 1, 1, 1 };
		System.out.println(unlucky1(arr3));

	}

	public static boolean unlucky1(int[] arr) {
		// int[] arr = { 1, 3, 4, 5 };
		boolean isUnlucky1 = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1 && i != arr.length - 1) {
				if (arr[i + 1] == 3) {
					isUnlucky1 = true;

				}
			}
		}
		return isUnlucky1;
	}

}
