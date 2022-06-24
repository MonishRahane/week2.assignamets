package week2.classroom.assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		//Declaring the String 
		String test = "I am a software tester";
		
		//Splitting the string and storing it in array
		String[] splittedString = test.split(" ");
		
		//Declaring a variable to store the reversed string
		String reversedString = "";
		
		//Looping the array
		for (int i = 0; i < splittedString.length; i++) {
			
			//Conditional check to select even word
			if(i%2 !=0) {
				
				//Storing the selected even word in temp variable
				String temp = splittedString[i];
				
				//Reversing the string using reverse method in string buffer 
				StringBuffer reverse = new StringBuffer(temp).reverse();
				
				//concatenate and storing it in reversedString variable
				reversedString += reverse;
			}
			else {
				//concatenating the odd words to the reversedString variable
				reversedString += splittedString[i];
			}
			
			//concatenating the space in reversedString variable
			reversedString+=" ";
		}
		
		//Printing the reversed String
		System.out.println(reversedString);
		
	}
}
