package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask08RemoveElements {

	public static void main(String[] args) {
		/*
		 * Create a class named RemoveElements: 8.1 Create a method that passes two
		 * parametetrs: an integer array and an integer index. the method removes the
		 * element at the given index of the array and returns the new array Ex: int[]
		 * arr = {10,20,30,40} removeElement(arr, 2) ==> {10, 20, 40} 8.2 Create a
		 * method that passes two parametetrs: a double array and an integer index. the
		 * method removes the element at the given index of the array and returns the
		 * new array
		 * 
		 * 
		 * 8.3 Create a method that passes two parametetrs: a char array and an integer
		 * index. the method removes the element at the given index of the array and
		 * returns the new array
		 * 
		 * 8.4 Create a method that passes two parametetrs: a String array and an
		 * integer index. the method removes the element at the given index of the array
		 * and returns the new array
		 */
		

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

		int index = 2;

		removeElementsIntegerArrayList(numbers, index);

		System.out.println(numbers);

	}

	public static ArrayList<Integer> removeElementsIntegerArrayList(ArrayList<Integer> numbers, int index) {

		numbers.remove(index);

		return numbers;
	}

	public static ArrayList<Double> removeElementsDoubleArrayList(ArrayList<Double> numbers, int index) {

		numbers.remove(index);

		return numbers;
	}

	public static ArrayList<Character> removeElementsCharArrayList(ArrayList<Character> numbers, int index) {

		numbers.remove(index);

		return numbers;
	}

}
