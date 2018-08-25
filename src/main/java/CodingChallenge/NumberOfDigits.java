package CodingChallenge;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		 System.out.println("Enter the string");
		 Scanner src = new Scanner(System.in);
		 String number = src.nextLine();
		 int length = number.length();
		 int i = 0 ,count = 0;
		 while(i <= length)
		 {
			 if(number.charAt(i)!='.')
			 {
				 i ++;
			 }
			 else
				 break;
		 }
         if(i == 5)
		 System.out.println("true");
         else
        	 System.out.println("false");
	}
}
