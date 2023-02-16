package methodTasks;

import java.util.Arrays;

public class MethodTask14FizzBuzzReturn {

	public static void main(String[] args) {
		/*
		 * Write a program that returns a list of strings between two numbers but for
		 * multiples of 3 insert "Fizz" instead of number for multiples of 5 insert
		 * "Buzz" instead of number for multiples of 3 and 5 insert "FizzBuzz" instead
		 * of number - You will also need to create a divisibleBy method that accepts
		 * two integer number and return a boolean. Input: fizzBuzzGenerator(1,15);
		 * Output: ["1","2","Fizz","4","Buzz",...,"FizzBuzz"]
		 */

		System.out.println(Arrays.toString(fizzBuzzGenerator(1, 50)));
		

	}

	public static String[] fizzBuzzGenerator(int num1, int num2) {
		String[] outputArr = new String[num2 - num1 + 1];
		String output = "";

		int index = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				output = "FizzBuzz";
			} else if (i % 3 == 0) {
				output = "fizz";
			} else if (i % 5 == 0) {
				output = "Buzz";
			} else {
				output = "" + i;
			}
			outputArr[index++] = output;
		}
		return outputArr;

	}		

}
