package methodTasks;

import java.util.Arrays;

public class MethodTask10AddChar {

	public static void main(String[] args) {
		// create a return method called addChar that can add a char after last index of
		// a char array

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		char newElement = 'f';
		System.out.println(Arrays.toString(addChar(arr, newElement)));

	}

	public static char[] addChar(char[] inputArr, char newElement) {

		char[] outputArr = new char[inputArr.length + 1];

		for (int i = 0; i < outputArr.length; i++) {
			if (i == outputArr.length - 1) {
				outputArr[outputArr.length - 1] = newElement;
			} else {
				outputArr[i] = inputArr[i];
			}
		}
		return outputArr;

	}

}
