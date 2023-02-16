package stringtasks;

public class Task04CharactersCheck {
	
	public static void main(String[] args) {
		/*
		 write a program that can check if the first and last characters of the string are same 
		 ex: level output: same  
		 */
		
		String str = "level";
		
		char firstCharacter = str.charAt(0);
		char secendCharaters = str.charAt(str.length() - 1);
				
				
		if(firstCharacter == secendCharaters) {
			System.out.println("same");
		}
		else {System.out.println("not same");
		
		}
		
	}

}
