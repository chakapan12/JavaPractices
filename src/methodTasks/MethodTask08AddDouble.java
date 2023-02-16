package methodTasks;

import java.util.Arrays;

public class MethodTask08AddDouble {

	public static void main(String[] args) {
		// create a return method called addDouble that can add a double after the last
		// index of a double array
		
		double[] inputArr = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		double newElement = 6.0;
		System.out.println(Arrays.toString(addDouble(inputArr, newElement)));


	}

	public static double[] addDouble(double[] inputArr, double newElement) {

		double[] outputArr = new double[inputArr.length + 1];

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
