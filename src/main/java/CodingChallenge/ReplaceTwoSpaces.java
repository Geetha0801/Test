package CodingChallenge;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceTwoSpaces {

	public static void main(String[] args) {
		// get the string
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = src.nextLine();
				String updatedValue = replaceWithPattern(str, " ");
        System.out.println("****" + updatedValue);
        int length = updatedValue.length();
        System.out.println(removeTrailingSpace(updatedValue,length));
        
	}
		
		public static String replaceWithPattern(String str,String replace){
	         
	        Pattern ptn = Pattern.compile("\\s+");
	        Matcher mtch = ptn.matcher(str);
	        return mtch.replaceAll(replace);
	    }
		
		public static String removeTrailingSpace ( String iString , int length)
		{
			String newValue = iString;
			
		if(newValue.charAt(length-1) == ' ')
		{
			System.out.println("&&&&" + iString.substring(0, length-1));
			newValue = iString.substring(0, length-1);
			removeTrailingSpace(newValue, length-1);
		}
		return newValue;
		}
	     
        
//		while (iString.contains("  ")) {
//			iString.replaceAll("  ", " ");
//		}
//		System.out.println(iString);
//		//iString = iString.replaceAll("\\s+"," ");
//		System.out.println(iString);
//		int length = iString.length();
		//System.out.println(removeTrailingSpace(iString,length));
/*		
	}		
		public static String removeTrailingSpace ( String iString , int length)
		{
			
		if(iString.charAt(length) == ' ')
		{
			removeTrailingSpace(iString.substring(0, length-1), length-1);
		}
		return iString;*/

	}

