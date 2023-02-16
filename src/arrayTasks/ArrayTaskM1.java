package arrayTasks;

public class ArrayTaskM1 {

	public static void main(String[] args) {
		/*
only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
only14([4, 1, 4, 1]) → true
only14([]) → true
		 */
		
		int[] arr1 = { 1, 4, 1, 4 };
		System.out.println(only14Array(arr1));

		int[] arr2 = { 1, 4, 2, 4 };
		System.out.println(only14Array(arr2));
		
		int[] arr3 = { 1, 1 };
		System.out.println(only14Array(arr3));
		
		int[] arr4 = { 4, 1, 4, 1 };
		System.out.println(only14Array(arr4));
		
		int[] arr5 = {};
		System.out.println(only14Array(arr5));
		

	}
	
	public static boolean only14Array(int[] arr) {
		//int[] arr = { 1, 4, 1, 4 };
		
		boolean only14Array = true;
		for (int eachNumber : arr) {
			if (eachNumber != 1 && eachNumber != 4) {
				only14Array = false;	
			}
		}
		return only14Array;
	}
	

}
