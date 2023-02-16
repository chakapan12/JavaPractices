package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask10RemoveDigitAndLetter {

	public static void main(String[] args) {
		/*
		 * 10. write a program that can remove the digits and letters from an array list
		 * of characters Arraylist ==> [1,3,a,&,d,4,2,1,d,4,0,6,7,7,f,d,w,r,3,4,!,@]
		 * output ==> &,!,@
		 */

		ArrayList<Character> input = new ArrayList<>(Arrays.asList('1', '3', 'a', '&', 'd', '4', '2', '1', 'd', '4',
				'0', '6', '7', '7', 'f', 'd', 'w', 'r', '3', '4', '!', '@'));

		//method 1
		System.out.println(removeDigitAndLetter1(input));
		 
		//method 2
		System.out.println(removeDigitAndLetter1(input));

	}

	public static ArrayList<Character> removeDigitAndLetter1(ArrayList<Character> input) {

		for (int i = input.size() - 1; i >= 0; i--) {
			if (Character.isLetterOrDigit(input.get(i))) {
				input.remove(i);
			}
		}

		return input;

	}

	public static ArrayList<Character> removeDigitAndLetter2(ArrayList<Character> input) {

		ArrayList<Character> output = new ArrayList<>();

		for (char eachletter : input) {

			if (!Character.isLetterOrDigit(eachletter)) {
				output.add(eachletter);
			}

		}
		return output;
	}

}
