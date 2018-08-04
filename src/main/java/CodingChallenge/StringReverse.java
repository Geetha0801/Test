package CodingChallenge;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner src =  new Scanner(System.in);
		String str = src.nextLine();
		
		String resultString = reverseString(str, "");
		System.out.println(resultString);

	}
	
	 public static String reverseString(String str, String str2)
	    {
		    
		 if (str.isEmpty())
	            return str2;
	        //Calling Function Recursively
	               
	        //length = length - 1;
		     int length = str.length();
		     
	      
	         return reverseString(str.substring(0, length-1), str2 + str.charAt(length-1));
	    }

}
