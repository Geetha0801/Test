package CodingChallenge;

import java.util.Scanner;

public class UniqueCharacterInString {

	public static void main(String[] args) {
		//Declare the String		
		// get the input from user
		System.out.println("Enter the string");
		Scanner src = new Scanner(System.in);
		String givenString = src.nextLine();
		String uniqueString = "";
		// Loop to remove the repeating characters
		for(int i = 0;i < givenString.length(); i++)
		{
			if(uniqueString.indexOf(givenString.charAt(i))== -1)
					{
				      uniqueString = uniqueString+givenString.charAt(i);
					}
					
				
		}
		//printing the unique characters
	    System.out.println(uniqueString.replaceAll("\\s", ""));

	}

}
