package arrayListTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask03RemoveAll {

	public static void main(String[] args) {
		/*
		 * Remove all the element that has letter 'J' from the list. "Java", "Python",
		 * "JavaScript", "C#", "C++", "Java", "Java"
		 */

		ArrayList<String> words = new ArrayList<>(
				Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java", "Java"));

		for (int i = words.size() - 1; i >= 0; i--) {
			if (words.get(i).contains("J") || words.get(i).contains("j")) {
				words.remove(i);
			}

		}
		System.out.println(words);

	}

}
