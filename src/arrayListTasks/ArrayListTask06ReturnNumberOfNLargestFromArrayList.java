package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListTask06ReturnNumberOfNLargestFromArrayList {

	public static void main(String[] args) {
		/*
		 * 6. write a program that can return the nth largest number from an arraylist
		 * 
		 * arraylist = {1,2,3,4,5,6,7, 7 ,8, 8} n = 5
		 * 
		 * output: 4
		 */

		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
		
		Collections.sort(numbers, Collections.reverseOrder() );
		
		System.out.println(numbers);

//		System.out.println(getNumberOfnthLargestFromArrayList(numbers, 5));
	}

	public static int getNumberOfnthLargestFromArrayList(ArrayList<Integer> numbers, int nthLargest) {

		ArrayList<Integer> temp = new ArrayList<>();

		Collections.sort(numbers);

		//System.out.println(numbers);

		for (int i = 0; i < numbers.size(); i++) {

			if (temp.indexOf(numbers.get(i)) == -1) {
				temp.add(numbers.get(i));
			}
		}
		// System.out.println(temp);

		while (nthLargest > temp.size() || nthLargest <= 0) {
			System.out.println("Enter nth Largest between 1 - " + temp.size());
			break;

		}
		
		int numberOfnthLargest = 0;
		
		if(nthLargest > 0 && nthLargest <= temp.size()) {

			numberOfnthLargest = temp.get(temp.size() - nthLargest);
		}	

		return numberOfnthLargest;

	}

}
