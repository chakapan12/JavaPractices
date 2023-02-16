package methodTasks;

public class MethodTask11SumOfNumber {

	public static void main(String[] args) {
		/*
		 * 1. create a method that can find the sum of two numbers method name:
		 * sumOf2Numbers
		 * 
		 * 2. create a method that can find the sum of three numbers method name:
		 * sumOf3Numbers
		 * 
		 * 3. create a method that can find the sum of four numbers method name:
		 * sumOf4Numbers
		 */

		System.out.println(sumOf2NUmber(1, 2));

		System.out.println(sumOf3NUmber(1, 2, 3));

		System.out.println(sumOf4NUmber(1, 2, 3, 4));

	}

	public static int sumOf2NUmber(int num1, int num2) {
		return num1 + num2;
	}

	public static int sumOf3NUmber(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	public static int sumOf4NUmber(int num1, int num2, int num3, int num4) {
		return num1 + num2 + num3 + num4;
	}

	public static double sumOf2NUmber(double num1, double num2) {
		return num1 + num2;
	}

	public static double sumOf3NUmber(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

	public static double sumOf4NUmber(double num1, double num2, double num3, double num4) {
		return num1 + num2 + num3 + num4;
	}

}
