package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask09getUniqueString {

	public static void main(String[] args) {
		/*
		 * write a program that find the unique names from an arraylist of string names
		 * in the arraylist ==> Liam,
		 * Olivia,Emma,Sophia,James,Henry,Olivia,Emma,Sophia,James,Henry output =
		 * [Liam,Olivia,Emma,Sophia,James,Henry]
		 */

		ArrayList<String> names = new ArrayList<>(Arrays.asList("Liam", "Olivia", "Emma", "Sophia", "James", "Henry",
				"Olivia", "Emma", "Sophia", "James", "Henry"));

		System.out.println(removeDuplicateString(names));

	}

	public static ArrayList<String> removeDuplicateString(ArrayList<String> names) {

		ArrayList<String> uniqueName = new ArrayList<>();

		for (String eachName : names) {

			if (!uniqueName.contains(eachName)) {
				uniqueName.add(eachName);
			}

		}
		return uniqueName;

	}

}
