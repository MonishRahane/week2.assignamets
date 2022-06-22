package week2.classroom.assignments;

public class ReverseString {
	public static void main(String[] args) {
		//Declaring test variable to hold string
		String test = "feeling good";
		
		//Declaring test2 variable to store the reversed value
		String test2 = "";
		
		//Converting the string to character array
		char[] testArray = test.toCharArray();
		
		//Looping the test array reversely
		for (int i = testArray.length-1; i > 0; i--) {
			
			//Printing the reversed value
			System.out.print(testArray[i]);
		}
	}
}
