package week2.classroom.assignments;

public class Palindrome {
	public static void main(String[] args) {
		//Declaring String text to store the value
		String text = "madam";
		
		//Declaring a another string rev to store the reversed value  
		String rev = "";
		
		//Converting the given string to the array
		char[] textArray = text.toCharArray();
		
		//Looping the textArray reversely
		for(int i=textArray.length-1;i >= 0;i--) {
			
			//Storing the reversed value in rev variable
			rev = rev + textArray[i];
		}
		
		//Conditional check between the text and reversed value 
		if(text.equalsIgnoreCase(rev)) {
			//Printing its palindrome
			System.out.println("Palindrome");
		}
		else {
			//Printing its not a plaindrome
			System.out.println("Not a palindrome");
		}
	}
}
