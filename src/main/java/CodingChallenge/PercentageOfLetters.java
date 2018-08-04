package CodingChallenge;

import java.util.Scanner;

public class PercentageOfLetters {

	
		public static void main(String[] args) {
			
			 // Get the password from user
				Scanner src = new Scanner(System.in);
				System.out.println("Enter the string");
				String enteredPwd = src.nextLine();
				// Length of password entered
				double stringCount = enteredPwd.length();
				// extracting only  digits from password
				String digits = enteredPwd.replaceAll("[^0-9]", "");
				// length of digits in password
				double digitsCount = digits.length();
				// percentage of digits
				float digitsPer = (float)((digitsCount/stringCount)*100);
				// extracting only letters from password
				String lowerLetters = enteredPwd.replaceAll("[^a-z]", "");
				// length of letters in password
				double lLettersCount = lowerLetters.length();
				// percentage of lowercase
				float lLetterPer = (float)((lLettersCount/stringCount)*100);
				// extracting capital letters from password
				String capitalLetter = enteredPwd.replaceAll("[^A-Z]", "");
				// length of capital letters
				double cLettersCount = capitalLetter.length();
				// percentage of uppercase
				float cLetterPer = (float)((cLettersCount/stringCount)*100);
				//percentage of special characters
				float spcharper = 100-(digitsPer+lLetterPer+cLetterPer);				
				System.out.println(stringCount);
				System.out.println(digitsCount);
				System.out.println(lLettersCount);
				System.out.println(cLettersCount);
				System.out.println("Digits percentage: "+digitsPer);				
				System.out.println("Uppercase letters percentage: "+cLetterPer);				
				System.out.println("Lowercase letters "+lLetterPer);				
				System.out.println("Special characters percentage: "+spcharper);
				
				
				}

		
	}

