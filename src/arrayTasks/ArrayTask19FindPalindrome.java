package arrayTasks;

import java.util.Arrays;

public class ArrayTask19FindPalindrome {

	public static void main(String[] args) {
		/*
		 * 19. Given name array. find all the palindrome string then put into a new
		 * array. [] names = {"Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris",
		 * "Yasin", "Bob", "Inna", "Eve"}; ```
		 */

		String[] names = { "Anna", "Nalan", "Hannah", "Emma", "Aidai", "Ciris", "Yasin", "Bob", "Inna", "Eve" };
		String palindromes = "";
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];
			String reverse = "";
		
			for (int j = name.length() - 1; j >= 0; j--) {
				reverse += name.toLowerCase().charAt(j);
			}
			if (reverse.equals(name.toLowerCase())) {
				palindromes += name + ", ";
			}
		}
		//System.out.println(palindromes);
		
		String[] palindromesName = palindromes.split(", ");
		
		System.out.println(Arrays.toString(palindromesName));

	}

}
