package collectionTasks;

import java.util.ArrayList;

public class InterviewQuestionLongestSubstring {

	public static void main(String[] args) {
		/*
Interview Question - Longest Substring

Given a string s, find the length of the longest substring without repeating characters.

Example 1:

input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3
Notice that the answer mush be a substring, "pwke" is a subsequence and not a substring.

Constraints:

0 <= s.length <= 5 * 100000
s consists of English letters, digits, symbols and spaces.

		 */
		
		String input = "abcabcbb";
		System.out.println(longestSubstring(input));
		
		String input1 = "bbbbb";
		System.out.println(longestSubstring(input1));
		
		String input2 = "pwwkew";
		System.out.println(longestSubstring(input2));
	}
	
	public static int longestSubstring(String input) {
		ArrayList<Character> list = new ArrayList<>();
		int longestSub = 0;
		char[] arr = input.toCharArray();
		for(int i = 0; i < arr.length; i++ ) {
			list.add(arr[i]);
			for(int j = i+1; j < arr.length-1; j++) {
				if(!list.contains(arr[j])) {
					list.add(arr[j]);
				} else {
					break;		
				}
			}
			if(longestSub < list.size()) {
				longestSub = list.size();
			}
		
			list.clear();
		}	
		return longestSub;
		
	}

}
