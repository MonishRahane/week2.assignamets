package week2.classroom.assignments;

public class FindTypes {
	public static void main(String[] args) {
		//Declaring a String test
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		//Declaring the variable to store the count types of the string 
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		//Converting the string into the array
		char[] testArray = test.toCharArray();
		
		//Traversing through each character using for loop
		for(int i = 0; i< testArray.length;i++) {
			
			//Declaring variable c to hold the values in testArray
			char c = testArray[i];
			
			//Conditional check whether the character is letter
			if(Character.isLetter(c)){
				//Incrementing letter value by 1 if condition is true
				letter+= 1;
			}
			
			//Conditional check whether the character is digit
			else if(Character.isDigit(c)) {
				
				//Incrementing num value by 1 if condition is true
				num+= 1;
			}
			
			//Conditional check whether the character is space 
			else if(Character.isSpaceChar(c)) {
				
				//Incrementing space value by 1 if condition is true
				space += 1;
			}
			else {
				//Incrementing specialChar value by 1 if condition is true
				specialChar+= 1;
			}
		}
		//Printing the count of letter,number,spaces and special character
		System.out.println("letter: "+letter);
		System.out.println("space: "+space);
		System.out.println("num: "+num);
		System.out.println("specialCharacter: "+specialChar);
	}
}
