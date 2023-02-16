package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask13ReverseArrayList {

	public static void main(String[] args) {
		// Write a program to reverse an arraylist

		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

		System.out.println(getReverseArrayList(input));

	}

	public static ArrayList<Integer> getReverseArrayList(ArrayList<Integer> input) {

		ArrayList<Integer> reverseInput = new ArrayList<>();

		int index = 0;
		for (int i = input.size() - 1; i >= 0; i--) {
			reverseInput.add(index++, input.get(i));
		}

		return reverseInput;

	}

}
