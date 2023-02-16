package methodTasks;

public class MethodTask13FindMaximuminArray {

	public static void main(String[] args) {
		// Write a function that can find the maximum number from an int Array
		
		int[] arr = { 11000, 2, 13, 4, 5000 };
		
		System.out.println(getMaxNumber(arr));

	}
	
	public static int getMaxNumber(int[] arr) {
		
		int maxNumber = arr[0];
		
		for (int eachNumber : arr) {
			if (eachNumber > maxNumber) {
				maxNumber = eachNumber;
			}
		}
		return maxNumber;
	}

}
