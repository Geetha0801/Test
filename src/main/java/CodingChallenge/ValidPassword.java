package CodingChallenge;

import java.util.Scanner;

public class ValidPassword {

	public static void main(String[] args) {
		
	 // Get the password from user
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the password");
		String enteredPwd = src.nextLine();
		// Length of password entered
		int count = enteredPwd.length();
		// extracting only  digits from password
		String digits = enteredPwd.replaceAll("[^0-9]", "");
		// length of digits in password
		int digitsCount = digits.length();
		// extracting only letters from password
		String letters = enteredPwd.replaceAll("[^a-zA-Z]", "");
		// length of letters in password
		int lettersCount = letters.length();
		// extracting capital letters from password
		String capitalLetter = enteredPwd.replaceAll("[^A-Z]", "");
		// length of capital letters
		int cLettersCount = capitalLetter.length();
		//validating valid password
		if(count<10)
		{
			System.out.println("Password must have atleast 10 characters");
		}
		else if(count != lettersCount+digitsCount)
		{
			System.out.println("Password must contain only letters and numbers");
		}
		else if((digitsCount < 2)||(lettersCount < 2))
		{
			System.out.println("Password must contain atleast 2 digits and 2 numbers");
		}
		else if(cLettersCount < 1)
		{
			System.out.println("Password must contain atleast one capital letter");
		}
		else
		{
			System.out.println("Valid Password");
		}
		
		}

}
