package week2.classroom.assignments;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//Declaring two strings
		String text1 = "stops";
		String text2 = "potss";
		
		//Conditional check to check the length of two strings
		if(text1.length() == text2.length()) {
			
			//Converting the two strings into character array 
			char[] text1Array = text1.toCharArray();
			char[] text2Array = text2.toCharArray();
			
			//Sorting the converted arrays
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			
			/*logic1 using two loops
			boolean isAnagram = false;
			for(int i = 0; i < text1Array.length;i++) {
				for(int j = 0; j< text2Array.length;j++) {
					if(text1Array[i] == text2Array[j]) {
						isAnagram = true;
					}
				}
			}
			if(isAnagram == true) {
				System.out.println("Its an anagram");
			}*/
			
			//logic2 using equals method
			//Conditional check using the array equals method
			if(Arrays.equals(text1Array, text2Array)) {
				//Printing its an anagram
				System.out.println("Its a Anagram");
			}
			else {
				//Printing its not a anagram
				System.out.println("Not a Anagram");
			}
		}
		else {
			//Printing its not a anagram
			System.out.println("Not an Anagram");
		}
	}
}
