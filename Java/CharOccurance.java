package week2.classroom.assignments;

public class CharOccurance {
	public static void main(String[] args) {
		//Declaring the string
		String str = "welcome to chennai";
		
		//Initializing the count variable
		int count = 0;
		
		//Converting the string into character array
		char[] strArray = str.toCharArray();
		
		//Storing the length of the array in the length variable
		int length = str.length();
		
		//
		//Looping the converted array to the length of the array
		for (int i = 0; i < length; i++) {
			
			//Conditional check to verify that the array has char e
			if(strArray[i] == 'e') {
				
				//Incrementing the count
				count = count+1;
			}
		}
		//Printing the total count
		System.out.println(count);
	}
}
