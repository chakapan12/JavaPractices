package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTask11SortingArrayList {

	public static void main(String[] args) {
		/*
		 * 11. Write a program that can sort and Arraylist of integer ascending order
		 * [3,2,1,6,5,4]
		 */

		ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3, 2, 1, 6, 5, 4));

		Collections.sort(input);

		System.out.println(input);

	}

}
