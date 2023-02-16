package methodTasks;

import java.util.Arrays;

public class methodTask09AddString {

	public static void main(String[] args) {
		// create a return method called addString that can add a String after the last
		// index of a String array

		String[] color = { "red", "pink", "yellow", "green" };
		String newElement = "white";
		System.out.println(Arrays.toString(addString(color, newElement)));

	}

	public static String[] addString(String[] inputArr, String newElement) {

		String[] outputArr = new String[inputArr.length + 1];

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
