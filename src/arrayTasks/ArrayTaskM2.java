package arrayTasks;

public class ArrayTaskM2 {

	public static void main(String[] args) {
		/*
		 Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6,
... or 23, 24, 25.

tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
tripleUp([1, 2, 4, 5, 7, 6, 5, 7, 7, 6]) → false
tripleUp([-100, -99, -99, 100, 101, 102]) → true

		 */
		int[] arr1 = { 1, 4, 5, 6, 2 };
		System.out.println(threeIncreasingAdjacentNumbers(arr1));
		
		int[] arr2 = { 1, 2, 3 };
		System.out.println(threeIncreasingAdjacentNumbers(arr2));
		
		int[] arr3 = { 1, 2, 4 };
		System.out.println(threeIncreasingAdjacentNumbers(arr3));
		
		int[] arr4 = { 1, 2, 4, 5, 7, 6, 5, 7, 7, 6 };
		System.out.println(threeIncreasingAdjacentNumbers(arr4));
		
		int[] arr5 = { -100, -99, -99, 100, 101, 102 };
		System.out.println(threeIncreasingAdjacentNumbers(arr5));
	}
	
	public static boolean threeIncreasingAdjacentNumbers(int[] arr) {
		
		//int[] arr = { 1, 4, 5, 6, 2};
		
		boolean isThreeIncreasingAdjacentNumbers = false;
		for (int i = 0; i < arr.length - 2; i ++) {
			if(arr[i] == arr[i+1] - 1 && arr[i+1] == arr[i+2] - 1) {
				isThreeIncreasingAdjacentNumbers = true;
			}
		}
		return isThreeIncreasingAdjacentNumbers;
		
	}

}
